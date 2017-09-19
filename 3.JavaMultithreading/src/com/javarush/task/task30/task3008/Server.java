package com.javarush.task.task30.task3008;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Server {
    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<>();

    public static void sendBroadcastMessage(Message message) {
        Map<String, Connection> map = getConnectionMap();
        for (Map.Entry<String, Connection> pair: map.entrySet()) {
            try {
                pair.getValue().send(message);
            } catch (IOException e) {
                ConsoleHelper.writeMessage("Ошибка... sendBroadcastMessage");
            }
        }
    }

    private static class Handler extends Thread {
        Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
        }

        public void run() {
            String userName = "";
            ConsoleHelper.writeMessage("Установленное новое соединение: " + socket.getRemoteSocketAddress());
            try {
                Connection connection = new Connection(socket);
                userName = serverHandshake(connection);
                sendBroadcastMessage(new Message(MessageType.USER_ADDED, userName));
                sendListOfUsers(connection, userName);
                serverMainLoop(connection, userName);

            } catch (IOException e) {
                e.printStackTrace();
                ConsoleHelper.writeMessage("Ошибка...нет соединения");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                ConsoleHelper.writeMessage("Ошибка...нет соединения");
            }
            connectionMap.remove(userName);
            sendBroadcastMessage(new Message(MessageType.USER_REMOVED, userName));
            ConsoleHelper.writeMessage("Cоединение с удаленным адресом закрыто.");
        }

        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException {
            while (true) {
                connection.send(new Message(MessageType.NAME_REQUEST));
                Message message = connection.receive();
                if ((message.getType()).equals(MessageType.USER_NAME) && !(message.getData().isEmpty()) && !(connectionMap.containsKey(message.getData()))) {
                    connectionMap.put(message.getData(), connection);
                    connection.send(new Message(MessageType.NAME_ACCEPTED));
                    return message.getData();
                }
            }

        }
        private void sendListOfUsers(Connection connection, String userName) throws IOException {
            for (Map.Entry<String, Connection> pair: connectionMap.entrySet()) {
                if (!(pair.getKey().equals(userName))) {
                    connection.send(new Message(MessageType.USER_ADDED, pair.getKey()));
                }

            }
        }
        private void serverMainLoop(Connection connection, String userName) throws IOException, ClassNotFoundException {
            while (true) {
                Message message = connection.receive();
                if (message.getType() == MessageType.TEXT) {
                    sendBroadcastMessage(new Message(message.getType(), (userName + ": " + message.getData())));
                }
            }
        }

    }

    public static void main(String[] args) {
        int portSocket = ConsoleHelper.readInt();
        ConsoleHelper.writeMessage("Input server port: ");
        try {
            ServerSocket serverSocket = new ServerSocket(portSocket);
            ConsoleHelper.writeMessage("Сервер запущен");
            while (true) {
                try {
                    Socket clientSocket = serverSocket.accept();
                    Thread thread = new Handler(clientSocket);
                    thread.start();
                } catch (Exception e){
                    ConsoleHelper.writeMessage("Ошибка...сервер не запущен");
                    serverSocket.close();
                    break;
                }
            }
        } catch (IOException e) {
            ConsoleHelper.writeMessage("Ошибка...сервер не запущен");

        }

    }

    public static Map<String, Connection> getConnectionMap() {
        return connectionMap;
    }

    public static void setConnectionMap(Map<String, Connection> connectionMap) {
        Server.connectionMap = connectionMap;
    }
}

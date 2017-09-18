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
                System.out.println(e);
            }
        }
    }

    private static class Handler extends Thread {
        Socket socket;
        public Handler(Socket socket) {
            this.socket = socket;
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

    }

    public static void main(String[] args) {
        int portSocket = ConsoleHelper.readInt();
        try {
            ServerSocket serverSocket = new ServerSocket(portSocket);
            System.out.println("Сервер запущен");
            while (true) {
                try {
                    Socket clientSocket = serverSocket.accept();
                    Thread thread = new Handler(clientSocket);
                    thread.start();
                } catch (Exception e){
                    System.out.println(e);
                    serverSocket.close();
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println(e);

        }

    }

    public static Map<String, Connection> getConnectionMap() {
        return connectionMap;
    }

    public static void setConnectionMap(Map<String, Connection> connectionMap) {
        Server.connectionMap = connectionMap;
    }
}

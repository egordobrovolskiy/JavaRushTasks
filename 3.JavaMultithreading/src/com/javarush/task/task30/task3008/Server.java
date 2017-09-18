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

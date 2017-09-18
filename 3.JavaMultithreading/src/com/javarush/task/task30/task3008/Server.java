package com.javarush.task.task30.task3008;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
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
}

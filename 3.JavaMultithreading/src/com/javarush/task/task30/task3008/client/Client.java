package com.javarush.task.task30.task3008.client;

import com.javarush.task.task30.task3008.Connection;
import com.javarush.task.task30.task3008.ConsoleHelper;
import com.javarush.task.task30.task3008.Message;
import com.javarush.task.task30.task3008.MessageType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    protected Connection connection;
    private volatile boolean clientConnected = false;

    public static void main(String[] args) {
        Client client = new Client();
        client.run();
    }

    public void run() {
        Thread thread = getSocketThread();
        thread.setDaemon(true);
        thread.start();
        try {
            synchronized (this){
            wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            ConsoleHelper.writeMessage("Ошибка потока...");
            System.exit(1);
        }
        if (clientConnected) {
            ConsoleHelper.writeMessage("Соединение установлено. Для выхода наберите команду ‘exit’.");
            while (clientConnected) {
                String message = ConsoleHelper.readString();
                if (message.equals("exit")) {
                    break;
                } else {
                    if (shouldSendTextFromConsole()) {
                        sendTextMessage(message);
                    }
                }
            }
        } else ConsoleHelper.writeMessage("Произошла ошибка во время работы клиента.");

    }


    protected String getServerAddress() {

        ConsoleHelper.writeMessage("enter ip adress or localhost");
            return ConsoleHelper.readString();
    }

    protected int getServerPort() {

              ConsoleHelper.writeMessage("enter port number");
        return ConsoleHelper.readInt();
    }

    protected String getUserName() {

              ConsoleHelper.writeMessage("enter user name");
        return ConsoleHelper.readString();
    }

    protected boolean shouldSendTextFromConsole() {
        return true;
    }

    protected SocketThread getSocketThread() {
        return new SocketThread();
    }

    protected void sendTextMessage(String text) {
        try {
            connection.send(new Message(MessageType.TEXT, text));
        } catch (IOException e) {
            ConsoleHelper.writeMessage("Ошибка при отправке сообщения...");
            clientConnected = false;
        }
    }

    public class SocketThread extends Thread {

        protected void processIncomingMessage(String message) {
            ConsoleHelper.writeMessage(message);
        }

        protected void informAboutAddingNewUser(String userName) {
            ConsoleHelper.writeMessage(userName + " - присоединился к чату.");
        }

        protected void informAboutDeletingNewUser(String userName) {
            ConsoleHelper.writeMessage(userName + " - покинул чат.");
        }

        protected void notifyConnectionStatusChanged(boolean clientConnected) {
            synchronized (Client.this) {
                 Client.this.clientConnected = clientConnected;
                Client.this.notify();
            }
        }

        @Override
        public void run() {

        }
    }
}

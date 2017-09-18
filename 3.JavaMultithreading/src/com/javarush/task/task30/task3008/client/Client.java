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


    protected String getServerAddress() {
      //  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter ip adress or localhost");
    //    String ipAdress = ConsoleHelper.readString();
     //   if (ipAdress.equals("localhost")) {
            return ConsoleHelper.readString();
     //   } else return ipAdress;
    }

    protected int getServerPort() {
       // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

              System.out.println("enter port number");
        return ConsoleHelper.readInt();
    }

    protected String getUserName() {
      //  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

              System.out.println("enter user name");
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
            System.out.println(e);
            clientConnected = false;
        }
    }

    public class SocketThread extends Thread {

    }
}

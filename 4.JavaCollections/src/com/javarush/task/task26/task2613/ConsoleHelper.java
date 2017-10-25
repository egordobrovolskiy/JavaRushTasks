package com.javarush.task.task26.task2613;

import com.javarush.task.task26.task2613.exception.InterruptOperationException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.ResourceBundle;

public class ConsoleHelper {

    private static ResourceBundle res = ResourceBundle.getBundle(CashMachine.class.getPackage().getName()+".resources.common_en", Locale.ENGLISH);


    private static BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() throws InterruptOperationException {
        String result = "";
        try {
            result = bis.readLine();
            if (result.equals(res.getString("operation.EXIT"))) {
                throw new InterruptOperationException();
            }
        } catch (IOException ignore) {
        }
        return result;
    }

    public static String askCurrencyCode() throws InterruptOperationException {
        {
            String code = null;
            writeMessage(res.getString("choose.currency.code"));
            while (true) {
                code = readString();
                if (code.length() == 3)
                    break;
                else
                    writeMessage(res.getString("invalid.data"));

            }
            return code.toUpperCase();
        }
    }

    public static String[] getValidTwoDigits(String currencyCode) throws InterruptOperationException {
        writeMessage(String.format(res.getString("choose.denomination.and.count.format"), currencyCode));

        String[] input;
        while (true) {
            input = readString().split(" ");

            int nominal = 0;
            int total = 0;
            try {
                nominal = Integer.parseInt(input[0]);
                total = Integer.parseInt(input[1]);
            } catch (Exception e) {
                writeMessage(res.getString("invalid.data"));
                continue;
            }
            if (nominal <= 0 || total <= 0) {
                writeMessage(res.getString("invalid.data"));
                continue;
            }
            break;
        }
        return input;
    }

    public static Operation askOperation() throws InterruptOperationException {
        do {
            writeMessage("Choice operation:\n1) INFO\n2) DEPOSIT\n3) WITHDRAW\n4) EXIT");
            try {
                int choice = Integer.parseInt(readString());
                return Operation.getAllowableOperationByOrdinal(choice);
            } catch (IllegalArgumentException e) {
                writeMessage(res.getString("invalid.data"));
                continue;
            }
        } while (true);
    }
    public static void printExitMessage()
    {
        ConsoleHelper.writeMessage(res.getString("the.end"));
    }
}

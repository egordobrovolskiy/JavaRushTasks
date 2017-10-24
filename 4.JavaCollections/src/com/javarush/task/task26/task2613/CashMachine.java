package com.javarush.task.task26.task2613;

import com.javarush.task.task26.task2613.command.CommandExecutor;
import com.javarush.task.task26.task2613.exception.InterruptOperationException;

import java.io.IOException;
import java.util.Locale;

public class CashMachine {
    public static void main(String[] args) {

        try {
            Operation operation;

            do {
                operation = ConsoleHelper.askOperation();
                CommandExecutor.execute(operation);
            } while (operation != Operation.EXIT);
        } catch (InterruptOperationException e) {
            ConsoleHelper.writeMessage("Bay");
        }

//        Locale.setDefault(Locale.ENGLISH);
//        CurrencyManipulator currencyManipulator;
//        String code = ConsoleHelper.askCurrencyCode();
//        String[] strs = ConsoleHelper.getValidTwoDigits(code);
//        currencyManipulator = CurrencyManipulatorFactory.getManipulatorByCurrencyCode(code);
//        currencyManipulator.addAmount(Integer.parseInt(strs[0]), Integer.parseInt(strs[1]));
//        ConsoleHelper.writeMessage(String.valueOf(currencyManipulator.getTotalAmount()));
    }
}

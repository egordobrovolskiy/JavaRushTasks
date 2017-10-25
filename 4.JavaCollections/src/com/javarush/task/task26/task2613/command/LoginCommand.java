package com.javarush.task.task26.task2613.command;

import com.javarush.task.task26.task2613.CashMachine;
import com.javarush.task.task26.task2613.ConsoleHelper;
import com.javarush.task.task26.task2613.exception.InterruptOperationException;

import java.util.Enumeration;
import java.util.ResourceBundle;

class LoginCommand implements Command {

    private ResourceBundle validCreditCards = ResourceBundle.getBundle(CashMachine.class.getPackage().getName()+".resources.verifiedCards");

    @Override
    public void execute() throws InterruptOperationException {
        Enumeration<String> cardNumbers = null;

        while (true) {
            ConsoleHelper.writeMessage("Enter number of card");
            String cardNumber = ConsoleHelper.readString();
            ConsoleHelper.writeMessage("Enter pin-code");
            String pinCode = ConsoleHelper.readString();
            if (validCreditCards.containsKey(cardNumber)) {
                if (validCreditCards.getString(cardNumber).equals(pinCode)) {
                    ConsoleHelper.writeMessage("Hello");
                } else {
                    ConsoleHelper.writeMessage("Неверный PIN");
                    ConsoleHelper.writeMessage("Попробуйте ещё");
                    continue;
                }
            } else {
                ConsoleHelper.writeMessage("Неверная карта");
                ConsoleHelper.writeMessage("Попробуйте еще");
                continue;
            }
            break;
        }
    }
}
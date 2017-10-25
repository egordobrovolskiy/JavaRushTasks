package com.javarush.task.task26.task2613.command;

import com.javarush.task.task26.task2613.CashMachine;
import com.javarush.task.task26.task2613.ConsoleHelper;
import com.javarush.task.task26.task2613.exception.InterruptOperationException;

import java.util.Locale;
import java.util.ResourceBundle;

class LoginCommand implements Command {

    private ResourceBundle validCreditCards = ResourceBundle.getBundle(CashMachine.class.getPackage().getName()+".resources.verifiedCards", Locale.ENGLISH);
    private ResourceBundle res = ResourceBundle.getBundle(CashMachine.class.getPackage().getName()+".resources.login_en", Locale.ENGLISH);

    @Override
    public void execute() throws InterruptOperationException {

        ConsoleHelper.writeMessage(res.getString("before"));

        while (true) {
            ConsoleHelper.writeMessage(res.getString("specify.data"));
            ConsoleHelper.writeMessage("Enter number of card");
            String cardNumber = ConsoleHelper.readString();
            ConsoleHelper.writeMessage("Enter pin-code");
            String pinCode = ConsoleHelper.readString();
            if (validCreditCards.containsKey(cardNumber)) {
                if (validCreditCards.getString(cardNumber).equals(pinCode)) {
                    ConsoleHelper.writeMessage(String.format(res.getString("success.format"), cardNumber));
                } else {
                    ConsoleHelper.writeMessage(String.format(res.getString("not.verified.format"), cardNumber));
                    ConsoleHelper.writeMessage(res.getString("try.again.with.details"));
                    ConsoleHelper.writeMessage(res.getString("try.again.or.exit"));
                    continue;
                }
            } else {
                ConsoleHelper.writeMessage(String.format(res.getString("not.verified.format"), cardNumber));
                ConsoleHelper.writeMessage(res.getString("try.again.with.details"));
                ConsoleHelper.writeMessage(res.getString("try.again.or.exit"));
                continue;
            }
            break;
        }
    }
}
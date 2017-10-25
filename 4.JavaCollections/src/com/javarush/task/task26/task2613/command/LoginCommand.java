package com.javarush.task.task26.task2613.command;

import com.javarush.task.task26.task2613.ConsoleHelper;
import com.javarush.task.task26.task2613.exception.InterruptOperationException;

public class LoginCommand implements Command
{
    @Override
    public void execute() throws InterruptOperationException
    {
        String hardCodeCardNumber = "123456789012";
        String hardCodePinCode = "1234";

        while (true) {
            ConsoleHelper.writeMessage("Enter number of card");
            String cardNumber = ConsoleHelper.readString();
            ConsoleHelper.writeMessage("Enter pin-code");
            String pinCode = ConsoleHelper.readString();
            if (cardNumber.matches("\\d{12}") && pinCode.matches("\\d{4}")) {
                if (hardCodeCardNumber.equals(cardNumber) && hardCodePinCode.equals(pinCode)) {
                    ConsoleHelper.writeMessage("Welcome dear user!");
                    break;
                }
            } else {
                ConsoleHelper.writeMessage("Incorrect number of card or pin-code");
            }
        }
    }
}
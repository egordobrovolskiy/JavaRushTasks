package com.javarush.task.task26.task2613.command;

import com.javarush.task.task26.task2613.CashMachine;
import com.javarush.task.task26.task2613.ConsoleHelper;
import com.javarush.task.task26.task2613.CurrencyManipulator;
import com.javarush.task.task26.task2613.CurrencyManipulatorFactory;

import java.util.Locale;
import java.util.ResourceBundle;

class InfoCommand implements Command {

    private ResourceBundle res = ResourceBundle.getBundle(CashMachine.class.getPackage().getName()+".resources.info_en", Locale.ENGLISH);


    @Override
    public void execute() {
        boolean money = false;
        ConsoleHelper.writeMessage(res.getString("before"));
        for (CurrencyManipulator currency : CurrencyManipulatorFactory.getAllCurrencyManipulators())
            if (currency.hasMoney()) {
                if (currency.getTotalAmount() > 0) {
                    ConsoleHelper.writeMessage(currency.getCurrencyCode() + " - " + currency.getTotalAmount());
                    money = true;
                }
            }

        if (!money)
            ConsoleHelper.writeMessage(res.getString("no.money"));
    }
}

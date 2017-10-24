package com.javarush.task.task26.task2613.command;

import com.javarush.task.task26.task2613.ConsoleHelper;
import com.javarush.task.task26.task2613.CurrencyManipulator;
import com.javarush.task.task26.task2613.CurrencyManipulatorFactory;
import com.javarush.task.task26.task2613.exception.InterruptOperationException;
import com.javarush.task.task26.task2613.exception.NotEnoughMoneyException;

import java.util.ConcurrentModificationException;
import java.util.Map;

class WithdrawCommand implements Command {
    @Override
    public void execute() throws InterruptOperationException {
        String currencyCode = ConsoleHelper.askCurrencyCode();
        CurrencyManipulator manipulator = CurrencyManipulatorFactory.getManipulatorByCurrencyCode(currencyCode);
            while (true) {
                try {
                ConsoleHelper.writeMessage("Введите сумму:");
                int sum = Integer.parseInt(ConsoleHelper.readString());
                if (sum <= 0) {
                    throw new NumberFormatException();
                }
                if (!manipulator.isAmountAvailable(sum)) {
                    ConsoleHelper.writeMessage("Недостаточно средств!");
                    continue;
                }
                Map<Integer, Integer> currencyMap = manipulator.withdrawAmount(sum);
                for (Map.Entry<Integer, Integer> pair : currencyMap.entrySet()) {
                    ConsoleHelper.writeMessage("\t" + pair.getKey() + " - " + pair.getValue());
                }
                ConsoleHelper.writeMessage("Транзакция прошла успешно.");
                break;
            } catch(NumberFormatException e ){
                ConsoleHelper.writeMessage("Введены некорректные данные.");
            }
            catch(NotEnoughMoneyException e)
            {
                ConsoleHelper.writeMessage("В банкомате недостаточно банкнот.");
            }
            catch(ConcurrentModificationException ignore){
            }
        }
    }
}

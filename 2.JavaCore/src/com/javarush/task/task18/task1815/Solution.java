package com.javarush.task.task18.task1815;

import java.util.List;

/* 
Таблица
Измени класс TableInterfaceWrapper так, чтобы он стал Wrapper-ом для ATableInterface.
Метод setModel должен вывести в консоль количество элементов в новом листе перед обновлением модели.
Метод getHeaderText должен возвращать текст в верхнем регистре — используйте метод toUpperCase().
*/

public class Solution {
    public class TableInterfaceWrapper implements ATableInterface {
        private ATableInterface aTab;

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            aTab.setModel(rows);
        }

        @Override
        public String getHeaderText() {
            return aTab.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            aTab.setHeaderText(newHeaderText);
        }

        public TableInterfaceWrapper (ATableInterface aT) {
            this.aTab = aT;
        }

    }

    public interface ATableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}
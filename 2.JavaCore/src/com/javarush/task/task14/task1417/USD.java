package com.javarush.task.task14.task1417;

/**
 * Created by Антон on 28.02.2017.
 */
public class USD extends Money {
    public String getCurrencyName() {
        return "USD";
    }
    public USD(double amount) {
        super(amount);
    }
}

package com.javarush.task.task14.task1408;

/**
 * Created by Антон on 17.02.2017.
 */
public abstract class Hen {
    abstract int getCountOfEggsPerMonth();
    String getDescription() {
        return "Я - курица.";
    }
}

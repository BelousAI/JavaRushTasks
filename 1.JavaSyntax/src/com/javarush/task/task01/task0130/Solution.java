package com.javarush.task.task01.task0130;

/* 
Наш первый конвертер!
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertCelsiumToFahrenheit(40));
    }

    public static double convertCelsiumToFahrenheit(int celsium) {
        double fahrenheit = (double)celsium * 9/5 + 32;
        return fahrenheit;//напишите тут ваш код
    }
}
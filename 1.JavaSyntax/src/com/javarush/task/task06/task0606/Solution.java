package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());

        while (number > 0) {
            if (number % 2 == 0) {
                even++;//напишите тут ваш код
            }
            else odd++;
            number /= 10;
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}

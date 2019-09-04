package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        FileInputStream inputStream = new FileInputStream(name);
        long minOfBytes = inputStream.read();

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            minOfBytes = minOfBytes < data ? minOfBytes : data;
        }

        inputStream.close();
        System.out.println(minOfBytes);
    }
}

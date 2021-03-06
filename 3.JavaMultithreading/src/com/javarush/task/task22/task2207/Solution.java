package com.javarush.task.task22.task2207;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/* 
Обращенные слова
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) {
        Path file;
        ArrayList<String> list = new ArrayList<>();
        Pair pair;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            file = Paths.get(reader.readLine());
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                list.add(scanner.next());
            }

            for (int i = 0; i < list.size() - 1; i++) {
                String str = list.get(i);
                for (int j = i + 1; j < list.size() - 1; j++) {
                    StringBuilder sb = new StringBuilder(list.get(j));

                    if (str.equals(sb.reverse().toString())) {
                        pair = new Pair();
                        pair.first = str;
                        pair.second = list.get(j);
                        result.add(pair);
                        list.remove(i);
                    }
                }
            }
            //System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class Pair {
        String first;
        String second;

        public Pair() {}

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                        first == null ? second :
                            second == null ? first :
                                first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}

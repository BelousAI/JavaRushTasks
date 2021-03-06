package com.javarush.task.task20.task2017;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* 
Десериализация
*/
public class Solution implements Serializable {
    public A getOriginalObject(ObjectInputStream objectStream) {
        try {
            Object a = objectStream.readObject();
            if (a instanceof A) {
                return (A)a;
            }
            else return (B) a;
        } catch (Exception e) {
            System.out.println("Произошло исключение!");
            return null;
        }
    }

    public class A implements Serializable {
    }

    public class B extends A {
        public B() {
            System.out.println("inside B");
        }
    }

    public static void main(String[] args) {

    }
}

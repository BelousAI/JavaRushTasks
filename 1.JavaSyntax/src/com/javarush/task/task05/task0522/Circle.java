package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(double x, double y) {
        this(x, y, 1);
    }

    public Circle(double x) {
        this(x, 1);
        this.radius = 2;
    }

    public Circle() {
        this(1, 1, 1);
    }//напишите тут ваш код


    public static void main(String[] args) {

    }
}
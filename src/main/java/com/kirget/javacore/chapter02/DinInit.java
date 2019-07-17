package com.kirget.javacore.chapter02;

public class DinInit {
    public static void main(String[] args) {
        double a = 3.0, b = 4.0;

        // динамическая инициализация переменной с
        double c = Math.sqrt( a * a + b * b);
        System.out.println("Гипотенуза равна:" + c);
    }
}

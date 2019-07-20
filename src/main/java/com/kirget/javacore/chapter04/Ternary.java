package com.kirget.javacore.chapter04;

// Продемонстрировать применение тернарной операции ?

public class Ternary {
    public static void main(String[] args) {

        int i, k;
        i = 10;
        k = i <0 ? -i: i;// полочить обсолютное значение переменной i
        System.out.print(" Абсолютное значение ");
        System.out.println( i + " равно " +k);

        i = -10;
        k = i < 0 ? -i: i; // получить обсолютное значение переменной i
        System.out.print( "Абсолютное значение ");
        System.out.print( " Абсолютное значение ");
        System.out.println( i + " равно " + k );

    }
}

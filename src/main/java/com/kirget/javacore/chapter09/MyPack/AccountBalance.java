package com.kirget.javacore.chapter09.MyPack;

//  Простой пакет MyPack

class Balance {
    String name;
    double ball;

    Balance (String n, double b) {
        name = n;
        ball = b;
    }

    void show () {
        if (ball < 0)
            System.out.print("--> ");
        System.out.println( name + ": $" + ball);
    }
}

public class AccountBalance {
    public static void main(String[] args) {
        Balance curent [] = new Balance[3];

        curent [0] = new Balance("K. J. Fielding", 123.23);
        curent [1] = new Balance("Will Tell", 157.02);
        curent [2] = new Balance("Tom Jackon", -12.33);

        for (int i = 0; i < 3; i++) curent[i].show();
    }
}

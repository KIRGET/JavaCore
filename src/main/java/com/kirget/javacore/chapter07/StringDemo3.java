package com.kirget.javacore.chapter07;

// Демонстрация применения массивов объектов типа String

import java.net.SocketOption;

public class StringDemo3 {
    public static void main(String[] args) {
        String str [] = {"--","Один","Два","Три"};
        for (int i = 0; i<str.length; i++)
            System.out.println("str ["+ i + " ]: " + str[i]);
    }
}

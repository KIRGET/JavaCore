package com.kirget.javacore.chapter05;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // подключение ввода с клавиатуры
        System.out.println(" Введите возраст ");
         int age = scanner.nextInt();
         switch (age){
             case 20 :
                 System.out.println(" Ты закончил школу");
                 break;
             case 30:
                 System.out.println(" Ты уже взрослый ");
                 break;
             case 40:
                 System.out.println(" О, теперь ты можешь изучать Java");
                 break;
              default:
                  System.out.println(" Попробуй ещё раз!");
         }

    }
}

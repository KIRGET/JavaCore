package com.kirget.javacore.chapter02;

import java.util.Scanner;

public class SimpleCalculate {
        public static void main(String[] args) {
            System.out.println("Input operftion");
            System.out.println("1. contraction");
            System.out.println("2. subtraction");
            System.out.println("3. multiplicaation");
            Scanner scanner = new Scanner(System.in);
            int operation = scanner.nextInt();
            System.out.println("input first number");
            int a = scanner.nextInt();
            System.out.println("input second number");
            int b = scanner.nextInt();
            int result;
            if (operation == 1) {
                result = a + b;
            }  else if (operation == 2) {
                result = a - b;
            } else {
                result = a * b;
            }
            System.out.println("result = "+ result);

        }

    }


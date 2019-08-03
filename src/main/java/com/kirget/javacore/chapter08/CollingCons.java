package com.kirget.javacore.chapter08;

// Демонстрация порядка вызова конструкторов


    class A1 {
        A1() {
            System.out.println("Внутри конструктора A1");
        }
    }

    // создать подкласс путем расширения класса A1
    class B1 extends A1 {
        B1() {
            System.out.println("Внутри конструктора В1");
        }
    }

    // создать подкласс путем расширения класса В
    class C extends B1 {
        C() {
            System.out.println("Внутри конструктора С");
        }
    }

public class CollingCons {
    public static void main(String[] args) {
        C c = new C();

    }
}

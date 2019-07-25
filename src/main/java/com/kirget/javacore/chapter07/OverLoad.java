package com.kirget.javacore.chapter07;

// Продемонстрировать перегрузку методов

class OverLoadDemo {
    void test () {
        System.out.println("Параметры отсутствуют ");
    }

    // Перегружаемый метод , проверяющий наличие
    // одного целочисленного параметра

    void test (int a) {
        System.out.println(" a:" + a);
    }

    // Перегружаемый метод, проверяющий наличие
    // двух целочисленных параметров

    void  test (int a, int b) {
        System.out.println(" a ,b "+ a +" " + b);
    }

    // Перегружаемый метод , проверяющий наличие
    // параметра типа douЬle

    double test (double a) {
        System.out.println(" double a:" + a);
        return a * a;
    }
}

public class OverLoad {
    public static void main(String[] args) {
        OverLoadDemo ob = new OverLoadDemo();
        double result;

        // вызвать все варианты метода test ()
        ob.test();
        ob.test(10);
        ob.test(10, 20);
        result = ob.test(123.25);
        System.out.println("Результат вызова ob.test(123.25) " + result);
    }
}

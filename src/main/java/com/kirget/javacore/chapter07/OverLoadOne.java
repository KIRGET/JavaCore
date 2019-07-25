package com.kirget.javacore.chapter07;

// Применить автоматическое преобразование типов к перегрузке

class OverLoadDemo1 {
    void test () {
        System.out.println(" Параметры отсутсвуют ");
    }

    // Перегружаемый ме тод , проверяющий наличие наличие
    // двух целочисленных параметров

    void test (int a, int b) {
        System.out.println( "a и b: "+ a +" " + b );
    }

    // Перегружаемый метод, проверяющий наличие
    // параметра типа douЬle

    void test (double a) {
        System.out.println(" Внутреннее преобразование при вызове test ( douЬle) а:"  + a);
    }

}

public class OverLoadOne {
    public static void main(String[] args) {
        OverLoadDemo1 ob = new OverLoadDemo1();
        int i = 88;

        ob.test();
        ob.test(10,20);

        ob.test(i); // здесь вызывается вариант метода test (douЬle)
        ob.test(123.2); // а здесь вызывается вариант метода test (douЬle)
    }
}

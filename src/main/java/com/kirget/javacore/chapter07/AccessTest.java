package com.kirget.javacore.chapter07;

// В этой программе демонстрируется разница между public и private

class Test4 {
    int a;         // дсотуп по умолчанию
    public int b;  // открытый доступ
    private int c; // закрытый доступ

    // методы доступа к члену с данного класса
    void setC (int i) { // установить значение члена с данного класса
        c = i;
    }

    int getC () { // получить значение челена с данного класса
        return c;
    }
}

public class AccessTest {
    public static void main(String[] args) {
        Test4 ob = new Test4();
        // Эти операторы правильны поэтому члены a и b доступны непосредственно
        ob.a = 10;
        ob.b = 20;

        // Этот орератор не верен поэтому может возникнуть ошибка
        // ob.c = 100; // ОШИБКА

        // Доступ к члену данного класса должен осуществлятся с помощью её класса
        ob.setC(100); //ВЕРНО!
        System.out.println("a,b, и c:" + ob.a + " " + ob.b + " " + ob.getC());
    }
}

package com.kirget.javacore.chapter08;

// Пример Наследования ( SimpleInheritance );

class A {
    int i,j;

    void showij () {
        System.out.println(" i и j :" + i + " " + j);

    }
}
 // создать подкласс B путем расширения каласса A

class B extends A {
    int k;

    void showk () {
        System.out.println (" k : " + k);
    }

    void sum() {
        System.out.println("i=j=k: "+(i+j+k));

    }
}


public class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B ();

        // суперкласс может использоваться самостоятельно

        superOb.i = 10;
        superOb.j = 20;
        System.out.println("содержимое пакета superOb: ");
        superOb.showij();
        System.out.println();

        // подкласс имеет доступ ко всем открытым членам своего суперкласса

        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("содержимое пакета subOb: ");
        subOb.showij();
        subOb.showk();

        System.out.println();
        System.out.println("Сумма i, j и k:  в объекте subOb");
    }
}

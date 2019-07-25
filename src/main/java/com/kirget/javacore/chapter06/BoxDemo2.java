package com.kirget.javacore.chapter06;

// В этой программе объявляются два объекта класса Вох
class Box2{
    double width;
    double height;
    double depth;
}


public class BoxDemo2 {
    public static void main(String[] args) {
        Box2 mybox1 = new Box2();
        Box2 mybox2 = new Box2();
        double vol;

        // присвоить значения переменным э кземпляра myЬox1
        mybox1.width = 10;
        mybox1.height = 15;
        mybox1.depth = 20;

        // присвоить другие значения переменным экземпляра mybox2
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // рассчитать объем первого параллелепипеда
        vol = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("Обьём равен " + vol);

        // рассчитать объем второго параллелепипеда
        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("Обьём равен " + vol);

    }
}

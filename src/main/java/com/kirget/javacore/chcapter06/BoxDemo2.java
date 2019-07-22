package com.kirget.javacore.chcapter06;

// В этой программе объявляются два объекта класса Вох
class Box2{
    double width;
    double height;
    double depth;
}


public class BoxDemo2 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        // присвоить значения переменным э кземпляра myЬox1
        mybox1.width = 10;
        mybox1.heigth = 15;
        mybox1.depth = 20;

        // присвоить другие значения переменным экземпляра mybox2
        mybox2.width = 3;
        mybox2.heigth = 6;
        mybox2.depth = 9;

        // рассчитать объем первого параллелепипеда
        vol = mybox1.width * mybox1.heigth * mybox1.depth;
        System.out.println("Обьём равен " + vol);

        // рассчитать объем второго параллелепипеда
        vol = mybox2.width * mybox2.heigth * mybox2.depth;
        System.out.println("Обьём равен " + vol);

    }
}

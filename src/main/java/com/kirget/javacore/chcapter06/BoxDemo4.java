package com.kirget.javacore.chcapter06;

// Теперь метод volume() возвращает объем параллелепипеда

class Box4 {
    double width;
    double height;
    double depth;

    // рассчитать и возвратить объем
    double volume () {
        return width * height * depth;
    }
}

public class BoxDemo4 {
    public static void main(String[] args) {
        Box4 mybox1 = new Box4();
        Box4 mybox2 = new Box4();
//        double vol;

        // присвоить значения переменным э кземпляра myЬox1
        mybox1.width = 10;
        mybox1.height = 15;
        mybox1.depth = 20;

        // присвоить другие значения переменным экземпляра mybox2
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // получить объем первого параллелепипеда
//        vol = mybox1.volume();
        System.out.println("Обьём равен " + mybox1.volume());

        // получить объем второго параллелепипеда
//        vol = mybox2.volume();
        System.out.println("Обьём равен " + mybox2.volume());

    }
}

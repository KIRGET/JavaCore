package com.kirget.javacore.chcapter06;
/* В данном примере программы для инициализации размеров
   параллелепипеда в классе Вох применяется конструктор */

class Box6 {
    double width;
    double height;
    double depth;

    // Это конструктор класса Вох

    Box6 () {
        System.out.println("Конструирование объекта Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    // рассчитать и возвратить объем

    double volume () {
        return width * height * depth;
    }
}


public class BoxDemo6 {
    public static void main(String[] args) {
        // объявить , выделить память и инициализировать объекты типа Вох
        Box6 mybox1 = new Box6();
        Box6 mybox2 = new Box6();

        double vol;

        // получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Объём равен " + vol);

        // получить объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объём равен " + vol);
    }
}

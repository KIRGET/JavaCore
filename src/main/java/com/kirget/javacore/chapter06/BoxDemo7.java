package com.kirget.javacore.chcapter06;

/*   В данном примере программы для инициализации размеров
     параллелепипеда в классе Вох применяется параметризированный
     конструктор
*/

class Box7 {
    double width;
    double height;
    double depth;

    // Это конструктор класса Вох

    Box7 (double w, double h, double d ) {
        width = w;
        height = h;
        depth = d;
    }

    // рассчитать и возвратить объем

    double volume () {
        return width * height * depth;
    }
}


public class BoxDemo7 {
    public static void main(String[] args) {
        // объявить , выделить память и инициализировать объе кты типа Вох
        Box7 mybox1 = new Box7(10, 20, 15);
        Box7 mybox2 = new Box7(3, 6, 9);

        double vol;

        // Получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Объём равен " + vol);

        // Получить объем вторго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объём равен " + vol);
    }
}

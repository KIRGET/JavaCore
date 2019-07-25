package com.kirget.javacore.chapter07;

// В данном примере конструкторы определяются в классе Вох для
// инициализации размеров параллелепипеда тремя разными способами

class Box {
    double width;
    double height;
    double depth;

    // конструктор , исполь зуемый при указании всех размеров

    Box (double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //  конструктор, используемый когда ни один из размеров не указан

    Box () {
        width = -1; // Использовать значение -1 для обозначения неинициализированного параллелепипида
        height = -1;
        depth = -1;
    }

    // конструктор используемый при создании куба
    Box (double len) {
        width = height = depth = len;
    }

    // расчитать и возвратить объём
    double volume () {
        return width * height * depth;
    }
}

public class OverLoadCons {
    public static void main(String[] args) {
        // Создать параллелепипиды используя разные конструкторы

        Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box ();
        Box mycube = new Box(7);

        double vol;

        // Получить объём первого параллелепипида

        vol = mybox1.volume();
        System.out.println(" Объём mybox1 равен " + vol);

        // Получить объём второго параллелепипида

        vol = mybox2.volume();
        System.out.println(" Объём mybox2 равен " + vol);

        // Получить объём куба

        vol = mycube.volume();
        System.out.println(" Объём mycube равен " + vol);

    }
}

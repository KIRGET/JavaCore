package com.kirget.javacore.chapter07;

// В этой версии класса Box один обоъект допускается инициализировать другим

class Box2 {
    double width;
    double height;
    double depth;

    // Обратите внимание на этот конструктор
    // В качестве параметра в нём используется объект типа Box2

    Box2 (Box2 ob) { // Передать объект конструктору
         width = ob.width;
         height = ob.height;
         depth = ob.depth;
    }

    // конструктор, используемый при указании всех размеров

    Box2 (double w, double h, double d) {
         width = w;
         height = h;
         depth = d;
    }

    // Конструктор, сли ни один из размеров не указан

    Box2 () {
         width = -1; // использовать значение -1 для
         height = -1; // неинициализированного
         depth = -1; // параллелепипида
    }

    // Конструктор используемый для создания куба

    Box2 (double len) {
        width = height = depth = len;
    }

    // Расчитьтать и возвратить объем

    double volume () {
        return width * height * depth;
    }
}

public class OverLoadCons2 {
    public static void main(String[] args) {
        // Создать параллелепипиды используюя различные конструктора

        Box2 mybox1 = new Box2(10, 20, 15);
        Box2 mybox2 = new Box2();
        Box2 mycube = new Box2(7);
        Box2 myclone = new Box2(mybox1);

        // Создать копию объекта mybox1
        double vol;

        // Получить объем первого параллелепипида
        vol = mybox1.volume ();
        System.out.println("Объем mybox1 равен :" + vol);

        // Получить объем первого параллелепипида
        vol = mybox2.volume ();
        System.out.println("Объем mybox2 равен :" + vol);

        // Получить объем куба
        vol = mycube.volume ();
        System.out.println("Объем mycube равен :" + vol);

        // Получить объем клона
        vol = myclone.volume ();
        System.out.println("Объем myclone равен :" + vol);

    }
}

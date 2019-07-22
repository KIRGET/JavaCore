package com.kirget.javacore.chcapter06;

// Присвоить исходному файлу имя BoxDemo.java

class Box {
    double width;
    double heigth;
    double depth;
}

class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;
        // присвоить значение переменным экземпляра mуЬох

        mybox.width = 10;
        mybox.heigth = 20;
        mybox.depth = 15;
        // рассчитать объем параллелепипеда
        vol = mybox.width * mybox.heigth * mybox.depth;
        System.out.println(" Обьём равен " + vol);
    }
}
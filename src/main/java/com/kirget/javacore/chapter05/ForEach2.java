package com.kirget.javacore.chapter05;

public class ForEach2 {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;

        //исполь зовать циkл в стиле for each для вывода и
        //суммирования значений

        for (int x : nums) {
            System.out.println(" Значение равно " + x);
            sum += x;
            if (x == 5) break;  // прервать цикл после
                               // получения 5 значений
        }
    }
}

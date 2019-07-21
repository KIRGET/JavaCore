package com.kirget.javacore.chapter05;

public class Search {
    public static void main(String[] args) {
        int nums[] = {6,8,5,9,3,10,4,1,};
        int val = 5;
        boolean found = false;

        // исполь зовать цикл for в стиле for each для
        //поиска значения переменной val в массиве nums

        for (int x : nums) {
            if (x == val) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println(" Значение найдено");
    }
}

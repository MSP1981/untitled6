package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner integr = new Scanner(System.in);
        int positives = 0;
        int [] array = {12, 104, 81};
                int sum = 0;
        for (int i = 0; i < array.length; i++){
            if (array [i] > 0) {
                sum += (array[i]);
                positives++;
            }
            System.out.println(sum);
            System.out.printf(" Кол-во положительных чисел: " + positives);
        }
    }
}

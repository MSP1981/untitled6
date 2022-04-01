package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива от 1 до 100 :");
        if (scanner.hasNextInt()) {
            int arrayLength = scanner.nextInt();
            if (arrayLength > 100) {
                System.out.println("Вы не верно ввели размер массива. Повторите ещё раз. ");
            } else {
                double[] array = new double[arrayLength];
                Random random = new Random();
                double a = -50.00;
                double b = 50.00;
                double sum = 0;

                for (int i = 0; i < array.length; i++) {
                    array[i] = a + random.nextDouble() * (b - a);
                    System.out.printf("%.2f ", array[i]);
                    sum += array[i];
                }
                double max = 0;
                double min = 0;
                double avg = 0;

                for (int i = 0; i < array.length; i++) {
                    if (max < array[i])
                        max = array[i];
                    if (min > array[i])
                        min = array[i];
                    avg = avg + array[i] / arrayLength;
                }
                System.out.println("\nМинимальный элемент массива: " + min);
                System.out.println("Максимальный элемент массива : " + max);
                System.out.println("Среднее арифметическое : " + avg);
            }
        }
    }
}
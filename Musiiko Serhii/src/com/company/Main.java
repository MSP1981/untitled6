package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите размер массива от 1 до 100 : ");
        if (input.hasNextInt()) {
            int arrLength = input.nextInt();

            if (arrLength > 100) {
                System.out.println("Вы не верно ввели размер массива. Повторите ещё раз. ");
            } else {
                Double[] arr = new Double[arrLength];
                Random random = new Random();

                double a = -50.00;
                double b = 50.00;
                double sum = 0;

                for (int i = 0; i < arr.length; i++) {
                    arr[i] = a + random.nextDouble() * (b - a);
                    System.out.printf("%.2f ", arr[i]);
                    sum += arr[i];
                }
                Double min = Collections.min(Arrays.asList(arr));
                Double max = Collections.max(Arrays.asList(arr));
                double average = sum / arr.length;

                System.out.println("\nМинимальный элемент массива: " + min);
                System.out.println("Максимальный элемент массива : " + max);
                System.out.println("Среднее арифметическое : " + average);
            }
        }
    }
}
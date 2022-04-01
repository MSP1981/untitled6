package com.company;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num = getInt();
        int degree = degreeInt();
        int power = PowA(num, degree);
        System.out.println("Result (" + num +" ^ " + degree +")= " + power);
    }

    public static int getInt() {
        System.out.print("Введите целое число : ");
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Вы ввели не целое число. Попробуйте еще раз.");
            scanner.next();
            num = getInt();
        }
        return num;
    }

    public static int degreeInt() {
        System.out.print("Введите степень : ");
        int degree;
        if (scanner.hasNextInt()) {
            degree = scanner.nextInt();
        } else {
            System.out.println("Вы ввели не целую степень. Попробуйте еще раз.");
            scanner.next();
            degree = getInt();
        }
        return degree;
    }

    public static int PowA(int num, int degree) {

        if (degree == 0)
            return 1;
        return PowA(num, degree - 1) * num;

    }
}


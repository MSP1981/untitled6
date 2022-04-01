package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner grade = new Scanner(System.in);
        System.out.print("Введите оценку по 12 бальной шкале :");
        int num = grade.nextInt();
        switch (num) {
            case 1: {
                System.out.println("Оценка 2");
                break;
            }
            case 2: {
                System.out.println("Оценка 2");
                break;
            }
            case 3: {
                System.out.println("Оценка 2");
                break;
            }
            case 4: {
                System.out.println("Оценка 3");
                break;
            }
            case 5: {
                System.out.println("Оценка 3");
                break;
            }
            case 6: {
                System.out.println("Оценка 3");
                break;
            }
            case 7: {
                System.out.println("Оценка 4");
                break;
            }
            case 8: {
                System.out.println("Оценка 4");
                break;
            }
            case 9: {
                System.out.println("Оценка 4");
                break;
            }
            case 10: {
                System.out.println("Оценка 5");
                break;
            }
            case 11: {
                System.out.println("Оценка 5");
                break;
            }
            case 12: {
                System.out.println("Оценка 5");
                break;
            }
            default: {
                System.out.println("Такой оценки нет. Введите ещё раз.");
            }
        }
    }
}


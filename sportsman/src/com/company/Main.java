package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sportsman = new Scanner(System.in);
        System.out.print("Введите количество подходов от 1 до 20 :");
        int n = sportsman.nextInt();
        if (n >= 1 && n <= 20) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum = sum + i;
            }
            System.out.println("Человек за выбранное количество подходов подтянулся = " + sum);
            int a = 5;
            int pullUp = sum * a;
            System.out.println("Время потраченное на подтягивание (секунд) = " + pullUp);
            int restTime = 60;
            restTime = restTime + (int) (restTime * 1.2);
            System.out.println("Время потраченное на перерыв между подходами (секунд) = " + restTime);
            int time = (pullUp + restTime) / 60;
            System.out.println("Общее время потраченное на подтягивание и отдых (минут/секунд) = " + time + ":"
                    + (pullUp + restTime) % 60);
        } else {
            System.out.println("Вы не верно ввели количество подходов. Повторите ещё раз.");
        }
    }
}
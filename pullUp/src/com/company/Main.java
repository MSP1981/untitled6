package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Введите количество подходов: ");
        Scanner sport = new Scanner(System.in);
        int pullUp = 0;
        int number = 0;
        int time = 0;
        int rest = 60;
        int totaltime = 0;
        int totalrest = 0;
        if ( sport.hasNextInt()) {
            int i = sport.nextInt();
            if ( i >= 1 && i <= 20) {
                for (pullUp = 1; pullUp <= i; pullUp++) {
                    number +=pullUp;
                    time= number*5;

                    totalrest = rest + (int) (rest * 1.2);
                }
                totaltime = time + totalrest;
                System.out.println(totaltime/60 + ":" + totaltime %60);
            }
        }
    }
}

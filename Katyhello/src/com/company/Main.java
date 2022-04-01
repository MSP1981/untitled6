package com.company;

import java.util.Scanner;

public class Main {
    public static int PowA(int x, int n) {
        if (n == 0)
            return 1;
        return PowA(x, n - 1) * x;
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("x = ");
        int x = myObj.nextInt();
        System.out.print("n = ");
        int n = myObj.nextInt();
        int pow = PowA(x, n);
        System.out.println("Pow(" + x + ", " + n + ") = " + pow);
    }
}



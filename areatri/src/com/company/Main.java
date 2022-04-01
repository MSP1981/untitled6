package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner areatri = new Scanner(System.in);

    System.out.print("Введите длину стороны а:");
    int sidea = areatri.nextInt();

    System.out.print("Введите длину стороны б:");
    int sideb = areatri.nextInt();

    double area = 0.5 * sidea * sideb;
    System.out.println("area=" + area);
    }
}

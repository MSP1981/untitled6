package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner indexbody = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Введите рост человека:");
        double growth = indexbody.nextDouble();

        System.out.print("Введите массу тела:");
        int bodymass = indexbody.nextInt();

        double indexbodymass = bodymass/(growth*growth);

        System.out.println("indexbodymass=" + indexbodymass);
    }
}

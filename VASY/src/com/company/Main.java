package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String city = scanner.nextLine();

            if (city.equals("Stop"))
                break;
            switch (city){
                case "Днепр":
                case "Киев":
                case "Львов":
                    System.out.println("Украина");
                    break;
            }

        }
    }
}





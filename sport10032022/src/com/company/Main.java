package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String city = scanner.nextLine();

            if (city.equals("Stop"))
                break;
            switch (city) {
                case "Киев":
                case "Днепр":
                case "Харьков":
                    System.out.println("Украина");
                    break;
                case "Лондон":
                case "Вест Хем":
                case "Ньюкасл":
                    System.out.println("Англия");
                    break;
                case "Милан":
                case "Рим":
                case "Венеция":
                    System.out.println("Италия");
                    break;
                default:
                System.out.println("Неизвестнная страна");
            }
        }
    }
}


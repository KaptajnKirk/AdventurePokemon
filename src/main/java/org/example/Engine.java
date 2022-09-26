package org.example;

import java.util.Map;
import java.util.Scanner;

public class Engine {
    Main main = new Main();

    public void game() {

        while (true) {
            System.out.println("Welcome to this game!");

            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine();

            switch (choice) {
                case "Go South", "S", "South" -> System.out.println("Going South");
                case "Go North", "N", "North" -> System.out.println("Going North");
                case "Go East", "E", "East" -> System.out.println("Going East");
                case "Go West", "W", "West" -> System.out.println("Going West");
                case "Look Around", "Look" -> System.out.println("Looking around");
                case "End", "End program", "Exit", "Exit program" -> {
                    System.out.println("Program ended");
                    System.exit(0);
                }
            }

        }
    }
}

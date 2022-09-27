package org.example;

import java.util.Scanner;

public class Adventure {

    private boolean run = true;

    Rooms room1 = new Rooms("RoomOne", "Description is here");

    private Rooms playerposition = room1;

    public void game() {

        System.out.println("Welcome to this game!");

        do {

            playerposition.setCurrentPosition(room1);
            playerposition.getName();
            playerposition.getDescription();

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
                    run = false;
                    System.exit(0);

                }
            }
        } while (run = true);
    }
}

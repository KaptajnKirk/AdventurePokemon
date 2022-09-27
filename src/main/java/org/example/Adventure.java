package org.example;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Adventure {

    private Map map;
  public Adventure() {
      map = new Map();
      playerposition = map.room1;
  }

    private Rooms playerposition = null;

    public void goEast(){
        playerposition = playerposition.getEast();
    }

    public void game() {

        System.out.println("Welcome to this game!");
        boolean run = true;

        do {


//            playerposition.setCurrentPosition(room1);

            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine();

            switch (choice) {
                case "Go South", "S", "South" -> System.out.println("Going South");
                case "Go North", "N", "North" -> System.out.println("Going North");
                case "Go East", "E", "East" -> goEast();
                case "Go West", "W", "West" -> System.out.println("Going West");
                case "Look Around", "Look" -> System.out.println(playerposition.getDescription());
                case "End", "End program", "Exit", "Exit program" -> {
                    System.out.println("Program ended");
                    run = false;
                    System.exit(0);

                }
            }
        } while (run = true);
    }
}

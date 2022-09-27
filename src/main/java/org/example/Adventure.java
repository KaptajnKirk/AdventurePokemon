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
      if (playerposition.getEast() == null)
        System.out.println("You cannot go this way");
      else
        playerposition = playerposition.getEast();
    }

    public void goNorth(){
      if (playerposition.getNorth() == null)
        System.out.println("You cannot go this way");
      else
        playerposition = playerposition.getNorth();
    }

  public void goSouth(){
    if (playerposition.getSouth() == null)
      System.out.println("You cannot go this way");
    else
      playerposition = playerposition.getSouth();
  }

  public void goWest(){
    if (playerposition.getWest() == null)
      System.out.println("You cannot go this way");
    else
      playerposition = playerposition.getWest();
  }



    public void game() {

        System.out.println("Welcome to this game!");
        boolean run = true;

        do {


//            playerposition.setCurrentPosition(room1);

            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine();

            switch (choice) {
                case "Go South", "S", "South" -> goSouth();
                case "Go North", "N", "North" -> goNorth();
                case "Go East", "E", "East" -> goEast();
                case "Go West", "W", "West" -> goWest();
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

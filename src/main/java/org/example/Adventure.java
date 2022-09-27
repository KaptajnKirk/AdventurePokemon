package org.example;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Adventure {

    private Map map;
    private UI ui;
  public Adventure() {
      map = new Map();
      ui = new UI();
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
                case "go south", "s", "south" -> goSouth();
                case "go north", "n", "north" -> goNorth();
                case "go east", "e", "east" -> goEast();
                case "Go west", "w", "west" -> goWest();
                case "help" -> ui.helpMenu();
                case "look around", "look" -> System.out.println(playerposition.getDescription());
                case "end", "end program", "exit", "exit program" -> {
                    System.out.println("Program ended");
                    run = false;
                    System.exit(0);

                }
            }
        } while (run = true);
    }
}

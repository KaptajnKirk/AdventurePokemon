package org.example;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Adventure {


    private UI ui;
    private Player player;
  public Adventure() {
      ui = new UI();
      player = new Player();
  }

    public void game() {

        System.out.println("Welcome to this game!");
        boolean run = true;

        do {
//            playerposition.setCurrentPosition(room1);

            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine();

            switch (choice) {
                case "go south", "s", "south" -> player.goSouth();
                case "go north", "n", "north" -> player.goNorth();
                case "go east", "e", "east" -> player.goEast();
                case "Go west", "w", "west" -> player.goWest();
                case "help" -> ui.helpMenu();
                case "look around", "look" -> System.out.println(player.getPlayerposition().getDescription());
                case "end", "end program", "exit", "exit program" -> {
                    System.out.println("Program ended");
                    run = false;
                    System.exit(0);

                }
            }
        } while (run = true);
    }
}

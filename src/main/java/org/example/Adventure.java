package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Adventure {


    private UI ui = new UI();

    Map map = new Map();

    Player player = new Player(map.getRoom1());

    Scanner scanner = new Scanner(System.in);
    private String input1;
    private String input2;




    public void choiceSplitter() {
        String choice = scanner.nextLine();
        if (choice.contains(" ")) {
            input1 = choice.substring(0, choice.indexOf(" ")).toLowerCase(Locale.ROOT);
            input2 = choice.substring((choice.indexOf(" ") + 1)).toLowerCase(Locale.ROOT);
        } else {
            input1 = choice.toLowerCase(Locale.ROOT);
            input2 = " ";
        }
    }

    public void movePrompt (){
        ui.nextMove();
        choiceSplitter();
    }


    public void game() {
        ui.gameIntro();
        movePrompt();
        while (true){
            switch (input1) {
                case "take" -> player.addToInventory(input2);
                case "help" -> ui.helpMenu();
                case "look" -> System.out.println(player.getPlayerposition().getDescription());
                case "go" -> {
                    switch (input2) {
                        case "north", "n" -> player.goNorth();
                        case "south", "s" -> player.goSouth();
                        case "east", "e" -> player.goEast();
                        case "west", "w" -> player.goWest();
                        default -> ui.directionNull();
                    }
                }
                case "exit" -> {
                    System.out.println("Program ended");
                    System.exit(0);
                }
            }
        }
    }
}

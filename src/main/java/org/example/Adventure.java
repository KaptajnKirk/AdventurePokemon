package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Adventure {


    UI ui = new UI();

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
        ui.playerHpStatus(player.getHp());
        ui.nextMove();
        choiceSplitter();
    }


    public void game() throws InterruptedException {
        ui.gameIntro();
        boolean run = true;

        while (run){
            movePrompt();
            switch (input1) {
                case "take" -> player.addToInventory(input2);
                case "inventory", "inv" -> player.displayInventory();
                case "drop", "discard" -> player.dropItem(input2);
                case "help" -> ui.helpMenu();
                case "look" -> player.lookCommandDescription();
                case "eat", "consume" -> player.eatItem(input2);
                case "choose", "use" -> player.choosePokemon(input2);
                case "attack" -> player.attack();
                case "go" -> {
                    switch (input2) {
                        case "north", "n" -> player.move(player.getCurrentPosition().getNorth());
                        case "south", "s" -> player.move(player.getCurrentPosition().getSouth());
                        case "east", "e" -> player.move(player.getCurrentPosition().getEast());
                        case "west", "w" -> player.move(player.getCurrentPosition().getWest());
                        default -> ui.invalidDirection();
                    }
                }
                case "exit" -> {
                    System.out.println("Program ended");
                    run = false;
                } default -> System.out.println("Invalid input");
            }
        }
    }
}

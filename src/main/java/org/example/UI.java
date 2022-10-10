package org.example;

public class UI {

    public void helpMenu() {
        System.out.println("These are the following commands you can use in the game: \n'go' followed by a direction; either 'north', 'east', 'south', 'west', Or 'e', 'w', 's' or 'n' to move \n'look' to look around the room \n'help' to show this menu \n'exit' to exit the game ");
    }

    public void directionNull(){
        System.out.println("You cannot go this way");
    }

    public void gameIntro(){
        System.out.println("Welcome to Pokémon gen 1.\nBeat all 8 Pokémon Gyms and collect your badges to enter Indigo Plateau,\nand the chance to battle the Elite four and the Pokémon champion!");
    }

    public void nextMove(){
        System.out.println("\n\n\nWhat do you want to do next?");
    }

}

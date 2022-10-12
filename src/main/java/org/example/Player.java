package org.example;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Player {
    private Rooms currentPosition;
    private boolean itemChecker;
    private ArrayList<Item> inventory;
    private Map map = new Map();
    private UI ui = new UI();
    private int hp;

    private String input1;
    private String input2;
    Scanner scanner = new Scanner(System.in);


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


    public Player(Rooms starterRoom) {
        this.currentPosition = starterRoom;
        this.inventory = new ArrayList<>();
        this.hp = 100;
    }

    public int getHp() {
        return hp;
    }

    public Rooms getCurrentPosition(){
        return currentPosition;
    }

    public void setCurrentPosition(Rooms currentRoom){
        this.currentPosition = currentRoom;
    }

    public void move(Rooms direction) throws InterruptedException  {
        if (direction == null) {
            ui.directionNull();
        } else {
            setCurrentPosition(direction);
            map.setCurrentRoom(direction);
            ui.roomDescription(currentPosition.getDescription());

        }
    }

//    public void goEast() {
//        if (playerposition.getEast() == null)
//            System.out.println("You cannot go this way");
//        else
//            playerposition = playerposition.getEast();
//    }
//
//    public void goNorth() {
//        if (playerposition.getNorth() == null)
//            System.out.println("You cannot go this way");
//        else
//            playerposition = playerposition.getNorth();
//    }
//
//    public void goSouth() {
//        if (playerposition.getSouth() == null)
//            System.out.println("You cannot go this way");
//        else
//            playerposition = playerposition.getSouth();
//    }
//
//    public void goWest() {
//        if (playerposition.getWest() == null)
//            System.out.println("You cannot go this way");
//        else
//            playerposition = playerposition.getWest();
//    }

    public void findItemDrop(String item){
        itemChecker = false;
        Item temp;
        for (int x = 0; x < inventory.size(); x++) {
            temp = inventory.get(x);
            if (item.equals(temp.getName())) {
                itemChecker = true;
                inventory.remove(temp);
                currentPosition.addItems(temp);
                x = inventory.size();
                System.out.println("You have dropped " + item + " on the floor!");
            }
        }
        if (!itemChecker) {
            System.out.println("You don't have " + item + " in your inventory!");
        }
    }

    public void addToInventory(String item) {
        if (item.equals(" ")) {
            System.out.println("Nothing in this room matches that description\nTry again!");
        } else {
            takeItem(currentPosition.getItems(),item);
        }
    }

    public void dropItem(String item) {
        if (item.equals(" ")) {
            System.out.println("You have nothing to drop that matches that description");
        } else {
            findItemDrop(item);
        }
    }

    public void displayInventory() {
        if (inventory.size() == 0) {
            System.out.println("Your inventory is currently empty");
        } else System.out.println("Inventory: " + inventory);
    }

    public void takeItem(ArrayList<Item> items, String item){
        Item temp;
        itemChecker = false;
        for (int x = 0; x < items.size(); x++) {
            temp = items.get(x);
            if (item.equals(temp.getName())) {
                itemChecker = true;
                inventory.add(temp);
                items.remove(x);
                x = items.size();
                System.out.println("You have added " + item + " to your inventory!");
            }
        }if (!itemChecker) {
            System.out.println("There is no " + item + " nearby!");
        }
    }

    public void lookCommandDescription () {
        ui.roomDescription(currentPosition.getDescription());
        itemsInRoom();
    }

    public void itemsInRoom() {
        if (currentPosition.getItems().size() > 0) {
            ui.roomItems(currentPosition.getItems());
        }
    }
}

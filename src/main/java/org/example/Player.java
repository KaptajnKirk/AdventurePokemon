package org.example;

import java.util.ArrayList;

public class Player {
    private Rooms playerposition;
    private boolean itemChecker;
    private ArrayList<Item> inventory;
    private Map map;
    private int hp;


    public Player(Rooms starterRoom) {
        this.playerposition = starterRoom;
        this.inventory = new ArrayList<>();
        this.hp = 100;
    }

    public Rooms getPlayerposition(){
        return playerposition;
    }

    public void goEast() {
        if (playerposition.getEast() == null)
            System.out.println("You cannot go this way");
        else
            playerposition = playerposition.getEast();
    }

    public void goNorth() {
        if (playerposition.getNorth() == null)
            System.out.println("You cannot go this way");
        else
            playerposition = playerposition.getNorth();
    }

    public void goSouth() {
        if (playerposition.getSouth() == null)
            System.out.println("You cannot go this way");
        else
            playerposition = playerposition.getSouth();
    }

    public void goWest() {
        if (playerposition.getWest() == null)
            System.out.println("You cannot go this way");
        else
            playerposition = playerposition.getWest();
    }

    public void addToInventory(String item) {
        if (item.equals(" ")) {
            System.out.println("Are you trying to pickup nothing?\nTry again!");
        } else {
            takeItem(playerposition.getItems(),item);
        }
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
}

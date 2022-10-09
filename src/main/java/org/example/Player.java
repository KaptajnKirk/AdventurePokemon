package org.example;

import java.util.ArrayList;

public class Player {
    private Rooms playerposition;

    private boolean itemChecker;

    private ArrayList<Item> inventory;
    private Map map;


    public Rooms getPlayerposition(){
        return playerposition;
    }


   /* public boolean move(String direction) {
        Rooms requestedRoom = null;

        if (direction.charAt(0) == 'n') {
            requestedRoom = playerposition.getNorth();
        } else if (direction.charAt(0) == 's') {
            requestedRoom = playerposition.getSouth();
        } else if (direction.charAt(0) == 'w') {
            requestedRoom = playerposition.getWest();
        } else if (direction.charAt(0) == 'e') {
            requestedRoom = playerposition.getEast();
        }

        if (requestedRoom!= null) {
            playerposition = requestedRoom;
            return true;
        } else {
          return false;
        }
    }*/

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

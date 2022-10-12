package org.example;

public class Map {

    private Rooms currentRoom;

    private Rooms room1 = new Rooms("Pewter City", "Pewter City is a small place in north west region of Kanto.\nIt houses the first available Pokémon gym, lead by a young man called Brock.\nThe cave east of town seems to be your way out of the city to continue your adventure.");
    private Rooms room2 = new Rooms("Cerulean City", "Cerulean city is a medium sized city in the north region of Kanto. \nHere Misty is the Gym leader, with her water type pokémon and short temper.\nThe bridge north of the city is currently under construction, making it impossible to go north.\n  ");
    private Rooms room3 = new Rooms("Lavender City ", "Description of room3 here");
    private Rooms room4 = new Rooms("Viridian City", "You entered Viridian City, a city with multiple houses, a lake and Pokémon Gym.\nThe Gym is currently locked, but maybe that will change in the future.\nIt looks like the only way out of town is to continue north through the forest");
    private Rooms room5 = new Rooms("Celadon City", "Description of room5 here");
    private Rooms room6 = new Rooms("Saffron City", "Description of room6 here");
    private Rooms room7 = new Rooms("Pallet Town", "You´re in a small town, with only a couple of houses and what looks like a lab.\nThe town is almost entirely surrounded by trees with a body of water in one end, and a small path at the other end of town.\nThere is a sign that says ´Welcome to Pallet Town´");
    private Rooms room8 = new Rooms("Vermillion City", "Description of room8 here");
    private Rooms room9 = new Rooms("Fuschia City", "Description of room9 here");

    private Item pokeball = new Item("masterball");

    private Food berries = new Food("berries", 20);


    //Getter for starting room
    public Rooms getRoom1() {
        return room1;
    }

    public void setCurrentRoom(Rooms currentRoom){
        this.currentRoom = currentRoom;
    }
    public Map() {

        //connecting Rooms
        room1.setEast(room2);
        room1.setSouth(room4);

        room2.setEast(room3);
        room2.setWest(room1);

        room3.setWest(room2);
        room3.setSouth(room6);

        room4.setNorth(room1);
        room4.setSouth(room7);

        room5.setSouth(room8);

        room6.setNorth(room3);
        room6.setSouth(room9);

        room7.setNorth(room4);
        room7.setEast(room8);

        room8.setWest(room7);
        room8.setNorth(room5);
        room8.setEast(room9);

        room9.setWest(room8);
        room9.setNorth(room6);

        //Adding Items to rooms;
        room1.addItems(pokeball);
        room3.addItems(pokeball);
        room6.addItems(pokeball);

        //Adding food to rooms;
        room1.addItems(berries);
        room4.addItems(berries);
        room5.addItems(berries);
    }


}

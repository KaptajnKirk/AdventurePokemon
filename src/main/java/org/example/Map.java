package org.example;

public class Map {

    private Rooms currentRoom;

    private Rooms room1 = new Rooms("Pewter City", "Pewter City is a small place in north west region of Kanto.\nIt houses the first available Pokémon gym, lead by a young man called Brock.\nThe cave east of town seems to be your way out of the city to continue your adventure.");
    private Rooms room2 = new Rooms("Cerulean City", "Cerulean city is a medium sized city in the north region of Kanto. \nHere Misty is the Gym leader, with her water type pokémon and short temper.\nThe bridge north of the city is currently under construction, making it impossible to go north.\n  ");
    private Rooms room3 = new Rooms("Lavender Town ", "The small town of Lavender, looks like any other small town \n but many believe it to be haunted. Other than a big radio tower, the town doesn´t offer much.");
    private Rooms room4 = new Rooms("Viridian City", "You entered Viridian City, a city with multiple houses, a lake and a Pokémon Gym.\nThe Gym is currently locked, but maybe that will change in the future.\nIt looks like the only way out of town is to continue north through the forest");
    private Rooms room5 = new Rooms("Celadon City", "Celadon city, the city that never sleeps. Visit the casino \n or check out the biggest marketplace in the region");
    private Rooms room6 = new Rooms("Saffron City", "One of the biggest cities in the region, but very little to do. \n Most people avoid the city do to it´s unwelcoming vibe");
    private Rooms room7 = new Rooms("Pallet Town", "You´re in a small town, with only a couple of houses and what looks like a lab.\nThe town is almost entirely surrounded by trees with a body of water in one end, and a small path at the other end of town.\nThere is a sign that says ´Welcome to Pallet Town´");
    private Rooms room8 = new Rooms("Vermillion City", "With a big harbour to the south and a beautiful coastline, Vermillion city has an electric vibe \n but something your path east looks to be blocked by something unknown.");
    private Rooms room9 = new Rooms("Fuschia City", "Known for it´s safari park, Fuschia city attracts a lot of hopeful pokemon trainers, \n but few a lucky to leave with the pokemon the came to catch.");

    //Placerholder testing item
    private Item pokeball = new Item("masterball");


    private Food berries = new Food("berries", 20);
    private Food pokepuffs = new Food("pokepuffs", 40);

    private RangedWeapon pikachu = new RangedWeapon ("pikachu", 40, 5);
    private RangedWeapon starmie = new RangedWeapon("starmie", 40, 2);
    private RangedWeapon onix = new RangedWeapon("onix", 60, 1);
    private RangedWeapon vileplume = new RangedWeapon("vileplume", 70, 7);
    private RangedWeapon kadabra = new RangedWeapon("kadabra", 40, 4);



    private MeleeWeapon geodude = new MeleeWeapon("geodude", 30);
    private MeleeWeapon ghastly = new MeleeWeapon("ghastly", 20);
    private MeleeWeapon bulbasaur = new MeleeWeapon("bulbasaur", 30);
    private MeleeWeapon koffing = new MeleeWeapon("koffing", 40);



    private Enemy brock = new Enemy("\n", "Brock", 30, geodude);
    private Enemy misty = new Enemy("\n", "Misty", 50, starmie);
    private Enemy arin = new Enemy("\n", "Arin", 50, ghastly);
    private Enemy giovanni = new Enemy("\n", "Giovanni", 70, onix);
    private Enemy erika = new Enemy("\n", "Erika", 150, vileplume);
    private Enemy sabrina = new Enemy("\n", "Sabrina", 40, kadabra);
    private Enemy professorOak = new Enemy("\n", "Professor Oak", 40, bulbasaur);
    private Enemy surge = new Enemy("\n", "Lt. Surge", 60, pikachu);
    private Enemy koga = new Enemy("\n", "Koga", 80, koffing);







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


        //Adding food to rooms;
        room1.addItems(berries);
        room1.addItems(pokepuffs);
        room2.addItems(berries);
        room3.addItems(berries);
        room4.addItems(berries);
        room4.addItems(berries);
        room5.addItems(berries);
        room6.addItems(berries);
        room6.addItems(pokepuffs);
        room7.addItems(berries);
        room7.addItems(pokepuffs);
        room8.addItems(berries);
        room8.addItems(berries);
        room9.addItems(berries);
        room9.addItems(pokepuffs);

        //Adding weapons to rooms;
        room1.addItems(pikachu);

        //Adding enemies to rooms;
        room1.addEnemy(brock);
        room2.addEnemy(misty);
        room3.addEnemy(arin);
        room4.addEnemy(giovanni);
        room5.addEnemy(erika);
        room6.addEnemy(sabrina);
        room7.addEnemy(professorOak);
        room8.addEnemy(surge);
        room9.addEnemy(koga);
    }


}

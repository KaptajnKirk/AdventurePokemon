package org.example;

public class Map {

  Rooms room1 = new Rooms("Room1","Description of room1 here");
  Rooms room2 = new Rooms("Room2","Description of room2 here");
  Rooms room3 = new Rooms("Room3","Description of room3 here");
  Rooms room4 = new Rooms("Room4","Description of room4 here");
  Rooms room5 = new Rooms("Room5","Description of room5 here");
  Rooms room6 = new Rooms("Room6","Description of room6 here");
  Rooms room7 = new Rooms("Room7","Description of room7 here");
  Rooms room8 = new Rooms("Room8","Description of room8 here");
  Rooms room9 = new Rooms("Room9","Description of room9 here");

public Map(){
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

}
}

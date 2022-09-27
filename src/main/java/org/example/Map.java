package org.example;

public class Map {

  Rooms room1 = new Rooms("Room1","Description here");
  Rooms room2 = new Rooms("Room2","Description here");
  Rooms room3 = new Rooms("Room3","Description here");
  Rooms room4 = new Rooms("Room4","Description here");
  Rooms room5 = new Rooms("Room5","Description here");
  Rooms room6 = new Rooms("Room6","Description here");
  Rooms room7 = new Rooms("Room7","Description here");
  Rooms room8 = new Rooms("Room8","Description here");
  Rooms room9 = new Rooms("Room9","Description here");

public Map(){
  room1.setCurrentPosition(room1);
  room1.setEast(room2);
  room1.setSouth(room4);
  room1.setWest(null);
  room1.setNorth(null);

  room2.setEast(room3);
  room2.setWest(room1);
  room2.setSouth(null);
  room2.setNorth(null);

  room3.setWest(room2);
  room3.setSouth(room6);
  room3.setNorth(null);
  room3.setEast(null);

  room4.setNorth(room1);
  room4.setSouth(room7);
  room4.setWest(null);
  room4.setEast(null);

  room5.setSouth(room8);
  room5.setWest(null);
  room5.setEast(null);
  room5.setNorth(null);

  room6.setNorth(room3);
  room6.setSouth(room9);
  room6.setEast(null);
  room6.setWest(null);

  room7.setNorth(room4);
  room7.setEast(room8);
  room7.setWest(null);
  room7.setSouth(null);

  room8.setWest(room7);
  room8.setNorth(room5);
  room8.setEast(room9);
  room8.setSouth(null);

  room9.setWest(room8);
  room9.setNorth(room6);
  room9.setSouth(null);
  room9.setEast(null);

}
}

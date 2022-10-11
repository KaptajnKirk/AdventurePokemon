package org.example;

public class Food extends Item{

  private int hp;

  public Food(String name, int hp){
    super(name);
    this.hp = hp;
  }

  public int getHp(){
    return hp;
  }
}

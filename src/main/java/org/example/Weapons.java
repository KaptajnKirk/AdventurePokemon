package org.example;

public abstract class Weapons extends Item {


  protected int dps;

  public Weapons(String name, int dps) {
    super(name);
    this.dps = dps;
  }

  public int getDps() {
    return dps;
  }

  public abstract int attack();

  public abstract void rangedAttack();
  public abstract int getAttacksLeft();


}

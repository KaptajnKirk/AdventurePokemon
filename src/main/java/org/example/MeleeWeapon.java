package org.example;

public class MeleeWeapon extends Weapons {

  public MeleeWeapon(String name, int dps){
    super(name, dps);
  }


  public int attack() {
    return dps;
  }

  @Override
  public void rangedAttack() {
    System.out.println("This pokemon cannot use a ranged attack");
  }

  @Override
  public int getAttacksLeft() {
    return -1;
  }
}

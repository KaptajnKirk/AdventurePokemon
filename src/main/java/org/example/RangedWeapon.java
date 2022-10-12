package org.example;

public class RangedWeapon extends Weapons {

  private int attacksLeft;

  public RangedWeapon(String name, int dps, int attacksLeft) {
    super(name, dps);
    this.attacksLeft = attacksLeft;
  }

  @Override
  public int attack() {
    return dps;
  }

  @Override
  public void rangedAttack() {
    attacksLeft -=1;
  }

  @Override
  public int getAttacksLeft() {
    return attacksLeft;
  }
}

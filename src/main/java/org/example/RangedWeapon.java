package org.example;

public class RangedWeapon extends Weapons {

  public RangedWeapon(String name) {
    super(name);
  }

  public RangedWeapon(String name, int dps) {
    super(name, dps);
  }

  @Override
  public int attack() {
    return 0;
  }
}

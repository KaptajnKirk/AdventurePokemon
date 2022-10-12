package org.example;

public class MeleeWeapon extends Weapons {
  public MeleeWeapon(String name) {
    super(name);
  }

  public MeleeWeapon(String name, int dps) {
    super(name, dps);
  }

  @Override
  public int attack() {
    return 0;
  }
}

package org.example;

public class Enemy {

  private String enemyDescription;
  private String enemyName;
  private int enemyHp;
  private Weapons enemyPokemon;

  public Enemy(String description, String name, int hp, Weapons enemyPokemon) {
    this.enemyDescription = description;
    this.enemyName = name;
    this.enemyHp = hp;
    this.enemyPokemon = enemyPokemon;
  }


  public String getEnemyDescription() {
    return enemyDescription;
  }

  public String getEnemyName() {
    return enemyName;
  }

  public int getEnemyHp() {
    return enemyHp;
  }

  public Weapons getEnemyPokemon() {
    return enemyPokemon;
  }

  public int getEnemyDamage(){
    return enemyPokemon.getDps();
  }

  @Override
  public String toString() {
    return enemyName;
  }

  public void damageTaken(int damage){
    this.enemyHp -= damage;
  }
}

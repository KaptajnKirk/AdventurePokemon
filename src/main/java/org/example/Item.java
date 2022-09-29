package org.example;

public class Item {

  protected String name;

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Item: " + name;
  }
}

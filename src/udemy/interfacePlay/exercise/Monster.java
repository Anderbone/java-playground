package udemy.interfacePlay.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Monster implements ISaveable {
  private String name;
  private int hitPoints;
  private int strength;

  public String getName() {
    return name;
  }

  public int getHitPoints() {
    return hitPoints;
  }

  public int getStrength() {
    return strength;
  }

  public Monster(String name, int hitPoints, int strength) {
    this.name = name;
    this.hitPoints = hitPoints;
    this.strength = strength;
  }

  @Override
  public List<String> write() {
    return new ArrayList<>(
        Arrays.asList("name=" + name, "hitPoints=" + hitPoints, "strength=" + strength));
  }

  @Override
  public void read(List<String> list) {
    if (list != null && !list.isEmpty()) {
      for (String pair : list) {
        int equalIndex = pair.indexOf("=");
        String key = pair.substring(0, equalIndex);
        String value = pair.substring(equalIndex + 1);
        switch (key) {
          case "name" -> this.name = value;
          case "hitPoints" -> this.hitPoints = Integer.parseInt(value);
          case "strength" -> this.strength = Integer.parseInt(value);
        }
      }
    }
  }

  @Override
  public String toString() {
    return "Monster{name='%s', hitPoints=%d, strength=%d}"
        .formatted(this.name, this.hitPoints, this.strength);
  }
}

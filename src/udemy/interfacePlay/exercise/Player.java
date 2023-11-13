package udemy.interfacePlay.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Player implements ISaveable{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	private int hitPoints;
	private int strength;
	private String weapon = "Sword";


	public Player(String name, int hitPoints, int strength) {
		this.name = name;
		this.hitPoints = hitPoints;
		this.strength = strength;
	}


	@Override
	public List<String> write() {
		return 	new ArrayList<>(Arrays.asList(
				"name='" + name + "'",
				"hitPoints=" + hitPoints,
				"strength=" + strength,
				"weapon='" + weapon + "'"));
	}

	@Override
	public void read(List<String> list) {
		if (list != null && !list.isEmpty()){
			for (String pair: list){
				int equalIndex = pair.indexOf("=");
				String key = pair.substring(0, equalIndex);
				String value = pair.substring(equalIndex + 1);
				switch (key){
					case "name" -> this.setName(value.substring(1, value.length() - 1));
					case "hitPoints" -> this.setHitPoints(Integer.parseInt(value));
					case "strength" -> this.setStrength(Integer.parseInt(value));
					case "weapon" -> this.setWeapon(value.substring(1, value.length() - 1));
				}

			}
		}
	}

	@Override
	public String toString(){
		return "Player{name='%s', hitPoints=%d, strength=%d, weapon='%s'}".formatted(
				this.name, this.hitPoints, this.strength, this.weapon
		);
	}
}

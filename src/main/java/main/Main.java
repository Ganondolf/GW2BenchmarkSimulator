package main;

import build.Strength;
import build.Trait;
import entity.Player;
import entity.Warrior;

public class Main {

	public static void main(String[] args) {
		try {
			Trait first = new Strength(3, 2, 2);
			Player player = new Warrior(first);
			System.out.println(player);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

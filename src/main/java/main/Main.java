package main;

import build.Discipline;
import build.Strength;
import build.Tactics;
import entity.Player;
import entity.Warrior;

public class Main {

	public static void main(String[] args) {
		try {
			Player warrior = new Warrior(new Strength(3, 2, 1), new Discipline(2, 1, 1), new Tactics(3, 3, 1));
			System.out.println(warrior);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

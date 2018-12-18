package main;

import java.lang.invoke.MethodHandles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import build.Discipline;
import build.Strength;
import build.Tactics;
import entity.Player;
import entity.Warrior;
import equip.WarriorAxe;
import equip.WeaponSet;

public class Main {

	private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	public static void main(String[] args) {
		try {
			Player warrior = new Warrior(new Strength(3, 2, 1), new Discipline(2, 1, 1), new Tactics(3, 3, 1));
			warrior.principalWeaponSet(new WeaponSet(new WarriorAxe(), new WarriorAxe()));
			logger.info("{}", warrior);
		} catch (Exception e) {
			logger.error("Exception while executing main", e);
		}
	}

}

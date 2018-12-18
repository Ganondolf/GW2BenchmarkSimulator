package entity;

import build.WarriorSpecialization;

public class Warrior extends Player {

	public Warrior() {
		this.profession = ProfessionEnum.WARRIOR;
	}

	public Warrior(WarriorSpecialization first, WarriorSpecialization second, WarriorSpecialization third) {
		this();
		this.first = first;
		this.second = second;
		this.third = third;
	}

}

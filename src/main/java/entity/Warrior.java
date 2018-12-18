package entity;

import build.ProfessionEnum;
import build.WarriorTraitline;

public class Warrior extends Player {

	public Warrior() {
		this.profession = ProfessionEnum.WARRIOR;
	}

	public Warrior(WarriorTraitline first, WarriorTraitline second, WarriorTraitline third) {
		this();
		this.first = first;
		this.second = second;
		this.third = third;
	}

}

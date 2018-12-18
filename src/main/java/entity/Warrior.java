package entity;

import build.WarriorSpecialization;

public class Warrior extends Player {

	public Warrior() {
		this.profession = ProfessionEnum.WARRIOR;
	}

	public Warrior(WarriorSpecialization firstSpec, WarriorSpecialization secondSpec, WarriorSpecialization thirdSpec) {
		this();
		this.firstSpec = firstSpec;
		this.secondSpec = secondSpec;
		this.thirdSpec = thirdSpec;
	}

}

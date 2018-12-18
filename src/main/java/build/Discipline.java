package build;

public class Discipline extends WarriorSpecialization {

	void minors() {
        this.specialization = SpecializationEnum.DISCIPLINE;
		this.minorAdept = WarriorTraitEnum.VERSATILE_RAGE;
		this.minorMaster = WarriorTraitEnum.FAST_HANDS;
		this.minorGrandMaster = WarriorTraitEnum.VERSATILE_POWER;
	}

	public Discipline(WarriorTraitEnum majorAdept, WarriorTraitEnum majorMaster, WarriorTraitEnum majorGrandMaster) {
		super(majorAdept, majorMaster, majorGrandMaster);
	}

	public Discipline(int majorAdept, int majorMaster, int majorGrandmaster) throws BuildInvalidException {
		switch (majorAdept) {
		case 1:
			this.majorAdept = WarriorTraitEnum.CRACK_SHOT;
			break;
		case 2:
			this.majorAdept = WarriorTraitEnum.WARRIORS_SPRINT;
			break;
		case 3:
			this.majorAdept = WarriorTraitEnum.VENGEFUL_RETURN;
			break;
		default:
			throw new BuildInvalidException("Invalid major adept trait " + majorAdept);
		}
		switch (majorMaster) {
		case 1:
			this.majorMaster = WarriorTraitEnum.INSPIRING_BATTLE_STANDARD;
			break;
		case 2:
			this.majorMaster = WarriorTraitEnum.DESTRUCTION_OF_THE_EMPOWERED;
			break;
		case 3:
			this.majorMaster = WarriorTraitEnum.BRAWLERS_RECOVERY;
			break;
		default:
			throw new BuildInvalidException("Invalid major master trait " + majorAdept);
		}
		switch (majorGrandmaster) {
		case 1:
			this.majorGrandMaster = WarriorTraitEnum.AXE_MASTERY;
			break;
		case 2:
			this.majorGrandMaster = WarriorTraitEnum.HEIGHTENED_FOCUS;
			break;
		case 3:
			this.majorGrandMaster = WarriorTraitEnum.BURST_MASTERY;
			break;
		default:
			throw new BuildInvalidException("Invalid major grandmaster trait " + majorAdept);
		}
	}

}

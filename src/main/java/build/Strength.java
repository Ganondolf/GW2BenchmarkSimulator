package build;

public class Strength extends WarriorSpecialization {

	void minors() {
		this.specialization = SpecializationEnum.STRENGTH;
		this.minorAdept = WarriorTraitEnum.RECKLESS_DODGE;
		this.minorMaster = WarriorTraitEnum.BUILDING_MOMENTUM;
		this.minorGrandMaster = WarriorTraitEnum.PINNACLE_OF_STRENGTH;
	}

	public Strength(WarriorTraitEnum majorAdept, WarriorTraitEnum majorMaster, WarriorTraitEnum majorGrandMaster) {
		super(majorAdept, majorMaster, majorGrandMaster);
	}

	public Strength(int majorAdept, int majorMaster, int majorGrandmaster) throws BuildInvalidException {
		switch (majorAdept) {
		case 1:
			this.majorAdept = WarriorTraitEnum.BRAVE_STRIDE;
			break;
		case 2:
			this.majorAdept = WarriorTraitEnum.RESTORATIVE_STRENGTH;
			break;
		case 3:
			this.majorAdept = WarriorTraitEnum.PEAK_PERFORMANCE;
			break;
		default:
			throw new BuildInvalidException("Invalid major adept trait " + majorAdept);
		}
		switch (majorMaster) {
		case 1:
			this.majorMaster = WarriorTraitEnum.BODY_BLOW;
			break;
		case 2:
			this.majorMaster = WarriorTraitEnum.FORCEFUL_GREATSWORD;
			break;
		case 3:
			this.majorMaster = WarriorTraitEnum.GREAT_FORTITUDE;
			break;
		default:
			throw new BuildInvalidException("Invalid major master trait " + majorAdept);
		}
		switch (majorGrandmaster) {
		case 1:
			this.majorGrandMaster = WarriorTraitEnum.BERSERKERS_POWER;
			break;
		case 2:
			this.majorGrandMaster = WarriorTraitEnum.MIGHT_MAKES_RIGHT;
			break;
		case 3:
			this.majorGrandMaster = WarriorTraitEnum.MERCILESS_HAMMER;
			break;
		default:
			throw new BuildInvalidException("Invalid major grandmaster trait " + majorAdept);
		}
	}

}

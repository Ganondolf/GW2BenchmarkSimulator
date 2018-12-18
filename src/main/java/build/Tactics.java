package build;

public class Tactics extends WarriorTraitline {

	void minors() {
        this.traitline = TraitlineEnum.TACTICS;
		this.minorAdept = WarriorTraitEnum.DETERMINED_REVIVAL;
		this.minorMaster = WarriorTraitEnum.REVIVERS_MIGHT;
		this.minorGrandMaster = WarriorTraitEnum.INSPIRING_PRESENCE;
	}

	public Tactics(WarriorTraitEnum majorAdept, WarriorTraitEnum majorMaster, WarriorTraitEnum majorGrandMaster) {
		super(majorAdept, majorMaster, majorGrandMaster);
	}

	public Tactics(int majorAdept, int majorMaster, int majorGrandmaster) throws BuildInvalidException {
		switch (majorAdept) {
		case 1:
			this.majorAdept = WarriorTraitEnum.LEG_SPECIALIST;
			break;
		case 2:
			this.majorAdept = WarriorTraitEnum.QUICK_BREATHING;
			break;
		case 3:
			this.majorAdept = WarriorTraitEnum.EMPOWERED;
			break;
		default:
			throw new BuildInvalidException("Invalid major adept trait " + majorAdept);
		}
		switch (majorMaster) {
		case 1:
			this.majorMaster = WarriorTraitEnum.SHRUG_IT_OFF;
			break;
		case 2:
			this.majorMaster = WarriorTraitEnum.BURNING_ARROWS;
			break;
		case 3:
			this.majorMaster = WarriorTraitEnum.EMPOWER_ALLIES;
			break;
		default:
			throw new BuildInvalidException("Invalid major master trait " + majorAdept);
		}
		switch (majorGrandmaster) {
		case 1:
			this.majorGrandMaster = WarriorTraitEnum.POWERFUL_SYNERGY;
			break;
		case 2:
			this.majorGrandMaster = WarriorTraitEnum.VIGOROUS_SHOUTS;
			break;
		case 3:
			this.majorGrandMaster = WarriorTraitEnum.PHALANX_STRENGTH;
			break;
		default:
			throw new BuildInvalidException("Invalid major grandmaster trait " + majorAdept);
		}
	}

}

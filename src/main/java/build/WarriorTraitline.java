package build;

public abstract class WarriorTraitline extends Traitline {

	public WarriorTraitline() {
		minors();
	}

	public WarriorTraitline(WarriorTraitEnum majorAdept, WarriorTraitEnum majorMaster, WarriorTraitEnum majorGrandMaster) {
		minors();
		this.majorAdept = majorAdept;
		this.majorMaster = majorMaster;
		this.majorGrandMaster = majorGrandMaster;
	}

}
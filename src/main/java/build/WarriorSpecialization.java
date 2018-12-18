package build;

public abstract class WarriorSpecialization extends Specialization {

	public WarriorSpecialization() {
		super();
	}

	public WarriorSpecialization(WarriorTraitEnum majorAdept, WarriorTraitEnum majorMaster, WarriorTraitEnum majorGrandMaster) {
		this.majorAdept = majorAdept;
		this.majorMaster = majorMaster;
		this.majorGrandMaster = majorGrandMaster;
	}

}
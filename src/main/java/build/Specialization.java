package build;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(fluent = true)
@Getter
@Setter
public abstract class Specialization {
	@Setter(AccessLevel.NONE)
	SpecializationEnum specialization;
	TraitEnum minorAdept;
	TraitEnum majorAdept;
	TraitEnum minorMaster;
	TraitEnum majorMaster;
	TraitEnum minorGrandMaster;
	TraitEnum majorGrandMaster;

	abstract void minors();

	public Specialization() {
		minors();
	}

	@Override
	public String toString() {
		return "Specialization " + specialization + " [" + minorAdept + ", " + majorAdept + ", " + minorMaster + ", "
				+ majorMaster + ", " + minorGrandMaster + ", " + majorGrandMaster + "]";
	}
}

package build;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(fluent = true)
@Getter
@Setter
public abstract class Traitline {
	@Setter(AccessLevel.NONE)
	TraitlineEnum traitline;
	TraitEnum minorAdept;
	TraitEnum majorAdept;
	TraitEnum minorMaster;
	TraitEnum majorMaster;
	TraitEnum minorGrandMaster;
	TraitEnum majorGrandMaster;

	abstract void minors();

	@Override
	public String toString() {
		return "Traitline [" + traitline + ", minorAdept=" + minorAdept + ", majorAdept=" + majorAdept
				+ ", minorMaster=" + minorMaster + ", majorMaster=" + majorMaster + ", minorGrandmaster="
				+ minorGrandMaster + ", majorGrandMaster=" + majorGrandMaster + "]";
	}
}

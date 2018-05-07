package build;

public class Trait {
	protected int minorAdept;
	protected int majorAdept;
	protected int minorMaster;
	protected int majorMaster;
	protected int minorGrandmaster;
	protected int majorGrandmaster;

	@Override
	public String toString() {
		return "Trait [minorAdept=" + minorAdept + ", majorAdept=" + majorAdept + ", minorMaster=" + minorMaster
				+ ", majorMaster=" + majorMaster + ", minorGrandmaster=" + minorGrandmaster + ", majorGrandmaster="
				+ majorGrandmaster + "]";
	}
}

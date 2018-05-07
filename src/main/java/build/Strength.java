package build;

public class Strength extends Trait {

	public Strength() {
		this.minorAdept = 1446;
		this.minorMaster = 1448;
		this.minorGrandmaster = 1453;
	}

	public Strength(int majorAdept, int majorMaster, int majorGrandmaster) throws BuildInvalidException {
		this();
		switch (majorAdept) {
		case 1:
			this.majorAdept = 1447;
			break;
		case 2:
			this.majorAdept = 1451;
			break;
		case 3:
			this.majorAdept = 1444;
			break;
		default:
			throw new BuildInvalidException("Major adept trait " + majorAdept);
		}
		switch (majorMaster) {
		case 1:
			this.majorMaster = 2000;
			break;
		case 2:
			this.majorMaster = 1338;
			break;
		case 3:
			this.majorMaster = 1449;
			break;
		default:
			throw new BuildInvalidException("Major master trait " + majorAdept);
		}
		switch (majorGrandmaster) {
		case 1:
			this.majorGrandmaster = 1437;
			break;
		case 2:
			this.majorGrandmaster = 1454;
			break;
		case 3:
			this.majorGrandmaster = 1440;
			break;
		default:
			throw new BuildInvalidException("Major grandmaster trait " + majorAdept);
		}
	}

}

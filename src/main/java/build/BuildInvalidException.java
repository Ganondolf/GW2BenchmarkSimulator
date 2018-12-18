package build;

public class BuildInvalidException extends Exception {

	private static final long serialVersionUID = -2540204371406436207L;

	public BuildInvalidException(String message) {
		super(message);
	}

	public BuildInvalidException(String message, Throwable cause) {
		super(message, cause);
	}

}

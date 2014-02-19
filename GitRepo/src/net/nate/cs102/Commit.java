package net.nate.cs102;

public class Commit {
	private final String message;
	private final Commit parent;

	public String getMessage() {
		return this.message;
	}

	public Commit getParent() {
		return this.parent;
	}

	public Commit(String message, Commit parent) {
		this.message = message;
		this.parent = parent;
	}
}

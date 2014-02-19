package net.nate.cs102;

public class GitRepo {
	private final String name;
	private Commit head;

	public Commit getHead() {
		return this.head;
	}

	public String getName() {
		return this.name;
	}

	public GitRepo(String name) {
		this.name = name;
	}

	public Commit doCommit(String message) {
		Commit newCommit = new Commit(message, head);
		this.head = newCommit;
		return newCommit;
	}
}

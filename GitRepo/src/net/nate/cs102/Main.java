package net.nate.cs102;

public class Main {
	public static void main(String[] args) {
		GitRepo newRepo = new GitRepo("New Repo");
		newRepo.doCommit("Initial Commit");
		System.out.println(newRepo.getHead());
	}
}

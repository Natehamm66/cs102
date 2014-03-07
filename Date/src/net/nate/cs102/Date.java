package net.nate.cs102;

public class Date {
	private int day;
	private int month;
	private int year;

	public Date() {
	}

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public static void main(String[] args) {
		Date Birthday = new Date(07, 07, 1996);
		System.out.println(Birthday.day + "/" + Birthday.month + "/" + Birthday.year);
	}
}

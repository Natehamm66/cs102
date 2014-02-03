package net.nate.hw1;

public class Main {
	public static boolean isTriangle(int a, int b, int c) {
		if (c > a + b || a > c + b || b > c + a) {
			return false;
		} else {
			return true;
		}

	}

	public static void main(String[] args) {
		if (isTriangle(7, 4, 3)) {
			System.out.println("It is a triangle");
		} else {
			System.out.println("It is not a triangle");
		}
	}
}
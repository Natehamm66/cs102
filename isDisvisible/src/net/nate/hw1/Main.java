package net.nate.hw1;

public class Main {

	public static boolean isDivisible(int m, int n) {
		return (m % n == 0); 
		}
	public static void main(String[] args) {
		if (isDivisible(6,3)) {
		    System.out.println("6 is divisible by 3!");
		} else {
		    System.err.println("Ooops... 6 should be divisible by 3");
		}
	}
}

package net.nate.cs102;

public class isAbecedarian {
	public static boolean isAbecedarian(String s) {
		char[] str = s.toCharArray();
		for (int i = 0; i < str.length - 1; i++) {
			int first = (int) str[i];
			int second = (int) str[i + 1];
			if (first > second) { // Compares first and second to see if they
									// are alphabetical
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		boolean isTrue = isAbecedarian("abc");
		if (!isTrue) {
			System.out.println("THIS AIN'T ABECEDARIAN");

		} else {
			System.out.println("THIS MOST CERTIANLY IS ABECETARIAN");
		}

	}
}

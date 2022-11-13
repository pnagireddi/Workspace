package assignment4;

public class Problem7 {

	// to count the number of consonants, vowels, special characters in a String.

	public static void main(String[] args) {
		String s = "aaaa";
		int count = 0;
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int j = 0;
			for (j = 0; j < ch.length; j++) {
				if (ch[i] != ch[j]) {
					break;
				}
			}
			if (j == ch.length) {
				count++;
			}

		}
		if (count == ch.length) {
			System.out.println("It's contain unique characters");
		} else {
			System.out.println("It's not contain unique characters");
		}

	}

}

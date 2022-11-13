package assignment4;

public class Problem4 {
// to count the number of consonants, vowels, special characters in a String.
	public static void main(String[] args) {

		String s = "Be#az%Io&q";
		s = s.toLowerCase();
		char[] ch = s.toCharArray();
		int vowels = 0;
		int consonants = 0;
		int charecters = 0;

		for (int i = 0; i < s.length(); i++) {

			if (ch[i] >= 'a' && ch[i] <= 'z') {
				if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
					vowels++;
				} else {
					consonants++;
				}
			} else {
				charecters++;

			}

		}
		System.out.println("vowels:" + " " + vowels);
		System.out.println("consonants:" + " " + consonants);
		System.out.println("Special characters:" + " " + charecters);

	}

}

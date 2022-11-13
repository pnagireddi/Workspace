package strings.Programs;

public class Anagram {

	public static void main(String[] args) {

		int count = 0;
		String s = "a gentle man";
		String ss = "elegant man ";
		String s1 = s.replace(" ", "");
		String ss1 = ss.replace(" ", "");
		char[] ch1 = s1.toCharArray();
		char[] ch2 = ss1.toCharArray();
		for (int i = 0; i < ch1.length; i++) {
			for (int j = 1; j < (ch1.length - i); j++) {

				if (ch1[j - 1] > ch1[j]) {
					char temp = ch1[j];
					ch1[j] = ch1[j - 1];
					ch1[j - 1] = temp;
				}
			}
		}

		System.out.println();
		for (int i = 0; i < ch2.length; i++) {
			for (int j = 1; j < (ch2.length - i); j++) {

				if (ch2[j - 1] > ch2[j]) {
					char temp = ch2[j];
					ch2[j] = ch2[j - 1];
					ch2[j - 1] = temp;
				}
			}
		}
		for (int i = 0; i < ch1.length; i++) {

			if (ch1[i] == ch2[i]) {
				count++;
			} else {
				System.out.println("it is not anagram");
			}

		}
		if (count == ch1.length) {
			System.out.println("it is anagaram");
		}
	}

}

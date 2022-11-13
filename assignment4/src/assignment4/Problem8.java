package assignment4;

public class Problem8 {
	// the maximum occurring character in a String.
	public static void main(String[] args) {
		String s = "ABCBACCCCDDEA";

		int count = 0;
		int max = 0;
		char ch = 'a';
		for (int i = 0; i < s.length(); i++) {
			for (int j = 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;
				}

			}
			if (count > max) {
				max = count;
				ch = s.charAt(i);

			}
			count = 0;

		}
		System.out.println("The maximum occurring character in a String: " + ch);

	}

}

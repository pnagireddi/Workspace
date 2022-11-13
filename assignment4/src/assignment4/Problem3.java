package assignment4;

public class Problem3 {

	public static void main(String[] args) {
		// To check "2552" is palindrome or not.

		String s = "2552";
		String empty = new String();
		for (int i = s.length() - 1; i >= 0; i--) {
			empty = empty + s.charAt(i);
		}

		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == empty.charAt(i)) {
				count++;
			} else {
				System.out.println("It is not palindrome");
				break;
			}

		}
		if (count == s.length()) {
			System.out.println("It is palindrome");
		}

	}

}

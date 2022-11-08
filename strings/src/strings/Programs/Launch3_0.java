package strings.Programs;

import java.util.Scanner;

public class Launch3_0 {

	public static void main(String[] args) {
		// Reverse the give string NAGI --->IGAN
		String ss = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter String");
		String s = scanner.nextLine();

		for (int i = s.length()-1; i >= 0; i--) {
			ss = ss + s.charAt(i);

		}
		System.out.println(ss);

	}

}

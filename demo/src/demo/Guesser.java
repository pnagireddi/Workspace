package demo;

import java.util.Scanner;

public class Guesser {

	int number;

	public int GivingNumberTOUmpire() {
		System.out.println("Please Guess the number :");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		int num = number;
		return num;
	}
}

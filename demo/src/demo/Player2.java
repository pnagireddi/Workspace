package demo;

import java.util.Scanner;

public class Player2 {
	int guessingNumber;

	public int guessingTheNumber() {
		System.out.println("Player2 Please enter the number which you guess");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		guessingNumber = scanner.nextInt();
		int num = guessingNumber;
		return num;
	}

}

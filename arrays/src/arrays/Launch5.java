package arrays;

import java.util.Scanner;

public class Launch5 {

	public static void main(String[] args) {
		/*
		 * when ever we have repeated task we will go for loops concept 
		 * here we are
		 * taking input from user 
		 * to store and print the marks of five students.
		 */
		int[] ar = new int[5];
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Students marks");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scanner.nextInt();
		}
		System.out.println(" Marks of students as follow");
		for (int i = 0; i < ar.length; i++) {

			System.out.print(ar[i]+" ");

		}
	}

}

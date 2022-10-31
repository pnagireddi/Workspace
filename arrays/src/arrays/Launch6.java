package arrays;

import java.util.Scanner;

public class Launch6 {

	public static void main(String[] args) {
		/* To store the marks of students for 3 classes each class having 4 students */

		int[][] ar = new int[3][4];
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < ar.length; i++) {

			for (int j = 0; j < ar[i].length; j++) {
				System.out.println("Enter the marks of class " + i +" "+ "student"+" "+j);
				ar[i][j] = scanner.nextInt();

			}
		}
		for (int i = 0; i < ar.length; i++) {

			for (int j = 0; j < ar[i].length; j++) {
				System.out.println("Marks of the student "+" "+j+ "class"+" "+ i);
				System.out.println(ar[i][j]+" ");

			}
			System.out.println();
		}
	}

}

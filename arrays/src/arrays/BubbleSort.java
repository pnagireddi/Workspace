package arrays;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {

		int a[] = new int[10];
		@SuppressWarnings("resource")
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Enter the size of an Array: ");
		System.out.println("*WARNING* Max Array size is 10 :");
		int n=scanner.nextInt();
		System.out.println("please enter elements of an Array:");
		for(int i=0;i<n;i++) {
			a[i]=scanner.nextInt();
		}
		

		for (int i = 0; i < a.length; i++) {

			for (int j = 1; j < (a.length - i); j++) {

				if (a[j - 1] > a[j]) {

					int temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;

				}

			}

		}

		for (int elements : a) {
			System.out.print(elements + " ");

		}

	}

}

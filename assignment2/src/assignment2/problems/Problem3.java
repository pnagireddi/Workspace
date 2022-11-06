package assignment2.problems;

public class Problem3 {

	public static void main(String[] args) {
		// Sorting the array by using Bubble sort

		int[] a = { 20, 40, 10, 30, 50 };
		System.out.println("Array before sorting:");
		for (int elements : a) {
			System.out.print(elements + " ");
		}

		for (int i = 0; i < a.length; i++) {

			for (int j = 1; j < a.length - i; j++) {

				if (a[j - 1] > a[j]) {
					int tem = a[j];
					a[j] = a[j - 1];
					a[j - 1] = tem;
				}

			}

		}
		System.out.println();
         System.out.println("Array after sorting:");
		for (int elements : a) {
			System.out.print(elements + " ");
		}

	}

}

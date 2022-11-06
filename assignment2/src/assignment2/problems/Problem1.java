package assignment2.problems;

public class Problem1 {
	// finding the duplicates present in an array.
	public static void main(String[] args) {

		int[] a = { 10, 20, 120, 40, 10, 20 };

		System.out.println("Duplicate elements in given array:");
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[j] == a[i]) {

					System.out.print(a[j] + " ");
				}

			}

		}

	}

}

package assignment2.problems;

public class Problem5 {

	// Sorting an array by using selection sort

	public static void main(String[] args) {

		int a[] = { 7, 4, 10, 8, 3, 1 };
		System.out.println("Array Before sorting:");
		for (int elements : a) {
			System.out.print(elements + " ");
		}
		int n = a.length;
		for (int i = 0; i < n - 1; i++) {

			int minimumValue = i;

			for (int j = i + 1; j < n; j++) {
				if (a[j] < a[minimumValue]) {
					minimumValue = j;
				}

			}
			if (minimumValue != i) {

				int temp = a[i];
				a[i] = a[minimumValue];
				a[minimumValue] = temp;

			}

		}
		System.out.println();
		System.out.println("Array after sorting:");
		for (int elements : a) {
			System.out.print(elements + " ");
		}

	}

}

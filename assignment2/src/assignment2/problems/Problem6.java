package assignment2.problems;

public class Problem6 {

	// checking whether an array is a subset of another array

	public boolean subset_arrays(int arr1[], int arr2[], int m, int n) {
		int i = 0;
		int j = 0;
		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++) {
				if (arr2[i] == arr1[j])
					break;
			}

			if (j == m)
				return false;
		}

		return true;
	}

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4, 5 };
		int arr2[] = { 3, 4, 5 };
		int m = arr1.length;
		int n = arr2.length;
		Problem6 subsetarray = new Problem6();
		if (subsetarray.subset_arrays(arr1, arr2, m, n)) {
			System.out.print("Array 2 is a subset of array 1");
		} else {
			System.out.print("Array 2 is not a subset of array 1");
		}
	}

}

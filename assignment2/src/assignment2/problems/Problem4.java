package assignment2.problems;

public class Problem4 {
	// sort an array using Merge Sort Algorithm.

	void merge(int a[], int lower, int mid, int upper) {
		int i, j, k;
		int n1 = mid - lower + 1;
		int n2 = upper - mid;

		/* temporary Arrays */
		int LeftArray[] = new int[n1];
		int RightArray[] = new int[n2];

		/* copy data to temp arrays */
		for (i = 0; i < n1; i++)
			LeftArray[i] = a[lower + i];
		for (j = 0; j < n2; j++)
			RightArray[j] = a[mid + 1 + j];

		i = 0; /* initial index of first sub-array */
		j = 0; /* initial index of second sub-array */
		k = lower; /* initial index of merged sub-array */

		while (i < n1 && j < n2) {
			if (LeftArray[i] <= RightArray[j]) {
				a[k] = LeftArray[i];
				i++;
			} else {
				a[k] = RightArray[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			a[k] = LeftArray[i];
			i++;
			k++;
		}

		while (j < n2) {
			a[k] = RightArray[j];
			j++;
			k++;
		}
	}

	void printArrray(int a[], int n) {

		int i;
		for (i = 0; i < n; i++) {
			System.out.print(a[i] + " ");

		}

	}

	void mergeSort(int a[], int lower, int upper) {
		if (lower < upper) {
			int mid = (lower + upper) / 2;
			mergeSort(a, lower, mid);
			mergeSort(a, mid + 1, upper);
			merge(a, lower, mid, upper);
		}
	}

	public static void main(String[] args) {

		int a[] = { 7, 6, 10, 5, 9, 1, 15 };

		int n = a.length;

		Problem4 ms = new Problem4();
		System.out.println("Array Before sorting :");
		ms.printArrray(a, n);

		ms.mergeSort(a, 0, n - 1);
		System.out.println();
		System.out.println("Array After sorting :");
		ms.printArrray(a, n);

	}

}

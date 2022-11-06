package arrays;


public class SelectionSort {

	public static void main(String[] args) {
		

		int a[] = { 7, 4, 10, 8, 3, 1 };
		System.out.println("Array Before sorting:");
		
		/*
		 * selection sort is working as find the minimunm value and swap the minmunm
		 * value with first index of an Array. for that we are using two loops one loop
		 * for passes which is outer loop by using this loop we are checking i=0 with
		 * Reaming values if minmunm value is not equal to i value then swap the i value
		 * with min value.
		 */
		for (int elements : a) {
			System.out.print(elements + " ");
		}
		int n = a.length;
		for (int i = 0; i < n - 1; i++) {

			int minimumValue = i;

			for (int j = i + 1; j < n; j++) {
				if (a[j] < a[minimumValue]) {
					/* if minmumvalue is j we can update the minmunm value with 
					j then check that value with reaming values*/
					minimumValue = j;
				}

			}
			if (minimumValue != i) {
               // which is using for swapping
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

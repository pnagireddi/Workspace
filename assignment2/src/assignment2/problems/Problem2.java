package assignment2.problems;


public class Problem2 {
	
	//sorting an array using Quick Sort Algorithm
	
	int partition(int a[], int start, int end) {
		
		int pivot = a[end]; // pivot element  
	    int i = (start - 1);  
	  
	    for (int j = start; j <= end - 1; j++)  
	    {  
	        // If current element is smaller than the pivot  
	        if (a[j] < pivot)  
	        {  
	            i++; // increment index of smaller element  
	            int t = a[i];  
	            a[i] = a[j];  
	            a[j] = t;  
	        }  
	    }  
	    int t = a[i+1];  
	    a[i+1] = a[end];  
	    a[end] = t;  
	    return (i + 1);  
	}  


void quick(int a[], int start, int end) {
	if (start < end) {
		int location = partition(a, start, end);
		quick(a, start, location - 1);
		quick(a, location + 1, end);
	}
}

void printArrray(int a[], int n) {

	int i;
	for (i = 0; i < n; i++) {
		System.out.print(a[i] + " ");

	}

}

public static void main(String[] args) {

	int[] a = { 7,6,10,5,9,2,1,15,7};
	int n = a.length;
	System.out.println("Array Before sorting :");
	Problem2 launch = new Problem2();
	launch.printArrray(a, n);
	launch.quick(a, 0, n - 1);
	System.out.println();
	System.out.println("Array After sorting :");
	launch.printArrray(a, n);

}
	}



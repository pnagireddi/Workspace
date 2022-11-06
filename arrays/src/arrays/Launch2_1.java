package arrays;

public class Launch2_1 {
	
	// To print 2 D array by using for-each loop or enhanced for loop.
	public static void main(String[] args) {
		
	
	int[][] ar= {{10,20,30},{30,40},{50,60,80,90}};
	
	for(int elements[]:ar) {
		
		for( int data:elements) {
		
		System.out.print(data+" ");
		
		}
		System.out.println();
		
	}
	}
}

package assignment1.problems;

public class Problem2 {

	public static void main(String[] args) {
       /* To print 1111
		           2222
		           3333
		           4444  */
		
		int n=5;
		for(int i=1;i<n;i++) {
			
			for(int j=0;j<(n-1);j++) {
				System.out.print(i);
			}
			System.out.println();
			
		}
	}

}

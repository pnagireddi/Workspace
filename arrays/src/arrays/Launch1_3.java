package arrays;

public class Launch1_3 {

	public static void main(String[] args) {
		/*
		 * create 3 dimensional jogged array
		 *  with 3 colleges 
		 *  in college one 2 classes in 1st class 3 students 
		 *                           in 2nd class 4 students
		 *  in college two 3 classes in 1st class 2 students 
		 *                           in 2nd class 4 students
		 *                           in 3rd class 5 students
		 *  in college three 4 classes in 1st class 2 students 
		 *                             in 2nd class 4 students
		 *                             in 3rd class 5 students
		 *                             in 4th class 6 students.
		
		 */
		
		int[][][] ar=new int[3][][];
		     ar[0]=new int[2][];
		     ar[1]=new int[3][];
		     ar[2]=new int[4][];
		     
		     ar[0][0]=new int[3];
		     ar[0][1]=new int[4];
		     
		     ar[1][0]=new int[2];
		     ar[1][1]=new int[4];
		     ar[1][2]=new int[5];
		     
		     ar[2][0]=new int[2];
		     ar[2][1]=new int[4];
		     ar[2][2]=new int[5];
		     ar[2][3]=new int[6];
	}

}

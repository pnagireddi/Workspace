package arrays;

import java.util.Arrays;

public class Launch3_0 {
	
	// Relating to Arrays class and methods.

	public static void main(String[] args) {
         int [] a= {30,50,10,40,20};
         Arrays.sort(a);;
         for (int elements:a) {
         System.out.println(elements);
         }
         
         int[] ar=new int[2];
         
         Arrays.fill(ar,0,1,10);
         
         for (int elements:ar) {
             System.out.println(elements);
             }
             
	}

}

package arrays;

import java.util.Scanner;

public class Launch1_6 {

	public static void main(String[] args) {
		/* To store and and print the 2d joggde array */ 
		
		int [][] ar=new int[3][];
		ar[0]=new int[2];
		ar[1]=new int[3];
		ar[2]=new int[5];
		
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				System.out.println("Please Enter Marks of Class"+" "+i+" "+"student"+" "+j);
				ar[i][j]=scan.nextInt();
				
			}
		}
		
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				System.out.println("Marks of Class"+" "+i+" "+"student"+" "+j);
				System.out.println(ar[i][j]);
				
			}
			System.out.println();
		}
		
		
		
         
	}

}

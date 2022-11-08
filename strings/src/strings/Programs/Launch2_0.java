package strings.Programs;

import java.util.Scanner;

public class Launch2_0 {

	public static void main(String[] args) {
        // Upper case to lower case
		Scanner scannner=new Scanner(System.in);
		System.out.println("please enter String for lower case");
		String s=scannner.nextLine();
		String ss="";
		
		for(int i=0;i<s.length();i++) {
			
			ss=ss+(char)(s.charAt(i)+32);
			
		}
		System.out.println(ss);
		
		// lower case to upper case
		System.out.println("please enter String uppercase");
		String s2=scannner.nextLine();
		String s3="";
        for(int i=0;i<s.length();i++) {
			
			s3=s3+(char)(s2.charAt(i)-32);
			
		}
        System.out.println(s3);
		
		
	
	}

}

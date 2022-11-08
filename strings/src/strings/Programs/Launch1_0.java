package strings.Programs;

import java.util.Scanner;

public class Launch1_0 {
	
	//To copy String into anther String.

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("Please enter String");
		String s=scanner.nextLine();
		String ss="";
		for(int i=0;i<s.length();i++) {
			
			ss=ss+s.charAt(i);
			
		}
		System.out.println("New String");
		System.out.println(ss);
          
	}

}

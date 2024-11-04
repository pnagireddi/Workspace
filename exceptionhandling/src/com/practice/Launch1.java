package com.practice;

import java.util.Scanner;

public  class Launch1 {
	
	/*  Exception is an error occurred at runtime of application which
	 * leads to abnormal or abrupt termination of our program
	 * 
	 *  for that we need to handle the exception what is mean by handling exception 
	 *  handling the exception such way that because of which abnormal termination should not happen to our program
	 *  
	 *  we use try and catch blocks we will put riskey code in try block to handle the exception occurred at try block we use
	 *  catch block .
	 *  if any exception occurred in a method for that method  stack frame will create the exception object that object
	 *  throws to jvm jvm will use of runtime system will check is there any exception handler or catch block in that method
	 *  if handler is there exception object will give to that catch block . if not there means that exception object
	 *  will give to "Default exception handler then the program will terminate abnormally."*/
	
	public static void cal() {
		System.out.println("cal method start exixution");
		Scanner scan=new Scanner(System.in);
		System.out.println("Plaese enter num one ");
		int num1=scan.nextInt();
		System.out.println("Plaese enter num two ");
		int num2=scan.nextInt();
		try {
			int result=num1/num2;
			System.out.println(result);
			
			/*
			 * if exception occurred below the lines of exception will not execute*/
			System.out.println("below of try block");
		}
		catch(Exception e) {
			
			//if exception occurred this block will be execute
			System.out.println("inside catch block");
		}
		System.out.println("below the lines of catch block");
		
		
	}

	public static void main(String[] args) {
		             cal();
	}

}

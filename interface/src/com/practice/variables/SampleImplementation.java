package com.practice.variables;

public class SampleImplementation implements Isample , Isample2 {

	
	// if both the interface having same variable then we will resolve that problem as below.
	// variables of an interface we can call directly.without using any class name because they are by default static 
	
	@Override
	public void m1() {
		
		System.out.println(Isample.a*Isample.a);

	}
	
	public static void main(String[] args) {
		SampleImplementation s=new SampleImplementation();
		s.m1();
		System.out.println(Isample2.a*Isample2.a);
	}

}

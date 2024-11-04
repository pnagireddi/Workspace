package com.practice.namingconflict;

public class SampleImpl  implements Isample ,Isample2{
	
	/* this class implements two interfaces which having methods 
	 * method one -> both interfaces with same method signature and same return type for those methods we implements 
	 * only one method
	 * method two-> both method signatures are different means overloading concept we need 
	 * to implements both methods 
	 * method three->both methods signatures are same but return types are  return type plays any role for that reason 
	 * we don't implements both methods in implementation class */

	@Override
	public void m2(int a, int b) {
		
	}

	/*
	 * @Override public void m3() { // TODO Auto-generated method stub
	 * 
	 * }
	 */

	@Override
	public void m1() {
		
	}

	@Override
	public void m2(int a) {
		
	}

	
	
	
	

}

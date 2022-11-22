package _static;

import java.util.Scanner;

public class Farmer {
	
	int principalAmount;
	float timeDuration;
	float simpleIntrest;
	static float rateOfInterest;
	static {
		rateOfInterest=3.05f;
	}
	
	public void input() {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Please mention the Principal Amount");
	principalAmount=scanner.nextInt();
	System.out.println("Please mentioned th etime duration");
	timeDuration=scanner.nextFloat();
	
	}
	public void compute() {
		simpleIntrest=(principalAmount*timeDuration*rateOfInterest)/100;
	}
	public void dispaly() {
		System.out.println("Principal Amount:"+principalAmount);
		System.out.println("Interest Amount :"+simpleIntrest);
	}

}

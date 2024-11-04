package all;

import java.util.Scanner;

public class Rectangle extends Shapes {
	
	float length;
	float breadth;

	@Override
	void input() {
            Scanner scan =new Scanner(System.in);
            System.out.println("please enter Leangth");
            length=scan.nextFloat();
            System.out.println("please enter Breadth");
            breadth=scan.nextFloat();
	}

	@Override
	void comput() {
       area=length*breadth;		
	}

	
}

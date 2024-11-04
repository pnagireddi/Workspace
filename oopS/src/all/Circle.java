package all;

import java.util.Scanner;

public class Circle extends Shapes{
	float radius;
	final float PI=3.148f;

	@Override
	void input() {
		Scanner scan =new Scanner(System.in);
        System.out.println("please enter radius");
        radius=scan.nextFloat();
        
		
		
	}

	@Override
	void comput() {
		area=radius*radius*PI;
		
	}

}

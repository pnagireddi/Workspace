package all;

import java.util.Scanner;

public class Squre extends Shapes {
	
	float length;

	void input() {
		Scanner scan =new Scanner(System.in);
        System.out.println("please enter Leangth");
        length=scan.nextFloat();
       

	}

	void comput() {
		area=length*length;

	}

}

package _static;

public class Demo {

	// why we need static members. .. How many objects is created

	int x;
	int y;
	static int count;

	{
		count++;
	}

	public Demo() {

	}

	public Demo(int x, int y) {
		this.x = x;
		this.y = y;

	}

	public Demo(int x) {
		this.x = x;
	}

	public static void main(String[] args) {
		Demo d = new Demo();
		Demo d1 = new Demo(10, 20);
		Demo d2 = new Demo(100);
		System.out.println(Demo.count);
	}

}

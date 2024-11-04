package constructors;

public class Test {
	// user defined imutable class.
	
	int i;
	public Test(int i) {
		this.i=i;
	}
	public Test modify(int i) {
		
		if(this.i==i) {
			return this;
		}
		else {
			return new Test(i);
		}
		
	}

	public static void main(String[] args) {
		Test t=new Test(10);
		Test modify1 = t.modify(10);
		System.out.println(t==modify1);
		Test modify2 = t.modify(100);
		System.out.println(t==modify2);
		
		
		
	}

}

package Practice01;


/* inner classes means class declared inside a class is called as inner class
 * the scope of an inner class is with in the class only .
 * by using reference of class we call/ invoke inner class "Launch1.Firstcode f=l.new Firstcode();"
 * for inner class static is allowed 
 * private member of outer class is allowed to use in inner class */
public class Launch1 {

	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	Firstcode f = new Firstcode();

	public void display() {
		f.config();
	}

	 class Firstcode {
		public void config() {
			int n = num * num;
			int sum = 0;
			while (n != 0) {
				int d = n % 10;
				sum = sum + d;
				n = n / 10;
			}
			System.out.println(sum);

		}
	}

	public static void main(String[] args) {
		Launch1 l = new Launch1();
		l.setNum(9);
		System.out.println(l.getNum());
		l.display();
		
		Launch1.Firstcode f=l.new Firstcode();
		

	}

}

package methods;

public class Concate {

	public static void main(String[] args) {
		// This method concate the string and with that new result new string object will be created.
		
		String s=new String ("Nagireddy");
		String concat = s.concat("pandhiri");
		System.out.println(concat);
		System.out.println(s==concat);

	}

}

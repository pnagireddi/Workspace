package AnonymousInnerClass;


/* Anonymous inner class means class which is not having any name which is used to override
 *  or implements unimplemented 
 * methods */
public class SecondCode {

	public static void main(String[] args) {

		Computer c = new Computer() {
			public void config() {
				System.out.println("annonymus Inner class");
			}
		};
		c.config();

	}

}

package inheritance;

public class Parent {

	private int assets;
	private String copyrights;

	// constructor is not a part of inheritance but at the time of object creation
	// of child parent class constructor will execute by using super() in child class
	// Constructor.
	public Parent() {
		System.out.println("parent class constructor");
	}

}

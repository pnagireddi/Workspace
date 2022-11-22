package constructor;

public class Student extends College {
	int id;
	String name;
	int age;
	
	public Student() {
		this("rama",1000);
		
		System.out.println("0 args constructor");
	}
	public Student ( String name,int age ) {
		
		this(001);
		this.name=name;
		this.age=age;
		System.out.println("2 arg constructor");
		
	}
	public Student (int id ) {
		// super(); call will be done by the jvm;
		this.id=id;
		System.out.println("1 arg constructor");
	}

}


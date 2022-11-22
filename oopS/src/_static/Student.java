package _static;

public class Student extends College {
	
	 static int id;
	 static String name;
	 
	 public Student(int age) {
		 this.age=age;
		 System.out.println(" constructor");
	 }
	 
	 static{
		 id=001;
		 name="rama";
		 System.out.println("Staic block");
	 }
	 {
		 System.out.println("instance block");
	 }
	public  static void   details() {
		System.out.println("Satic details method");
		System.out.println(id );
		System.out.println(name);
		
		 
	 }
	int age;
	
	public void detailsInstance() {
		System.out.println("instance method");
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
	}
	 

}

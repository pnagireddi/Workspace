package manyToOne;

public class Test {

	public static void main(String[] args) {
          Branch branch=new Branch(123,"Hyderabad");
          
          Students s=new Students(111,"ragupathi",branch);
          Students s1=new Students(222,"ragava",branch);
          Students s2=new Students(333,"rajaram",branch);
          
         s.display();
         s1.display();
         s2.display();
          
	}

}

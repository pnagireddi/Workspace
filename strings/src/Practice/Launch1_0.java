package Practice;

public class Launch1_0 {

	public static void main(String[] args) {
      //relating to object creation in heap area and string constant pool
		
		String s1=new String("Nagi");
		String s2=new String("Nagi");
		System.out.println(s1==s2);
		
		String s3="Nagi";
		String s4="Nagi";
		System.out.println(s3==s4);
	}

}

package methods;

public class InternMethod {

	public static void main(String[] args) {
    /* using heap object if you want to get corresponding (String constant pool)SCP 
		object for that we use intern().*/
		
		String s=new String("NagiReddy");
		String intern = s.intern();
		String s3="NagiReddy";
		System.out.println(intern==s3);
		System.out.println(intern);
		
		/* we can also get SCP object*/
		String s2="Nagi";
		String intern2 = s2.intern();
		System.out.println(intern2);
	}

}

package methods;

public class EqualsMethod {

	public static void main(String[] args) {
        /* It compare the content of the object if content is same for the both objects it will return true
         * other wise it will return false*/
		
		String s1=new String("NagiReddy");
		String s2=new String("NagiReddy");
		System.out.println(s1.equals(s2));
		
		/* "==" this operator check if both the references pointing to same object if pointing 
		 * to same object means it will return true
		 * other wise it will give false*/
		String s3="Nagi";
		String s4="Nagi";
		System.out.println(s3==s4);
		
	}

}

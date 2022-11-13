package Practice;

public class Launch1_3 {

	public static void main(String[] args) {
      String s1=new String("you can not change me!");
      String s2=new String("you can not change me!");
      System.out.println(s1==s2);//false
      String s3="you can not change me!";
      System.out.println(s1==s3);//false
      String s4="you can not change me!";
      System.out.println(s3==s4);//true
      String s5="you can not " +"change me!";
      System.out.println(s3==s5);//true
      String s6="you can not ";
      String s7=s6+"change me!";
      System.out.println(s3==s7);//false
      final String s8="you can not ";
      String s9=s8+"change me!";
      System.out.println(s3==s9);//true
      System.out.println(s6==s8);//true
	}

}

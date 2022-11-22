package encapsulation;

public class Test {

	public static void main(String[] args) {
          Student s=new Student();
          s.setId(001);
          s.setName("Rama");
          s.setAge(1000);
          s.setAddress("ayodhya");
          s.setGod(true);
          
          System.out.println(s.getId());
          System.out.println(s.getName());
          System.out.println(s.getAge());
          System.out.println(s.getAddress());
          System.out.println(s.isGod());
          
        System.out.println(s.toString());
	}

}

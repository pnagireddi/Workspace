package oneToMany;

public class Test {

	public static void main(String[] args) {
        Employee employee1=new Employee(111,"somu");
        Employee employee2=new Employee(222,"ramu");
        Employee employee3=new Employee(333,"beemu");
        
        Employee[] employee =new Employee[3]; 
        employee[0]=employee1;
        employee[1]=employee2;
        employee[2]=employee3;
        
        Branch branch=new Branch(123,"bangalore",employee);
        branch.display();
        
	}

}

package oneToMany;

/* what is dependency injection
 * the process of injecting dependent object into target object is called as dependency injection
 * we have setter dependency injection
 * and constructor dependency injection */

// Target object 
public class Branch {
	
	public int bid;
	public String bname;
	
	public Employee[] employee;
	
	
	public Branch(int bid, String bname, Employee[] employee) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.employee = employee;
	}


	public void display() {
		 System.out.println("Branch Details     :");
		 System.out.println("id                 :"+bid);
		 System.out.println("name               :"+bname);
		 System.out.println("Employee Details");
		 for (Employee employee : employee) {
		System.out.println("Employee id         :"+employee.eid);
		System.out.println("Employee name       :"+employee.ename);
			
		}
	}
	
	
	

}

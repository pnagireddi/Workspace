package manyToOne;


//Target object
public class Students {

	public int sid;
	public String sname;
	public Branch branch;
	public Students(int sid, String sname, Branch branch) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.branch = branch;
	}
	
	public void display() {
		
		System.out.println("Student Details:");
		System.out.println("id             :"+sid);
		System.out.println("name           :"+sname);
		System.out.println("Branch Details :");
		System.out.println("id             :"+branch.bid);
		System.out.println("id             :"+branch.bname);
	}
	
}

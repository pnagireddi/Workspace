package manyToMany;


//Target object
public class Students {
	
	public int sid;
	public String sname;
	public Cources[] courecs;
	
	public Students(int sid, String sname, Cources[] courecs) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.courecs = courecs;
	}

	public void display() {
		
		System.out.println("Student Details :");
		System.out.println("id              :"+sid);
		System.out.println("name            :"+sname);
		System.out.println("Cources Details");
		for (Cources cources : courecs) {
		System.out.println("id              :"+cources.cid);
		System.out.println("name            :"+cources.cname);
		System.out.println("fee             :"+cources.fee);
		System.out.println();
			
		}
		System.out.println();
		
	}

}

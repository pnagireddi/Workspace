package encapsulation;

public class Student {
	
	private Integer id;
	private String name;
	private Integer age;
	private String address;
	private Boolean god;
	
	public void setGod(Boolean god) {
		this.god=god;
	}
	public Boolean isGod() {
		return god;
	}
	
	public void setId(Integer id) {
		this.id=id;
		
	}
	public Integer getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAge(Integer age) {
		this.age=age;
	}
	public Integer getAge() {
		return age;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public String getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + ", god=" + god + "]";
	}
	
	
	

}

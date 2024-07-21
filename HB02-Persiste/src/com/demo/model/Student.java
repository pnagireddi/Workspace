package com.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="SDTTAB")
public class Student {
	
	@Id
	@Column(name="id")
	private Integer sid;
	
	@Column(name="name", length = 20)
	private String sname;
	
	@Column(name="address" , length=20)
	private String saddress;
	
	@Column(name="age")
	private Integer sage;
	
	public Student() {
		System.out.println("Hibernate internally uses Zero arg constructor..");
	}
	
	
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public Integer getSage() {
		return sage;
	}
	public void setSage(Integer sage) {
		this.sage = sage;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", saddress=" + saddress + ", sage=" + sage + "]";
	}
	
	
	

}

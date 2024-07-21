package com.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.SQLDelete;

@Entity
@Table(name="accountdetails")
@SQLDelete(sql = "UPDATE accountdetails SET status='closed' WHERE accno=?")
public class AccountDetails implements Serializable {
	
	
	private static final long serialVersionUID = 1L;


	public  AccountDetails() {
		
	}
	
	@Id
	private int accno;
	private String name;
	private float balance;
	private String status;
	
	
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "AccountDetails [accno=" + accno + ", name=" + name + ", balance=" + balance + ", status=" + status
				+ "]";
	}
	
	
	
	

}

package in.ineuron.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.ParamDef;

@Entity
@Table(name="accountdetails")
@FilterDef(name = "GET_ACCOUNT_DETAILS",
parameters = { @ParamDef(type="string" , name="acc1"), @ParamDef(type="string",name="acc2")
               
}
)
@Filter(name = "GET_ACCOUNT_DETAILS" ,condition = "status not in(:acc1,:acc2)")
public class AccountDetails implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
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

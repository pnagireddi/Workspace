package in.ineuron.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="HQL_TRANSFER_POLICIES",query = "INSERT INTO in.ineuron.model.PremiumPolicies(pid,pname,policytype,tenure,company) SELECT i.pid,i.pname,i.policytype,i.tenure,i.company FROM in.ineuron.model.InsurencePolicies as i WHERE i.tenure>=:min")
public class PremiumPolicies implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	private int pid;
	private String pname;
	private String policytype;
	private int tenure;
	private String company;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPolicytype() {
		return policytype;
	}
	public void setPolicytype(String policytype) {
		this.policytype = policytype;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "PremiumPolicies [pid=" + pid + ", pname=" + pname + ", policytype=" + policytype + ", tenure=" + tenure
				+ ", company=" + company + "]";
	}
	
	

}

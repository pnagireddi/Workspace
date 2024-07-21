package in.ineuron.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class MobileCustomer implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private Long mobileNumber;
	private String callerTone;
    
	public String getCallerTone() {
		return callerTone;
	}

	public void setCallerTone(String callerTone) {
		this.callerTone = callerTone;
	}

	@Version
	private Integer versionCount;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Integer getVersionCount() {
		return versionCount;
	}

	public void setVersionCount(Integer versionCount) {
		this.versionCount = versionCount;
	}

	@Override
	public String toString() {
		return "MobileCustomer [id=" + id + ", name=" + name + ", mobileNumber=" + mobileNumber + ", callerTone="
				+ callerTone + ", versionCount=" + versionCount + "]";
	}

	
	
	

}

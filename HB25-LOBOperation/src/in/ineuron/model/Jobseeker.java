package in.ineuron.model;

import java.io.Serializable;
import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Jobseeker implements Serializable {


	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer jId;
	private String jName;
	private String jAdd;
	
	@Lob
	private byte[] jPhoto;
	@Lob
	private char[] jResume;
	public Integer getjId() {
		return jId;
	}
	public void setjId(Integer jId) {
		this.jId = jId;
	}
	public String getjName() {
		return jName;
	}
	public void setjName(String jName) {
		this.jName = jName;
	}
	public String getjAdd() {
		return jAdd;
	}
	public void setjAdd(String jAdd) {
		this.jAdd = jAdd;
	}
	public byte[] getjPhoto() {
		return jPhoto;
	}
	public void setjPhoto(byte[] jPhoto) {
		this.jPhoto = jPhoto;
	}
	public char[] getjResume() {
		return jResume;
	}
	public void setjResume(char[] jResume) {
		this.jResume = jResume;
	}
	@Override
	public String toString() {
		return "Jobseeker [jId=" + jId + ", jName=" + jName + ", jAdd=" + jAdd + ", jPhoto=" + Arrays.toString(jPhoto)
				+ ", jResume=" + Arrays.toString(jResume) + "]";
	}
	
	
	

}

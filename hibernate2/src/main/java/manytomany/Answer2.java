package manytomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "a123")
public class Answer2 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aid;
	@Column(name = "a_name")
	private String aname;
	@ManyToMany
	private List<Question2> qn;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public List<Question2> getQn() {
		return qn;
	}
	public void setQn(List<Question2> qn) {
		this.qn = qn;
	}
	
	
	

}

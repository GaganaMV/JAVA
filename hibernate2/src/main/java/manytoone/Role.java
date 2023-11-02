package manytoone;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "role2")
public class Role {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
	private int rid;
    @Column(name = "r_name")
	private String rname;
    
    @OneToMany
    private List<User> user;
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public List<User> getUser() {
		return user;
	}
	public void setUser(List<User> user) {
		this.user = user;
	}
	public Role(int rid, String rname) {
		super();
		this.rid = rid;
		this.rname = rname;
	}
    
    

}

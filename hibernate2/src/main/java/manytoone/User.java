package manytoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user2")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;
	@Column(name = "u_name")
	private String uname;
	@Column(name = "u_age")
	private String uage;
	
	

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUage() {
		return uage;
	}

	public void setUage(String uage) {
		this.uage = uage;
	}

	

	public User(int uid, String uname, String uage) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.uage = uage;
	}

	
	
	
	

}

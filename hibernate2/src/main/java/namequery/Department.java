package namequery;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries({
	@NamedQuery(name = "findDepartmentByName",query = "from Department d where d.dname=:dname"),
	
})
@Entity
@Table(name="department")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "dname")
	private String dname;
	@Column(name = "dlocation")
	private String dlocation;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDlocation() {
		return dlocation;
	}
	public void setDlocation(String dlocation) {
		this.dlocation = dlocation;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", dname=" + dname + ", dlocation=" + dlocation + "]";
	}
	public Department(int id, String dname, String dlocation) {
		super();
		this.id = id;
		this.dname = dname;
		this.dlocation = dlocation;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}

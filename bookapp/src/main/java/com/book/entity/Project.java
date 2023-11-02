package com.book.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "project")
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long pid;
	@Column(name = "pname")
	private String pname;
	
	@ManyToMany(cascade = CascadeType.ALL)
	Set<Trainer> trainer =new HashSet<Trainer>();

	public long getPid() {
		return pid;
	}

	public void setPid(long pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

//	public Set<Trainer> getTrainer() {
//		return trainer;
//	}
//
//	public void setTrainer(Set<Trainer> trainer) {
//		this.trainer = trainer;
//	}

	public Project(long pid, String pname, Set<Trainer> trainer) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.trainer = trainer;
	}

	public Project() {
		super();
		
	}
	
	
	
	

}

package com.book.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long eid;
	@Column(name = "ename")
	private String ename;
	@Column(name = "edept")
	private String edept;
	
	@ManyToOne
	@JoinColumn(name="emp_id")
	private Book book;
	public long getEid() {
		return eid;
	}
	public void setEid(long eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEdept() {
		return edept;
	}
	public void setEdept(String edept) {
		this.edept = edept;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Employee(long eid, String ename, String edept, Book book) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.edept = edept;
		this.book = book;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}

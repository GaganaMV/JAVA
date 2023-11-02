package com.book.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long sid;
	@Column(name = "sname")
	private String sname;
	@Column(name="sdept")
	private String sdept;
	
	@OneToOne
	@JoinColumn(name = "book_id")
	private Book book;
	

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getSid() {
		return sid;
	}

	public void setSid(long sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSdept() {
		return sdept;
	}

	public void setSdept(String sdept) {
		this.sdept = sdept;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Student(long sid, String sname, String sdept, Book book) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sdept = sdept;
		this.book = book;
	}
	
	
	

}

package com.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.entity.Student;

import com.book.services.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
    private StudentService studentServices;
	
	@PostMapping("/insert")
	public Student insertStudent(@RequestBody Student student) {
		return studentServices.insertStudent(student);
	}

}

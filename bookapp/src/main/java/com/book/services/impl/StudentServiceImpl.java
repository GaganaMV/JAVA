package com.book.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.entity.Student;
import com.book.repository.StudentRepository;
import com.book.services.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentRepository studentRepo;

	@Override
	public Student insertStudent(Student student) {
		return studentRepo.save(student);
		
	}

}

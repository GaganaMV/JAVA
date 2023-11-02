package com.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

	

}

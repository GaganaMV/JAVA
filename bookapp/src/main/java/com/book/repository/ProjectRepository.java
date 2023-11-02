package com.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Long>{

}

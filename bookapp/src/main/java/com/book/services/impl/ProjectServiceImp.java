package com.book.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.entity.Project;
import com.book.repository.ProjectRepository;
import com.book.services.ProjectService;

@Service
public class ProjectServiceImp implements ProjectService{
	@Autowired
	private ProjectRepository projectRepo;

	@Override
	public Project insertProject(Project project) {
		return projectRepo.save(project);
	
	}

}

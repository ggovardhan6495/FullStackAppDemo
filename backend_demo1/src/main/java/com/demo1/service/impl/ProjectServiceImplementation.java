package com.demo1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo1.domain.Project;
import com.demo1.repositories.ProjectRepository;


public class ProjectServiceImplementation  {

	@Autowired
	ProjectRepository projectRepo;
	
	public Project createProject(Project project) {
		return projectRepo.save(project);
	}

	public Iterable<Project> getProjectDetails() {
		return projectRepo.findAll();
	}

}

package com.demo1.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo1.domain.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {


}
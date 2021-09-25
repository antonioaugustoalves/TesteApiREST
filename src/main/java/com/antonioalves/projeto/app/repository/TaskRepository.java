package com.antonioalves.projeto.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.antonioalves.projeto.app.models.Task;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long>{

}

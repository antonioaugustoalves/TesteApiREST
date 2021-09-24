package com.antonioalves.projeto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.antonioalves.projeto.models.Task;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long>{

}

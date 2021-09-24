package com.antonioalves.projeto.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.antonioalves.projeto.models.Task;
import com.antonioalves.projeto.services.TaskService;
import com.antonioalves.projeto.services.TaskServiceImpl;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
	
	@Autowired
	TaskService service;
	
	@GetMapping
	public ResponseEntity<List<Task>> getAllTasks(){
		List<Task> tasks = service.getTasks();
		return new ResponseEntity<>(tasks, HttpStatus.OK);
	}
	
	@GetMapping("/{taskId}")
	public ResponseEntity<Task> getTask(@PathVariable Long taskId){
		return new ResponseEntity<>(service.getTaskById(taskId), HttpStatus.OK);
	}
	
}

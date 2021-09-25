package com.antonioalves.projeto.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpHeaders;

import com.antonioalves.projeto.app.models.Task;
import com.antonioalves.projeto.app.services.TaskService;


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
	
	@GetMapping("/home")
	public String home() {
		return "Estamos online!";
	}
	
	@GetMapping("/{taskId}")
	public ResponseEntity<Task> getTask(@PathVariable Long taskId){
		return new ResponseEntity<>(service.getTaskById(taskId), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Task> saveTask(@RequestBody Task task){
		Task ts = service.insert(task);
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("task", "/api/tasks/"+ts.getId().toString());
		return new ResponseEntity<>(ts, httpHeaders, HttpStatus.CREATED);			
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Task> updateTask(
			@PathVariable Long id, @RequestBody Task task){
		
		service.updateTask(id, task);
		
		return new ResponseEntity<Task>(service.getTaskById(id), HttpStatus.OK);
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Task> deleteTask(@PathVariable Long id){
		service.deleteTask(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		
	}
	
}

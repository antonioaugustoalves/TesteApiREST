package com.antonioalves.projeto.services;

import java.util.List;

import com.antonioalves.projeto.models.Task;

public interface TaskService {
	List<Task> getTasks();
	Task getTaskById(Long id);
	Task insert(Task task);
	void updateTask(Long id, Task task);
	void deleteTask(Long id);
}

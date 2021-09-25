package com.antonioalves.projeto.app.services;

import java.util.List;

import com.antonioalves.projeto.app.models.Task;

public interface TaskService {
	List<Task> getTasks();
	Task getTaskById(Long id);
	Task insert(Task task);
	void updateTask(Long id, Task task);
	void deleteTask(Long id);
}

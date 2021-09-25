package com.antonioalves.projeto.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.antonioalves.projeto.app.models.Status;
import com.antonioalves.projeto.app.models.Task;
import com.antonioalves.projeto.app.repository.TaskRepository;

@Component
public class TaskLoader implements CommandLineRunner{
	public final TaskRepository repository;
	
	public TaskLoader(TaskRepository repository) {
		this.repository = repository;
	}
	
	private void loadTasks() {
		if(repository.count() == 0) {
			repository.save(
					Task.builder()
					.title("Ir ao dentista")
					.description("Ir ao dentista para realizar limpeza")
					.status(Status.NOT_COMPLETE)
					.build());
			
			repository.save(
					Task.builder()
					.title("Reunião na Escola")
					.description("Reuniao da escola para conselho de classe")
					.status(Status.NOT_COMPLETE)
					.build());
			
			repository.save(
					Task.builder()
					.title("Ir ao mercado")
					.description("Ir ao mercado para comprar carne")
					.status(Status.NOT_COMPLETE)
					.build());
			
			System.out.println("Carregando dados temporarios...");
		}
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		loadTasks();
		
	}
}

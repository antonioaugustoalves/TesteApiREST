package com.antonioalves.projeto.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;





@SpringBootApplication
@EnableJpaRepositories("com.antonioalves.projeto.app.repository")
@EntityScan("com.antonioalves.projeto.app.models")
public class GerenciadorTarefas1Application {

	public static void main(String[] args) {
		SpringApplication.run(GerenciadorTarefas1Application.class, args);
	}

}

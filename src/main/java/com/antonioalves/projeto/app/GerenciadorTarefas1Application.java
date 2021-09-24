package com.antonioalves.projeto.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication(scanBasePackages = {
		"com.antonioalves.projeto.app.controller",
		"com.antonioalves.projeto.services"
		})
public class GerenciadorTarefas1Application {

	public static void main(String[] args) {
		SpringApplication.run(GerenciadorTarefas1Application.class, args);
	}

}

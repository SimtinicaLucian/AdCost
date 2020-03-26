package com.example.dfitness;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.example.dfitness.repository")
@SpringBootApplication
public class DfitnessApplication {

	public static void main(String[] args) {
		SpringApplication.run(DfitnessApplication.class, args);
	}

}

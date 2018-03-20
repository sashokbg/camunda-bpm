package com.d2f.camunda;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableProcessApplication("Rent a Car Application")
public class CamundaSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(CamundaSpringBootApplication.class, args);
	}
}

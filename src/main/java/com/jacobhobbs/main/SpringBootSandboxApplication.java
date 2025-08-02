package com.jacobhobbs.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//
@SpringBootApplication
public class SpringBootSandboxApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSandboxApplication.class, args);

	}

	@GetMapping
	public String helloWorld() {
		return "Hello World Spring Boot";
	}

}

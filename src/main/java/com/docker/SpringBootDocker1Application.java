package com.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDocker1Application {

	@GetMapping("/get")
	public String m1()
	{
		System.out.println("Spring-boot-Docker app page...console...");
		return "Spring-boot-Docker app page...";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDocker1Application.class, args);
	}

}

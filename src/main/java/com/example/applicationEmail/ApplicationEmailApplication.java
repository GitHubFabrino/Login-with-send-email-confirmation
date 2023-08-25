package com.example.applicationEmail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class ApplicationEmailApplication {

	public static void main(String[] args) {
		System.out.println("aaa");
		SpringApplication.run(ApplicationEmailApplication.class, args);
	}

}

package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleHelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleHelloWorldApplication.class, args);
		System.out.println("Hello world");
	}

}

package com.elhila.taskcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TaskcrudApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(TaskcrudApplication.class, args);
		System.out.println("ApplicationContext utilisé : " + context.getClass().getName());
	}
}

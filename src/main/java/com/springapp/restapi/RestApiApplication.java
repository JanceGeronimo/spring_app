package com.springapp.restapi;

import com.springapp.restapi.entity.Task;
import com.springapp.restapi.repository.task.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);
	}

	@Autowired
	private TaskRepository taskRepository;

	@Override
	public void run(String... args) throws Exception {

//		Task task1 = new Task("Spring Boot Activity", "Submit Spring App activity", "No");
//		taskRepository.save(task1);
//
//		Task task2 = new Task("Java Design Pattern", "Answer exercises of Java design pattern", "Yes");
//		taskRepository.save(task2);
	}
}

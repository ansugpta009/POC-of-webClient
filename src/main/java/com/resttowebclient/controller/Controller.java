package com.resttowebclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.resttowebclient.entity.Student;
import com.resttowebclient.service.StudentService;

import reactor.core.publisher.Mono;

@RestController
public class Controller {

	@Autowired
	private StudentService studentService;
	
	@Autowired
	WebClient webClient;
	
	@GetMapping("/student")
	public Mono<List<Student>> getStudents(@RequestParam String name){
		return this.webClient
                .get()
                .uri("/student2?name="+name)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToFlux(Student.class)
                .collectList()
                .log();
	}
	
	@PostMapping("/student")
	public Student addAgents(@RequestBody Student student){
		return this.studentService.addStudents(student);
	}
}

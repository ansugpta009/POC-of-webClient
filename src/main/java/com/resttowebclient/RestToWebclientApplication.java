package com.resttowebclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class RestToWebclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestToWebclientApplication.class, args);
	}
}

package com.javaspring.routingpractice.routing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RoutingApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoutingApplication.class, args);
	}

	@GetMapping("")
	public String index() {
		return "Hello Coding Dojo!";
	}

}

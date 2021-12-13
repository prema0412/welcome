package com.company.welcome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController

public class WelcomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(WelcomeApplication.class, args);

	}

	@GetMapping("/welcome")
	ResponseEntity<String> welcome(){
		return ResponseEntity.status(HttpStatus.OK).body("Welcome Prema");

	}

	@PostMapping("/welcomename/{name}")
	ResponseEntity<String> welcomeName(@PathVariable String name){
		return ResponseEntity.status(HttpStatus.OK).body("Welcome  " + name);

	}



}

package com.ayansys.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitTestAppApplication {

	@PostMapping("/purchase/{username}/{amount}/{productName}")
	public String purchase(@PathVariable String username, @PathVariable String amount, @PathVariable String productName) {
		
		return "Hi "+username+" order for "+productName+" with amount "+amount+" stored successfully..";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(GitTestAppApplication.class, args);
	}

}

package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // 인텔리제이 PR1
	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}

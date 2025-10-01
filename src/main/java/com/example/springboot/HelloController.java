package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    // 변경된 사항만 PR
    // PR2
	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}

package com.jega.swagger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Manager {
	@Autowired
	Student s;
	@GetMapping("/kudra")
	public Student retrieve() {
		return s;
	}
	@PostMapping("/mathra")
	public Student update(@RequestBody Student s1) {
		return s1;
	}

}

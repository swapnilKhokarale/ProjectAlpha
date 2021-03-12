package com.jbk;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping (value = "/app")
@RestController
public class contoller {

	@PostMapping(value = "/addstudent")
	public Student add(@RequestBody Student student) {
		return student;
	}
	
	@GetMapping(value = "name/{name}/{name2}")
	public String name(@PathVariable String name,@PathVariable String name2) {
		return name+name2;
	}
} 

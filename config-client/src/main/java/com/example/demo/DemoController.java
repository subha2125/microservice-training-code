package com.example.demo;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class DemoController {

	@CrossOrigin("*")
	@GetMapping("/demoget")
	public Employee getMockTests(){
		return new Employee("Subhadip") ;
	}
}

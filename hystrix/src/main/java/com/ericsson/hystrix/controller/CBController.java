package com.ericsson.hystrix.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ericsson.hystrix.services.CBService;


@RestController
public class CBController {
	
	@Autowired
	private CBService cbService;
	
	@CrossOrigin("*")
	@GetMapping("/getAllPolicyHolders")
	public String getAllPolicyHolders(){
		return cbService.handleRequest();
	} 

}
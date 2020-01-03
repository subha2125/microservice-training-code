package com.ericsson.hystrix.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class CBService {
	@Autowired
	private RestTemplate restTemplate;
	
	Logger logger = LoggerFactory.getLogger(CBService.class);

	@HystrixCommand(fallbackMethod = "handleFallBack")
	public String handleRequest() {
		
		
		logger.info("Inside handleRequest");
		return restTemplate.exchange("http://localhost:8765/api/insurance/getAllPolicyHolders", HttpMethod.GET, null,
				new ParameterizedTypeReference<String>() {
				}).getBody();
	}

	public String handleFallBack() {
		logger.info("Inside handleFallBack");
		return restTemplate.exchange("http://localhost:6062/getAllPolicyHolders", HttpMethod.GET, null,
				new ParameterizedTypeReference<String>() {
				}).getBody();
	}
}
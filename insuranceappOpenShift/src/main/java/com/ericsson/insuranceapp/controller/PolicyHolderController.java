package com.ericsson.insuranceapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ericsson.insuranceapp.models.PolicyHolder;
import com.ericsson.insuranceapp.service.PolicyHolderService;

@RestController
public class PolicyHolderController {

	@Autowired
	PolicyHolderService policyHolderService;
	
	@CrossOrigin("*")
	@PostMapping("/addPolicyHolder")
	public @ResponseBody PolicyHolder addPolicyHolder(@RequestBody PolicyHolder policyHolder) {
		return policyHolderService.addPolicyHolder(policyHolder);
	}
	
	@CrossOrigin("*")
	@GetMapping("/getAllPolicyHolders")
	public List<PolicyHolder> getAllPolicyHolders(){
		return policyHolderService.findAllPolicyHolder();
	}
	
	@CrossOrigin("*")
	@GetMapping("/getPolicyHolderById/{id}")
	public PolicyHolder getPolicyHolderById(@PathVariable("id") long adharCardNo) {
		return policyHolderService.getPolicyHolderById(adharCardNo);
	}
	
	@CrossOrigin("*")
	@DeleteMapping("/deletePolicyHolderById/{id}")
	public boolean deletePolicyHolderById(@PathVariable("id") long adharCardNo) {
		return policyHolderService.deletePolicyHolderById(adharCardNo);
	}
}



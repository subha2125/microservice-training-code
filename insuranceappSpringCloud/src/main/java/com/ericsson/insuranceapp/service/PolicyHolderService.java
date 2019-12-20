package com.ericsson.insuranceapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ericsson.insuranceapp.models.PolicyHolder;
import com.ericsson.insuranceapp.repositories.PolicyHolderRepository;

@Service
public class PolicyHolderService {

	@Autowired
	PolicyHolderRepository policyHolderRepository;

	public PolicyHolder addPolicyHolder(PolicyHolder policyHolder) {
		return policyHolderRepository.save(policyHolder);
	}

	public List<PolicyHolder> findAllPolicyHolder() {
		return policyHolderRepository.findAll();
	}

	public PolicyHolder getPolicyHolderById(long adharCardNo) {
		return policyHolderRepository.findById(adharCardNo).orElse(null);
	}

	public boolean deletePolicyHolderById(long adharCardNo) {
		policyHolderRepository.deleteById(adharCardNo);
		return getPolicyHolderById(adharCardNo) == null;
	}
}

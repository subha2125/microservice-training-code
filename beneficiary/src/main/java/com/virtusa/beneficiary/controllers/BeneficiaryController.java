package com.virtusa.beneficiary.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.beneficiary.facades.BeneficiarySource;
import com.virtusa.beneficiary.models.Beneficiary;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@EnableBinding(BeneficiarySource.class)
@RestController
public class BeneficiaryController {
	@Autowired
	BeneficiarySource beneficiarySource;

	@RequestMapping("/addbeneficiary")
	public @ResponseBody String addBeneficiary(@RequestBody Beneficiary beneficiary) {
		beneficiarySource.addbeneficiary().send(MessageBuilder.withPayload(beneficiary).build());
		// install java -jar lombok.jar
		log.info(beneficiary.toString());
		return "Beneficiary Added Successfully";
	}
}

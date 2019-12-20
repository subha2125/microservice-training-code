package com.virtusa.beneficiarysubscriber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
public class BeneficiarysubscriberApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeneficiarysubscriberApplication.class, args);
	}

}

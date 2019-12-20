package com.virtusa.beneficiarysubscriber;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface BeneficiarySink {
	String INPUT="beneficiaryRegistrationChannel";
	@Input(INPUT)
	MessageChannel readbeneficiary();

}

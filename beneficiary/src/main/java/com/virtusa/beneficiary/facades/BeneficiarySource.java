package com.virtusa.beneficiary.facades;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface BeneficiarySource {
	@Output("beneficiaryRegistrationChannel")
	MessageChannel addbeneficiary();

}

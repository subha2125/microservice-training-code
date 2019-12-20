package com.virtusa.beneficiarysubscriber;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;


import lombok.extern.slf4j.Slf4j;
@Slf4j
@EnableBinding(BeneficiarySink.class)
public class BeneficiaryListener
{
    
    @StreamListener(target = BeneficiarySink.INPUT)
    public void listenForBeneficiaryCreation(Beneficiary beneficiary)
    {
      log.info(" Added Beneficiary ["+beneficiary.toString()+"] ");
    }
}

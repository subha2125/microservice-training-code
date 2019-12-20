package com.virtusa.beneficiarysubscriber;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//@Getter
//@Setter
/**
 * Generates getters for all fields, 
 * a useful toString method, and hashCode and equals implementations 
 * that checkall non-transient fields. Will also generate setters for all non-final fields, as well as a constructor. 
 * @author Balasubramaniam
 *
 */
@Data
//@JsonIgnoreProperties(ignoreUnknown=true)
public class Beneficiary {
	@JsonProperty("First_Name")
	private String firstName;
	@JsonProperty("Last_Name")
	private String lastName;
	@JsonProperty("Account_No")
	private long accountNo;
	@JsonProperty("IFSC_Code")
	private String ifscCode;
	

}

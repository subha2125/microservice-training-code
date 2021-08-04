package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class EmpController {

	@Autowired
	EmpConfiguration empConfiguration;

	@Value("${my.greetings}")
	private String greetings;

	@Value("${db.config}")
	private String dbConfig;
	
	@Value("${db.driver}")
	private String driver;
	
	@Value("${db.url}")
	private String url;
	
	@Value("${db.username}")
	private String userName;
	
	@Value("${db.password}")
	private String password;
	
	@Value("${dev.hello}")
	private String devHello;

	@CrossOrigin("*")

	@GetMapping("/getAppProperties")
	public String getAppProperties() {
		return empConfiguration.getMail();
	}

	@CrossOrigin("*")

	@GetMapping("/getFromGit")
	public String getConfigServerPropFromGit() {
		return toString();
	}

	@CrossOrigin("*")

	@GetMapping("/getMock")
	public String getMockTests() {
		return "Mock";
	}

	@Override
	public String toString() {
		return "EmpController [greetings=" + greetings + ", dbConfig=" + dbConfig + ", driver=" + driver + ", url="
				+ url + ", userName=" + userName + ", password=" + password +  ", devHello=" + devHello +"]";
	}

	
}

package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {
	
	@Autowired
	EmpController empController;

	@Test
	void contextLoads() {
	}

	/*
	 * @Test public void greeting() {
	 * assertEquals("subhadip25@yahoo.com",empController.getAppProperties()); }
	 */
}

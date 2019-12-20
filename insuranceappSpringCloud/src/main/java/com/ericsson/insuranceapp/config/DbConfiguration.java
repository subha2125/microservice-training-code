package com.ericsson.insuranceapp.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DbConfiguration {
	// app-about-company.properties
	@Value("${db_url}")
	private String url;
	@Value("${db_username}")
	private String userName;
	@Value("${db_password}")
	private String password;
	// config-server-client-development.properties
	@Value("${msg}")
	private String message;

	@Bean
	public DataSource getInstance() {
		DataSourceBuilder builder = DataSourceBuilder.create();
		builder.url(url);
		builder.username(userName);
		builder.password(password);
		return builder.build();
	}

}

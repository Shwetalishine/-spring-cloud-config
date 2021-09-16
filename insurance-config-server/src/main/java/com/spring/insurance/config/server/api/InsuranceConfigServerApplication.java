package com.spring.insurance.config.server.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class InsuranceConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(InsuranceConfigServerApplication.class, args);
	}

}

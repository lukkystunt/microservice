package com.microservice.transfermanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TransferManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransferManagementApplication.class, args);
	}

}

package com.microservice.usermanagement.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;



@RestController
@RequestMapping
public class UserManagement {
    
	@Value("${server.port}")
  	private String port;

    @GetMapping("/users")
	public String test() {
		return "User Service "+port;
	}
}

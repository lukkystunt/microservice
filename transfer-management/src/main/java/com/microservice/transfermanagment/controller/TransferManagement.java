package com.microservice.transfermanagement.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;



@RestController
@RequestMapping
public class TransferManagement {
    
	@Value("${server.port}")
  	private String port;

    @GetMapping("/transfers")
	public String test() {
		return "Transfers "+port;
	}
}

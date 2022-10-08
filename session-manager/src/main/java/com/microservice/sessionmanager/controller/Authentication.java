package com.microservice.sessionmanager.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.microservice.sessionmanager.feign.UserManagementFeign;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping
public class Authentication {
    

    @Autowired
    UserManagementFeign userManagementFeign;

    @GetMapping("/test")
	public String test() {
		return userManagementFeign.test();
	}
}

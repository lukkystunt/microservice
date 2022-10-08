package com.microservice.sessionmanager.feign;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "user-management")
public interface UserManagementFeign {
    

    @RequestMapping(value = "/test", consumes = "application/json", method = RequestMethod.GET)
    public String test();

}

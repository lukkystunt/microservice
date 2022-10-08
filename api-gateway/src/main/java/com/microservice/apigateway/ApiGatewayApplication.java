package com.microservice.usermanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import  com.microservice.usermanagement.filters.PostFilter;
import  com.microservice.usermanagement.filters.PreFilter;
import  com.microservice.usermanagement.filters.RouteFilter;
import com.microservice.usermanagement.filters.ErrorFilter;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
@EnableFeignClients
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

	@Bean
  public PreFilter preFilter() {
    return new PreFilter();
  }
  @Bean
  public PostFilter postFilter() {
    return new PostFilter();
  }
 
  @Bean
  public RouteFilter routeFilter() {
    return new RouteFilter();
  }

  @Bean
public ErrorFilter errorFilter() {
  return new ErrorFilter();
}


}

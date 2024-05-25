package com.prowings.demo_Eureka_service_consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prowings.demo_Eureka_service_consumer.service.ServiceProvider;

@RestController
public class ConsumerController {
	@Autowired
	ServiceProvider serviceProvider;
	
	@GetMapping("/consume")
	public String getHello() {
		return serviceProvider.getHello();
	}

}

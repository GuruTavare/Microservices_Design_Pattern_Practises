package com.prowings.demo_Eureka_service_consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("service-provider")
public interface ServiceProvider {
	@GetMapping("/hello")
	public String getHello();

}

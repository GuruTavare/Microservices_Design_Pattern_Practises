package com.prowings.demo_user_order_service_client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClientController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/consume/users")
	public String consumeUsers() {
		return restTemplate.getForObject("http://user-service/users", String.class);
	}

	@GetMapping("/consume/orders")
	public String consumeOrders() {
		return restTemplate.getForObject("http://order-service/orders", String.class);
	}
}

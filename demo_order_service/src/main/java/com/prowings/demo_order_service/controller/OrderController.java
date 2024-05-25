package com.prowings.demo_order_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@GetMapping("/orders")
	public String getOrders() {
		return "List of Orders";
	}

}
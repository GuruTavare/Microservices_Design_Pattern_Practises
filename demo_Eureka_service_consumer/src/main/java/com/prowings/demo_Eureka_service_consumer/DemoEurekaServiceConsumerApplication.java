package com.prowings.demo_Eureka_service_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DemoEurekaServiceConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoEurekaServiceConsumerApplication.class, args);
	}

}

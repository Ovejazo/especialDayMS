package com.tutorial.especialdayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EspecialDayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EspecialDayServiceApplication.class, args);
	}

}

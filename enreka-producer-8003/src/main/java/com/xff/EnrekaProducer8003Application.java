package com.xff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EnrekaProducer8003Application {

	public static void main(String[] args) {
		SpringApplication.run(EnrekaProducer8003Application.class, args);
	}

}

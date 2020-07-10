package com.xff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EnrekaServer02Application {

	public static void main(String[] args) {
		SpringApplication.run(EnrekaServer02Application.class, args);
	}

}

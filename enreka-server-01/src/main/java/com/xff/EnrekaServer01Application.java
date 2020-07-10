package com.xff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EnrekaServer01Application {

	public static void main(String[] args) {
		SpringApplication.run(EnrekaServer01Application.class, args);
	}

}

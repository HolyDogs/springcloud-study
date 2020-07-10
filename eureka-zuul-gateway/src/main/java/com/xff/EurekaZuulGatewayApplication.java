package com.xff;

import com.xff.filter.TokenFileter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class EurekaZuulGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaZuulGatewayApplication.class, args);
	}


	@Bean
	public TokenFileter tokenFileter(){
		return new TokenFileter();
	}
}

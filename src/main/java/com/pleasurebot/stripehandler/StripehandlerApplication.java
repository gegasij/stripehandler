package com.pleasurebot.stripehandler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class StripehandlerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StripehandlerApplication.class, args);
	}

}

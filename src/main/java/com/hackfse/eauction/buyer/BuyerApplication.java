package com.hackfse.eauction.buyer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class BuyerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuyerApplication.class, args);
	}

}

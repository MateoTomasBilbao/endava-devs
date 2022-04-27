package com.endava.billing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication

public class BillingApplication {

	@GetMapping("/test")
	public String prueba() {
		return "Esto es una prueba..";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(BillingApplication.class, args);
	}

}
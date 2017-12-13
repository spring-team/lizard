package com.spiny.lizard;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@ComponentScan
@SpringBootApplication
public class LizardApplication {

	public static void main(String[] args) {
		SpringApplication.run(LizardApplication.class, args);
	}
}

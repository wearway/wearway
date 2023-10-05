package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@ComponentScan(basePackages = {"com/example/demo/controller", "com/example/demo/service", "com/example/demo/entity", "com/example/demo/repository"})
public class WearwayApplication {

	public static void main(String[] args) {
		SpringApplication.run(WearwayApplication.class, args);
	}

}

package com.Kalabekov.Computersservice;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ComputersServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComputersServiceApplication.class, args);
	}

}


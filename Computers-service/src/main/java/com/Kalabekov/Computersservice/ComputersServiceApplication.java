package com.Kalabekov.Computersservice;

import com.Kalabekov.Computersservice.model.Computer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ComputersServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComputersServiceApplication.class, args);
	}
	@Autowired
	CollectionHandler collectionHandler;

}


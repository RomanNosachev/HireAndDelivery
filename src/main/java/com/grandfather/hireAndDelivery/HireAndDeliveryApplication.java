package com.grandfather.hireAndDelivery;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HireAndDeliveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(HireAndDeliveryApplication.class, args);
		
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package com.springultimate.challenge1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springultimate.challenge1.entities.Order;
import com.springultimate.challenge1.services.OrderService;

@SpringBootApplication
public class Challenge1Application implements CommandLineRunner {

	
	@Autowired		
	private OrderService orderService;
	
	public static void main(String[] args) {
		SpringApplication.run(Challenge1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1034, 150.00, 20.0);
		System.out.println(orderService.total(order));	
	}

}

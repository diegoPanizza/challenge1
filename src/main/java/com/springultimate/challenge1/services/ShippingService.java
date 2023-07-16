package com.springultimate.challenge1.services;

import org.springframework.stereotype.Service;

import com.springultimate.challenge1.entities.Order;

@Service
public class ShippingService {

	public double shipment(Order order) {
		double shipment = 0.0;
		if(order.getBasic() < 100.00) {
			shipment = 20.0;
		}
		else if(order.getBasic() < 200.00) {
			shipment = 12.0;
		}
		return shipment;
	} 
}

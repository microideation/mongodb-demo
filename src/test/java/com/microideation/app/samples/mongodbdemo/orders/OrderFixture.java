package com.microideation.app.samples.mongodbdemo.orders;

import com.microideation.app.samples.mongodbdemo.domain.Address;
import com.microideation.app.samples.mongodbdemo.domain.Order;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class OrderFixture {

	public enum Items {
		ITEM1,ITEM2
	}
	
	public static Order standardOrder() {
	
		return Order.builder()
				.orderId(UUID.randomUUID().toString())
				.customerId(UUID.randomUUID().toString())
				.item(UUID.randomUUID().toString())
				.orderDate(LocalDate.now().format(DateTimeFormatter.ISO_DATE))
				.price(200.0)
				.qty(1.0)
				.deliveryAddress(Address.builder()
						.doorNo("101")
						.building("My Apts")
						.state("State")
						.street("7th St")
						.zipcode("892310")
						.build())
				.status("PENDING")
				.build();
		
	}
	
}

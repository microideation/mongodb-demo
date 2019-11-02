package com.microideation.app.samples.mongodbdemo.customers;

import com.microideation.app.samples.mongodbdemo.domain.Address;
import com.microideation.app.samples.mongodbdemo.domain.Customer;

import java.util.Arrays;
import java.util.Random;
import java.util.UUID;

public class CustomerFixture {
	
	public static Customer standardCustomer(String identifier,String name) {
		
		Random rand = new Random();
		return Customer.builder()
				.identifier(identifier)
				.mobile("111122223" + rand.nextInt(9))
				.name(name)
				.addresses(Arrays.asList(
						Address.builder()
							.doorNo("101")
							.building("My Apts " +identifier)
							.state("State")
							.street("7th St")
							.zipcode("892310")
							.build()				,
						
						Address.builder()
								.doorNo("102")
								.building("My 2nd Apts " +identifier)
								.state("State")
								.street("7th St")
								.zipcode("892311")
								.build(),
						
						Address.builder()
								.doorNo("102")
								.building("My 2nd Apts " + identifier)
								.state("State")
								.street("7th St")
								.zipcode("892311")
								.build()
				)).build();
	}
}

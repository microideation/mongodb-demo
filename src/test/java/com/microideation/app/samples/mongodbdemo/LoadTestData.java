package com.microideation.app.samples.mongodbdemo;

import com.microideation.app.samples.mongodbdemo.customers.CustomerFixture;
import com.microideation.app.samples.mongodbdemo.domain.Customer;
import com.microideation.app.samples.mongodbdemo.domain.Order;
import com.microideation.app.samples.mongodbdemo.orders.OrderFixture;
import com.microideation.app.samples.mongodbdemo.repository.CustomerRepository;
import com.microideation.app.samples.mongodbdemo.repository.OrderRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@Slf4j
public class LoadTestData {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Test
	public void loadTestData() {
	
		// Create the Customer1
		Customer customer1 = CustomerFixture.standardCustomer("1001","John Doe");
		customer1 = customerRepository.save(customer1);
		Assert.assertNotNull(customer1);
		
		// Create the Customer2
		Customer customer2 = CustomerFixture.standardCustomer("1002","Jane Doe");
		customer2 = customerRepository.save(customer2);
		Assert.assertNotNull(customer2);
		
		// Create the Customer3
		Customer customer3 = CustomerFixture.standardCustomer("1003","Jason Doe");
		customer3 = customerRepository.save(customer3);
		Assert.assertNotNull(customer3);
		
		// Create orders for the customer
		// Create for customer1
		Order order1 = OrderFixture.standardOrder();
		order1.setCustomerId(customer1.getIdentifier());
		order1.setPrice(300.0);
		order1.setItem(OrderFixture.Items.ITEM1.name());
		order1.setDeliveryAddress(customer1.getAddresses().get(0));
		order1 = orderRepository.save(order1);
		Assert.assertNotNull(order1);
		
		
		Order order2 = OrderFixture.standardOrder();
		order2.setCustomerId(customer1.getIdentifier());
		order2.setPrice(400.0);
		order2.setItem(OrderFixture.Items.ITEM2.name());
		order2.setDeliveryAddress(customer1.getAddresses().get(1));
		order2 = orderRepository.save(order2);
		Assert.assertNotNull(order2);
		
		// Create order for customer2
		Order order3 = OrderFixture.standardOrder();
		order3.setCustomerId(customer2.getIdentifier());
		order3.setPrice(400.0);
		order3.setItem(OrderFixture.Items.ITEM1.name());
		order3.setDeliveryAddress(customer2.getAddresses().get(1));
		order3 = orderRepository.save(order3);
		Assert.assertNotNull(order3);
		
	}
	
}

package com.microideation.app.samples.mongodbdemo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "customer-orders")
public class Order implements Serializable{

	@Id
	private String orderId;
	
	private String customerId;
	
	private String orderDate;
	
	private String item;
	
	private Double price;
	
	private Double qty;
	
	private String status;
	
	private Address deliveryAddress;
	
}

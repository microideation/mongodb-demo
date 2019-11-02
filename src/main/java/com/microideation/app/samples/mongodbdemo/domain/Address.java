package com.microideation.app.samples.mongodbdemo.domain;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class Address implements Serializable{

	private String doorNo;
	
	private String building;
	
	private String street;
	
	private String state;
	
	private String zipcode;
	
}

package com.microideation.app.samples.mongodbdemo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "customers")
public class Customer implements Serializable{

	@Id
	private String identifier;
	
	private String name;
	
	private String mobile;

	private List<Address> addresses;
	
}

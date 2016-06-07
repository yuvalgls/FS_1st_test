package com.forescout.test;

import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.map.annotate.JsonView;

public class CustomerData {
	@JsonView()
	private String firstName;

	@JsonView()
	private String lastName;

	@JsonView()
	private int age;

	@JsonView()
	private Map<String, String> address = new HashMap<String, String>();

	@JsonView()
	private Map<String, String> phoneNumbers = new HashMap<String, String>();

	CustomerData(String firstName, String lastName, int age,
			String streetAddress, String city, String postalCode, String type,
			String number) {
		// System.out.println("Setting Customer Data");
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;

		address.put("streetAddress", streetAddress);
		address.put("city", city);
		address.put("postalCode", postalCode);

		phoneNumbers.put("type", type);
		phoneNumbers.put("number", number);
	}
}

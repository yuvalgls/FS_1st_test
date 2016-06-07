package com.forescout.test;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class MainClass {
	static Logger log = Logger.getLogger(MainClass.class);

	public static void main(String[] args) {
		// System.out.println("Starting");
		ObjectMapper mapper = new ObjectMapper();
		// create the customer object
		CustomerData customer = new CustomerData("Yuval", "glasman", 31,
				"Petach Tiqwa", "Israel", "10021", "mobile", "+972-507467698");
		try {
			// Convert object to JSON string and save into file directly
			// mapper.writeValue(new File("C:\\jsontest.txt"), user);
			// System.out.println("Mapping Customer Data");
			// Convert object to JSON string
			String jsonInString = mapper.writeValueAsString(customer);
			// System.out.println(jsonInString);
			// log the json to a text file using log4j
			log.info("This is the customer json : " + jsonInString);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

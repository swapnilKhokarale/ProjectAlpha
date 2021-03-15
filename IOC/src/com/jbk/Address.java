package com.jbk;

import org.springframework.stereotype.Component;

@Component
public class Address {

	String city = "mumbai";
	String state = "india";

	public Address() {
	
		System.out.println("i am in const in address");
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
	
}

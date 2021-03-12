package com.jbk;

public class HSBC extends RBI {

	float insert = 8.5f;

	public double homeloneemi(double loneamount, float insert) {
		System.out.println("HSBC");

		return (loneamount * insert / 100) / 12;

	}
}

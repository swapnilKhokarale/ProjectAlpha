package com.jbk;

public class ICICI extends RBI{

	float insert = 8.5f;

	public double homeloneemi(double loneamount, float insert) {
		System.out.println("ICICI");

		return (loneamount * insert / 100) / 12;

	}
}

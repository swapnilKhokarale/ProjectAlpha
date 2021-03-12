package com.jbk;

public class HDFC extends RBI {

	float insert = 8.5f;

	public double homeloneemi(double loneamount, float insert) {
		System.out.println("HDFC");
		return (loneamount * insert / 100) / 12;

	}
}

package com.jbk2;

public class HDFC extends RBI {
	float intrest = 8.5f;

	public double homeloneemi(double loneAmount, float intrest) {
		System.out.println("in HDFC");
		return (loneAmount * intrest / 100) / 12;

	}
}

package com.jbk3;

public class ICICI extends RBI{

	float intrest = 8.5f;

	public double homeloneemi(double loneAmount, float intrest) {
		System.out.println("in ICICI");
		return (loneAmount * intrest / 100) / 12;

	}
}

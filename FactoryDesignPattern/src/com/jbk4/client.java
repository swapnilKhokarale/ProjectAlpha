package com.jbk4;

import com.jbk4.RBI;

public class client {

	public static void main(String[] args) {
		
		/*HDFC hdfc = new HDFC();
		hdfc.homeloneemi(23456f, 5.7f);
		System.out.println(hdfc);*/
		
		//HDFC rbi = new HDFC();
		RBI rbi = ObjectFactory.getObject("ICICI");

		System.out.println(rbi.homeloneemi(12345d, 6.9f));
	}
}

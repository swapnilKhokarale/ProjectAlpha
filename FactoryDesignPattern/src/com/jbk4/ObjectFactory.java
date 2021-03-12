package com.jbk4;

public class ObjectFactory {

	public static RBI getObject(String bankname) {

		if ("HDFC".equals(bankname)) {
			return new HDFC();
		}
		if ("HSBC".equals(bankname)) {
			return new KOTAK();
		}
		if ("ICICI".equals(bankname)) {
			return new ICICI();
		}

		return null;

	}
}

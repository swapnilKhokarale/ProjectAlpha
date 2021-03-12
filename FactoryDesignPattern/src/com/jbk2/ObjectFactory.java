package com.jbk2;

public class ObjectFactory {

	public static RBI getObject(String bankname) {

		if ("HDFC".equals(bankname)) {
			return new HDFC();
		}
		if ("HSBC".equals(bankname)) {
			return new HSBC();
		}
		if ("ICICI".equals(bankname)) {
			return new ICICI();
		}

		return null;

	}
}

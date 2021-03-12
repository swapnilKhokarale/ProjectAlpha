package com.jbk;

public class ObjectFectory {

	public static RBI getObject(String bankname){
		
		if("HDFC".equals(bankname)) {
			return new HDFC();
		}
		if("ICICI".equals(bankname)) {
			return new ICICI();
		}
		if("HSBC".equals(bankname)) {
			return new HSBC();
		}
		
		return null;
		
	}
}

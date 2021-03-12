package com.jbk;

public class Client {

	public static void main(String[] args) {
		
		//RBI rbi = new HDFC();
		try {
			RBI rbi  = ObjectFectory.getObject("pppp");
			System.out.println(rbi.homeloneemi(127865d, 8.5f));
		} catch (Exception e) {
			System.out.println("invalid bank");
		}
		
	
		
	}
}

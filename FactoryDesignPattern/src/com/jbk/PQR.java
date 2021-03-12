package com.jbk;

public interface PQR {

	void m2(int a);
}

class x {
	
	public static void main(String[] args) {
		
		PQR cc = (int a) ->System.out.println(a*a);
		cc.m2(5);
	}
	
}

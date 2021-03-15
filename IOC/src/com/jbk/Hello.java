package com.jbk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hello {

	public Hello() {
	System.out.println("i am in const in hello");
	}
	@Autowired
	Address addr ;
	
	public void show() {
		System.out.println(addr);
	}
}

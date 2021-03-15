package com.jbk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		/*Hello hh = new Hello();
		hh.show();*/
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Cofigure.class);
		Hello hh = ctx.getBean(Hello.class);
		hh.show();
	}
}

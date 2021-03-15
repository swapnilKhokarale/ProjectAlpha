package com.jbk;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class client {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(Student.class);
		cfg.configure().addAnnotatedClass(Country.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session =sf.openSession();
		/*	Student student = session.load(Student.class, 3);
		System.out.println(student.getSname());
		System.out.println(student.getSgread());
		Country  country = student.getCountry();
		System.out.println(country.getCname());
	*/
		
		/*Criteria criteria = session.createCriteria(Student.class);
		List<Student>list = criteria.list();
		System.out.println(list);*/
		
		Query query =session.createQuery(" from Student");
		List<Student>li=query.list();
		System.out.println(li);
		System.out.println("swapnil");
		
	}
}

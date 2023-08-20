package com.hibernate.Mappings.Assosiation_mapping.onetoone;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.Mappings.factory.Factory;

public class OneToOneMain {
	
	public static void main(String[] args) {
		Session session=Factory.getSession();
		Transaction tx=session.beginTransaction();
		/*
		 * Student std=new Student("Ruhi", new Address(201304L,"GZB", "Up",
		 * "Shakti khand"), new Date()); Integer id=(Integer)session.save(std);
		 */
//		Parent p=new Parent("this is str", new Child("child class content", 23.43), new Date());
		Parent p=new Parent("Deepak kumar", new Child("Deepak kumar details", 23.43), new Date());
		Integer id=(Integer)session.save(p);
		System.out.println("Data is saved with ID "+id);
		tx.commit();
		session.close();
	}
}

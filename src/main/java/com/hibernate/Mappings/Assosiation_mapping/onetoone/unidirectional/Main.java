package com.hibernate.Mappings.Assosiation_mapping.onetoone.unidirectional;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.Mappings.factory.Factory;

public class Main {
	public static void main(String[] args) {
		Session session=Factory.getSession();
		Transaction tx=session.beginTransaction();
//		Student std=new Student("Ruhi verma", new Date("17/11/2001"), new Date());
//		Address add=new Address("shakti khand", "Gzb", 201301L, "UP");
//		std.setAddress(add);
//		Integer id=(Integer)session.save(std);
//		System.out.println("Data is saved with ID "+id);
//		Student std1=session.get(Student.class, 1);
//		Address add=session.get(Address.class, 1);
//		System.out.println(add);
//		tx.commit();
		session.close();
		
	}
}

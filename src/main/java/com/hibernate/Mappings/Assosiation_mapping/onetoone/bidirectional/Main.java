package com.hibernate.Mappings.Assosiation_mapping.onetoone.bidirectional;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.Mappings.factory.Factory;

public class Main {
	public static void main(String[] args) {
		Session session=Factory.getSession();
		Transaction tx=session.beginTransaction();
		Student std=new Student("Deep", new Date("19/05/2011"), new Date());
		Address add=new Address("Ruhi", "bsr", 1347822L, "UP");
		std.setAddress(add);
		Integer id=(Integer)session.save(std);
		System.out.println("Data is saved with ID "+id);
//		Student std=session.get(Student.class, 1);
//		Address add=session.get(Address.class, 1);
//		System.out.println(add);
//		System.out.println(add.getStd());
		tx.commit();
		session.close();
	}
}

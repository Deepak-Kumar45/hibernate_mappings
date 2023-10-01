package com.hibernate.Mappings.simple_mapping;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.Mappings.factory.Factory;

public class MappingWithHibernateLifeCycle 
{
	public static void main(String[] args)
	{
			Session session=Factory.getSession();
			Transaction tx=session.beginTransaction();
			
//			In hibernate there are total 4 hibernate life cycle states given below
//			1) Transient state: when object is newly created nd its properties were initialized
//			Student std=new Student("deepak kumar", "deep@gmail.com", new Date());
//			Letter Letter=new Letter("police line roat", "bulandshahr", "UP", 203001);
//			std.setAddress(Letter);
//			Transient state: not available in database and hibernate session  
			
//			2) Persistant state: when we save() or update the data in database.
//			session.save(std);
//			Persistant state: available in database as well as session.
//			std.setName("Ruhi verma");
//			when the data is in persistent state so if we made changes in persistence object so they will
//			reflect in database after saving the data in database.
			
			
			
//			3) Detached state: when object is associated with database but not assosiated with session
//			it can be done by using clear(), close(), evict() functions.
//			session.clear();
//			std.setName("test1001");
//			when the data is in detached state so if we made changes in persistence object so they will
//			not reflect in database after saving the data in database.
			
//			4) removed state: when the persistect object is not assosiated with database but assosiate with session.
			
			Student std=session.get(Student.class, 4);
			System.out.println(std);
//			session.remove(std);

			
			Student std2=session.get(Student.class, 4);
			System.out.println(std2);
//			now when i get the data using get() method so data is present in database and session.
//			if i delete the data from database but data is present in session so this is called removed state.
			
			session.clear();
			
			Student std3=session.get(Student.class, 4);
			System.out.println(std3);
			
			
			
			
			/*
			 * Student std=new Student("deepak kumar", "deep@gmail.com", new Date()); Letter
			 * Letter=new Letter("police line roat", "bulandshahr", "UP", 203001);
			 * std.setAddress(Letter); int id=(Integer)session.save(std);
			 * System.out.println("Data is added with ID "+id);
			 */
			tx.commit();
			session.close();
			
		
		
	}
}

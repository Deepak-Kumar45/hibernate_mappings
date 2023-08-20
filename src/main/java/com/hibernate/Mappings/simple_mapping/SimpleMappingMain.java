package com.hibernate.Mappings.simple_mapping;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.Mappings.factory.Factory;

public class SimpleMappingMain 
{
	public static void main(String[] args)
	{
			Session session=Factory.getSession();
			Transaction tx=session.beginTransaction();
			Student std=new Student("deepak kumar", "deep@gmail.com", new Date());
			Letter Letter=new Letter("police line roat", "bulandshahr", "UP", 203001);
			std.setAddress(Letter);
			int id=(Integer)session.save(std);
			System.out.println("Data is added with ID "+id);
			tx.commit();
			session.close();
			
		
		
	}
}

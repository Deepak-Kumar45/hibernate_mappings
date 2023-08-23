package com.hibernate.Mappings.Assosiation_mapping.manytoone;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Transient;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.Mappings.factory.Factory;

public class ManyToOne {
	public static void main(String[] args) {
		Session ses=Factory.getSession();
		Transaction tx=ses.beginTransaction();
		Product p1=new Product("Shampoo", 2, new Date());
		List<Details> details =new ArrayList<>();
		details.add(new Details(101,"Dove", new Date("01/05/2001")));
		details.add(new Details(102,"clinic plus", new Date("01/05/2009")));
		details.add(new Details(103,"Paatene", new Date("01/05/2031")));
		
		p1.setDetails(details);
		Integer id=(Integer)ses.save(p1);
		System.out.println("Data has been saved with Id "+id);
		tx.commit();
		ses.close();
	}
}

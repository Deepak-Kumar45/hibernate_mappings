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
//		Product p1=new Product("Shampoo", 2, new Date());
//		
//		Details d2=new Details("h1", new Date());
//		Details d3=new Details("h4", new Date());
//		Details d4=new Details("h3", new Date());
//		
//		p1.setDetails(List.of(d2,d3,d4));
//		
//		d2.setProduct(p1);
//		d3.setProduct(p1);
//		d4.setProduct(p1);
//		
//		Integer id=(Integer)ses.save(p1);
//		System.out.println("Data has been saved with Id "+id);
//		Product p=ses.get(Product.class, 1);
//		System.out.println(p);
//		System.out.println(p.getDetails());
		
		Details d=ses.get(Details.class, 1);
		System.out.println(d);
		System.out.println(d.getProduct());
		tx.commit();
		ses.close();
	}
}

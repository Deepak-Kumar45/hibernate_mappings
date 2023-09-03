package com.hibernate.Mappings.Assosiation_mapping.manytomany;

import java.util.Date;
import java.util.List;

import javax.print.Doc;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.Mappings.factory.Factory;

public class ManyToManyMain {
	
	public static void main(String[] args) 
	{
		Session session=Factory.getSession();
		Transaction tx=session.beginTransaction();
		
//		Doctor d1=new Doctor("Dr. singh", "Brain expert", new Date());
//		Doctor d2=new Doctor("Dr. Prachi", "ENT expert", new Date());
//		Doctor d3=new Doctor("Dr. Deeksha", "Dentist", new Date());
//		
//		Patient p1=new Patient("Pt.no-1", "Brain migraine", new Date());
//		Patient p2=new Patient("Pt.no-2", "tooth bleeding, nose pain", new Date());
//		Patient p3=new Patient("Pt.no-3", "migraine, tooth replacement, nose pain", new Date());
//		
//		d1.setPatients(List.of(p1,p3));
//		d2.setPatients(List.of(p2,p3));
//		
//		session.save(d1);
//		session.save(d2);
//		System.out.println("Doctors data has been successfully updated..");
//		
//		p1.setDoctors(List.of(d1,d3));
//		p2.setDoctors(List.of(d2,d3));
//		p3.setDoctors(List.of(d1,d3,d2));
//		
//		session.save(p1);
//		session.save(p2);
//		session.save(p3);
//		System.out.println("Patients data has been successfully updated..");
		
		
		Doctor d1=session.get(Doctor.class, 3);
		System.out.println(d1);
		System.out.println(d1.getPatients());
		
//		Patient p1=session.get(Patient.class, 3);
//		System.out.println(p1);
//		System.out.println(p1.getDoctors());
		
		tx.commit();
		session.close();
		
		
	}
}

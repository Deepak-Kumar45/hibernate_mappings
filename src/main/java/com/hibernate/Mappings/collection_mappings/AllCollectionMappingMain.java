package com.hibernate.Mappings.collection_mappings;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.Mappings.factory.Factory;

public class AllCollectionMappingMain {
	public static void main(String[] args) {
		Session session = Factory.getSession();
		Transaction tx = session.beginTransaction();
		
//		1). array example
//		AllCollectionMappingExample collection = new AllCollectionMappingExample("Bhavna rani", "rani@gmail.com", 12355.22,
//				new Date("07/12/1998"), new Date());
//		String docs[] = { "caste certificate", "birth certificate","domicile" };
//		collection.setDocs(docs);
		
//		2). List example
//		AllCollectionMappingExample list=new AllCollectionMappingExample("sonu", "sonu@gmail.com", 4000.32, new Date("29/01/2010"), new Date());
//		List<String> subs=List.of("Java","Python","c++");
//		collection.setSubjects(subs);
		
//		3). bag example
//		AllCollectionMappingExample bag=new AllCollectionMappingExample("chinky", "chinky@gmail.com", 25663.32, new Date("30/10/2002"), new Date());
//		List<Integer> marks=List.of(24,53,35);
//		collection.setMarks(marks);
		
//		4). set example
//		AllCollectionMappingExample set=new AllCollectionMappingExample("ruhi", "ruhi@gmail.com", 22223.32, new Date("20/12/1992"), new Date());
//		Set<String> dress=Set.of("Skirt","shirt","blazer");
//		collection.setDress(dress);
		
//		5) Map example
//		AllCollectionMappingExample map=new AllCollectionMappingExample("manoj kumar", "manoj@gmail.com", 12345.67, new Date("16/03/2004"), new Date());
//		Map<String, String> parents=new HashMap();
//		parents.put("Bhuli devi", "Mother");
//		parents.put("manoj kumar", "brother");
//		
//		collection.setParentDetails(parents);
		
		Free free=new Free("likh diya kuch bh");
		List<String> list=List.of("ramu","shayamu","radha","raman");
		free.setNames(list);
		
		Integer id = (Integer) session.save(free);
		System.out.println("Data is saved with ID " + id);
		tx.commit();
		session.close();

	}
}

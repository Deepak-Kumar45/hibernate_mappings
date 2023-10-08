package com.hibernate.Mappings.Assosiation_mapping.onetomany;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hibernate.Mappings.Assosiation_mapping.manytoone.Details;
import com.hibernate.Mappings.Assosiation_mapping.manytoone.Product;
import com.hibernate.Mappings.factory.Factory;

public class OneToManyMain {
	public static void main(String[] args) 
	{
		Session session=Factory.getSession();
		Transaction tx=null;
	
//		Product p=new Product("shampoo", 2, new Date());
//		List<Details> details=List.of(new Details("dove", new Date("10/20/2001")),
//				new Details("vatila", new Date("10/21/2001")),
//				new Details("clinic plus", new Date("10/03/2001")));
//		p.setDetails(details);
//	Student std=new Student("Pinkesh", new Date("02/02/2001"), new Date());
//	List<Course> players=List.of(new Course("BCA", 3, "Rahul"),
//			new Course("BCA", 2, "manoj"),
//			new Course("BTech", 4, "sonal"));
//	std.setCourses(players);
		
//		CricketTeam team= new CricketTeam("KKR", "Kolkata",  new Date());
//		List<Player> players=List.of(new Player(2001, "Abc", "all rounder", 45),
//									 new Player(2002, "def", "bowler", 32),
//									 new Player(2003, "ghi", "Batsman", 30));
//		team.setPlayers(players);
		
		
//		Client client=new Client("priti singahniya", "delhi", new Date());
//		Set<PhoneNo> phns=Set.of(new PhoneNo(1234567890L, "VI", "HOME"),new PhoneNo(10987654321L, "VI", "work"));
//		client.setPhnNos(phns);
		
		try {
			tx=session.beginTransaction();
			
			String str="select c.teamName,c.state,p.name,p.type,p.age "
					+ "from com.hibernate.Mappings.Assosiation_mapping.onetomany.CricketTeam c INNER JOIN c.players p";
			Query query=session.createQuery(str);
			List<Object[]> list=query.list();
			System.out.println(list);
			for(Object[] i:list) {
				System.out.println(Arrays.toString(i));
			}
			tx.commit();
//			Integer id= (Integer)session.save(p);
//			System.out.println("Data has been saved with ID "+id);
//			CricketTeam team=session.load(CricketTeam.class, 2);
//			System.out.println(team);
			
//			String str="select c.name,c.address,p.number,p.provider from "
//					+ "Client c INNER JOIN c.phnNos p";
//			Now here as we use join query so it will return the data of two tables so we cannot specify a 
//			single class in generic type so we create query object without generic type.
//			Query c=session.createQuery(str);
			
//			And as the query object return the mix data of two tables so we cannot specify a single class
//			in generic type instead of we need to specfiy and object array that accept every element returned 
//			after joining and store it in an object array after that we can traverse that object array.
//			List<Object[]> list = c.list();
//			for (Object[] client : list) {
//				so we use Arrays.toString() method and pass the object Array and it will print the values
//				System.out.println(Arrays.toString(client));
//			}
			
			
		}catch (Exception e) {
			tx.commit();
			e.printStackTrace();
		}finally {
			Factory.closeSession();
		}
		
		
	}
}

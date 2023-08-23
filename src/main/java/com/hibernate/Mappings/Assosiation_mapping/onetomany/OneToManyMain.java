package com.hibernate.Mappings.Assosiation_mapping.onetomany;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

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
//			Integer id= (Integer)session.save(p);
//			System.out.println("Data has been saved with ID "+id);
//			CricketTeam team=session.load(CricketTeam.class, 2);
//			System.out.println(team);

			tx.commit();
		}catch (Exception e) {
			tx.commit();
			e.printStackTrace();
		}finally {
			Factory.closeSession();
		}
		
		
	}
}

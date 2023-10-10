package com.hibernate.Mappings.hql_example;

import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cache.ehcache.internal.EhcacheRegionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.hibernate.internal.build.AllowSysOut;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;

import com.hibernate.Mappings.factory.Factory;

public class Main {

	public static void main(String[] args) {
		System.out.println("!!..Application has been started..!!");
		Session session = Factory.getSessionFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();

//		Named Query in hibernate
//		Query<SampleDataEntity> q=session.createNamedQuery("findEmpByName", SampleDataEntity.class);
//		Now to avoid collision in query names we can preflix class name in the name of named queries.
//		Query<SampleDataEntity> q=session.createNamedQuery("SDE_findEmpByName", SampleDataEntity.class);
//		q.setParameter("anyname","Riley Padilla");
//		q.list().forEach(i->System.out.println(i));
		
//		1) find emp by id
		Query<SampleDataEntity> q=session.createNamedQuery("SDE_findEmpById", SampleDataEntity.class);
		q.setParameter("anyid", "E01417");
		q.list().forEach(i->System.out.println(i));
		
//		Query q2=session.getNamedQuery("SDE_updateDesgByName");
//		q2.setParameter("anyname", "Leah Pena");
//		q2.setParameter("newdesg", "Java Developer");
//		int rowseff=q2.executeUpdate();
//		System.out.println(rowseff+" rows Effected");
		
		Query<SampleDataEntity> q3=session.createNamedQuery("SDE_deleteEmpById");
		q3.setParameter("anyid", "E01417");
		int rowseff=q3.executeUpdate();
		System.out.println(rowseff+" rows Effected");
//		
		tx.commit();
//		Criteria API in hibernate
//		Criteria api in hibernate is used to fetch the large amount of data based on some restrictions.
//		Criteria cr=session.createCriteria(SampleDataEntity.class);
//		cr.add(Restrictions.eq("gender", "male"));   // equal
//		cr.add(Restrictions.gt("age", 30));			// greater than
//		cr.add(Restrictions.lt("age", 30));			// less than	
//		cr.add(Restrictions.like("name", "d%"));	// name startes with d
//		cr.add(Restrictions.ilike("name", "%z"));	// name ends with z
//		cr.add(Restrictions.ilike("name", "%a%"));	// come a anywhere in name
//		cr.add(Restrictions.between("date", new Date("01/01/2015"), new Date("01/01/2020")));
		
//		find the list of employee whose name starts with K and worked between 2020-> present
//		Criterion name=Restrictions.ilike("name", "k%");
//		Criterion worked=Restrictions.between("date", new Date("01/01/2010"), new Date());
//		Criterion worked=Restrictions.between("date", new Date("01/01/2020"), new Date());
		
//		cr.add(Restrictions.and(name, worked));
//		cr.add(Restrictions.or(name, worked));
//		cr.list().forEach(i->System.out.println(i));

//		Second Level cache
//		SessionFactory factory=Factory.getSessionFactory();

//		Session session1=factory.openSession();
//		Transaction tx=session1.beginTransaction();
//		SampleDataEntity entity1=session1.get(SampleDataEntity.class, 9);
//		tx.commit();
//		System.out.println(entity1);

//		session1.close();

//		Session session2=factory.openSession();
//		Transaction tx1=session2.beginTransaction();
//		SampleDataEntity entity2=session2.get(SampleDataEntity.class, 9);
//		tx1.commit();
//		System.out.println(entity2);

//		session2.close();

//		For retrieving the bulk data from database we use HQL
//		In order to use HQL hibernate session interface provides Query interface.
//		As HQL can be used to modify as well as retrieve the data from database we also need to implement transactions.
//		Session session=Factory.getSession();
//		Transaction tx=session.beginTransaction();

//		String str="from SampleDataEntity";
//		String str="from com.hibernate.Mappings.hql_example.SampleDataEntity";
//		Query<SampleDataEntity> query=session.createQuery(str, SampleDataEntity.class);

//		By using Query interface we can get two type of data
//		1) list of data
//		List<SampleDataEntity> list=query.list();
//		for (SampleDataEntity sampleDataEntity : list) {
//			System.out.println(sampleDataEntity);
//		}
//		2) unique data
//		String str="from SampleDataEntity where name='Ruby Barnes' and empid='E01550'";
//		Query<SampleDataEntity> query=session.createQuery(str, SampleDataEntity.class);
//		SampleDataEntity maxAgedEmployee=query.uniqueResult();
//		System.out.println(maxAgedEmployee);

//		3) Using Named Parameter
//		String str="from SampleDataEntity where empid=:anyid";
//		Query<SampleDataEntity> query=session.createQuery(str, SampleDataEntity.class);
//		query.setParameter("anyid", "E00644");
//		List<SampleDataEntity> list=query.list();
//		list.forEach(i->System.out.println(i));

//		4) using alias in HQL
//		String str="from SampleDataEntity as sde where sde.desg=:anydesg or sde.dept=:anydept";
//		Query<SampleDataEntity> query=session.createQuery(str, SampleDataEntity.class);
//		query.setParameter("anydesg", "");
//		query.setParameter("anydept", "Accounting");
//		List<SampleDataEntity> list=query.list();
//		list.forEach(i->System.out.println(i));

//		5) delete data using HQL
//		String str="delete from SampleDataEntity where empid=:anyid";
//		Query<SampleDataEntity> q=session.createQuery(str);
//		q.setParameter("anyid", "E00591");
//		int effectedRows=q.executeUpdate();
//		System.out.println(effectedRows+" rows effected");

//		5) update data using HQL
//		String str="update SampleDataEntity set name=:newname where empid=:oldid";
//		Query<SampleDataEntity> query=session.createQuery(str);
//		query.setParameter("newname", "Akansh Gupta");
//		query.setParameter("oldid", "E00644");
//		int rows=query.executeUpdate();
//		System.out.println(rows+" rows effected");

//		6) Pagination in HQL
//		String str="from SampleDataEntity";
//		Query<SampleDataEntity> query=session.createQuery(str);
//		query.setFirstResult(20);		// start kaha se kre
//		query.setMaxResults(4);			// starting point se kitne result
//		query.list().forEach(i->System.out.println(i));

//		7) Execute native queries using HQL
//		now here tbl_upload_data is a database table nd we need to execute this pure sql query using HQL
//		String str="select name,empid,desg from tbl_upload_data_from_excel";
//		 NativeQuery createNativeQuery = session.createNativeQuery(str);
//		 List<Object[]> list=createNativeQuery.list();
//		 list.forEach(i->System.out.println(Arrays.toString(i)));

//		8) First level cache
//		SampleDataEntity sampleDataEntity = session.get(SampleDataEntity.class, 7);
//		System.out.println(sampleDataEntity);
//		SampleDataEntity sampleDataEntity2 = session.get(SampleDataEntity.class, 7);
//		System.out.println(sampleDataEntity2);
//		
//		System.out.println(session.contains(sampleDataEntity2));
//		session.clear();
//		System.out.println(session.contains(sampleDataEntity2));
//		SampleDataEntity sampleDataEntity3 = session.get(SampleDataEntity.class, 7);
//		System.out.println(sampleDataEntity3);

//		tx.commit();

	}

}

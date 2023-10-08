package com.hibernate.Mappings.factory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Factory {
	private static SessionFactory factory;

	static {
		factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	}

	public static Session getSession(){
		return factory.getCurrentSession();
	}
	
	public static SessionFactory getSessionFactory() {
		return factory;
	}
	public static void closeSession()
	{
		getSession().close();
	}
}

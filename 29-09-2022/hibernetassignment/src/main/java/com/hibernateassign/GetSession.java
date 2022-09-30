package com.hibernateassign;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class GetSession {
	public static Session getSession(){
		 SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	        Session session=factory.openSession();
	        
	        return session;
		
	}

}

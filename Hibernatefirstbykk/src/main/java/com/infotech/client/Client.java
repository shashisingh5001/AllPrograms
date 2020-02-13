package com.infotech.client;

import org.hibernate.Hibernate;
import org.hibernate.query.QueryProducer;

import com.infotech.util.HibernateUtil;
import com.mysql.cj.api.Session;

public class Client {

	public static void main(String[] args) {
		
		try
		{
			Session session = (Session) HibernateUtil.getSessionFactory().openSession();
			String SQL="Select version()";
			String result =(String) ((QueryProducer) session).createNativeQuery(SQL).getSingleResult();
			
			System.out.println("My SQL VERSION ::::");
			System.out.println(result);
			
		
			
		}catch (Exception e) {
			e.printStackTrace();
		}

		
	}
}

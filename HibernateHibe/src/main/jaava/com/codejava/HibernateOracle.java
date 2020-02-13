package com.codejava;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateOracle {

	public static void main(String[] args) throws SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException {
		
		Configuration config =new Configuration();
		
		config.setProperty("hibernate.connection.driver_class","oracle.jdbc.driver.OracleDriver");
		config.setProperty("hibernate.connection.url","jdbc:oracle:thin:@localhost:1521:xe");
		config.setProperty("hibernate.connectio.username","system");
		config.setProperty("hibernate.connection.password","system");
		config.setProperty("hibernate.dialect", "oracle.jdbc.driver.OracleDriver");
		
        config.addAnnotatedClass(Customer.class);
        
        SessionFactory sessionFactory=config.buildSessionFactory();
        Session session = sessionFactory.openSession();
        
        org.hibernate.Transaction transaction=session.beginTransaction();
        session.save(new Customer("Shashi","shashisingh5001@gamil.com"));
        transaction.commit();
        session.close();
        sessionFactory.close();
        
	}
}

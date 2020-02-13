package com.boraji.tutorial.hibernate;

import org.hibernate.Session;

/**
 * @author imssbora
 */
public class TestMain {
  public static void main(String[] args) {
    Session session = HibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();

    // Check database version
    String sql = "select version()";

    String result = (String) session.createNativeQuery(sql).getSingleResult();
    System.out.println(result);

    session.getTransaction().commit();
    session.close();

    
    HibernateUtil.shutdown();
  }
}
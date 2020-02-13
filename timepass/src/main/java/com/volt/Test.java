package com.volt;

import org.hibernate.SessionFactory;

import com.volt.model.Volt;

public class Test {

	private static SessionFactory sf;
	
	public static void main(String[] args) {
		
		//sf=new org.hibernate.cfg.Configuration().configure().addAnnotatedClass(Volt.class).buildSesionFactory();
		
		try {
			//System.out.println("hiiii");
			

			org.hibernate.Transaction tx = null;
			try {
				sf = new org.hibernate.cfg.Configuration().configure().addAnnotatedClass(Volt.class).buildSessionFactory();
			} catch (Exception e) {
				
				System.out.println(e);
			}
			System.out.println("hiiii");

			Volt v = getvolt();
			org.hibernate.Session session = sf.openSession();
			tx = session.beginTransaction();
			Integer id = (Integer) session.save(v);
			System.out.println("ID" + id);
			tx.commit();
			
			session.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
	
	 public static Volt getvolt()
	 {
		 Volt v=new Volt();
		 v.setName("Lashkya");
		 v.setDec("SD");
		return v;
		 
	 }

	
}

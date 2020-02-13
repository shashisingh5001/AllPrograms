package com.shashi;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import com.shashi.model.Employee;

public class TestMain {

	private static SessionFactory sf;
	public static void main(String[] args) {
		org.hibernate.Transaction tx=null;
		try 	
		{
			sf= new org.hibernate.cfg.Configuration().configure().addAnnotatedClass(Employee.class).buildSessionFactory();
			Employee employee = getEmployee();		
			org.hibernate.Session session= sf.openSession();
			tx=session.beginTransaction();
			
			Integer id=(Integer) session.save(employee);
			System.out.println("ID No."+id);
			tx.commit();
			if(id>0) {
			System.out.println("Stored");
			}
			session.close();
			
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
		}
	}
	private static Employee getEmployee()
	{
		Employee employee=new Employee();
		
		employee.setEmpname("ZZZ");
		employee.setPno("8550972829");
	
		
		return employee;
		}

}

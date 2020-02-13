package com.infotech.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientTest 
{
  public static void main(String[] args) 
 {
	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	
	 Message message = context.getBean("message",Message.class);
	 
	   message.setMessageId(1000200);
	   message.setMessage("Shashi");
	   
	   System.out.println(message.getMessageId()+"\t"+message.getMessage());
	   
	   ((AbstractApplicationContext) context).close();
	 
			
}
}

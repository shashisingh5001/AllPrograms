package com.spring;

import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class ClientTest
{

	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
	   
		Message message=context.getBean("message",Message.class);
		System.out.println(message.getMessageId()+"\t"+message.getMessage());
		
		((AbstractApplicationContext) context).close();
	
		
	}

}

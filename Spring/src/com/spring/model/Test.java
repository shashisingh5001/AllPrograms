package com.spring.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {  
  
public static void main(String[] args) {  
    ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");  
      
    EmployeeDao employee=(Employee)ctx.getBean("employee");  
    int status=employee.saveEmployee(new Employee(102,"Amit",35000));  
    System.out.println(status);  
          
    
      
}  
  
}  
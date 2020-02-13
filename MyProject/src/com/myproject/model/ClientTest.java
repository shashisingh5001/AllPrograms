package com.myproject.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientTest
{
   public static void main(String[] args) 
   {
	 ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	 
	 Game game=context.getBean("game",Game.class);
	 
	  game.setgameId(102612);
	  game.setgameName("sidvi");
	  
	  System.out.println(game.getgameId()+"\t"+game.getgameName());
	  
	  ((AbstractApplicationContext) context).close();
}
}

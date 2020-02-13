package com.myproject.model;

import org.springframework.stereotype.Component;

@Component
public class Game 
{
   private int gameId;
   private String gameName;
   
public int getgameId() {
	return gameId;
}
public void setgameId(int gameId) {
	this.gameId = gameId;
}
public String getgameName() {
	return gameName;
}
public void setgameName(String gameName) {
	this.gameName = gameName;
}
   
   

}
   
   
   


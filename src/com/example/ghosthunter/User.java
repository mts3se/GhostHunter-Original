package com.example.ghosthunter;

public class User 
{
	private int life;
	private int points;
	private String name = null;
	private double userXLocation;
	private double userYLocation;
	
	
//	//public User(String name)
//	{
//		this.name = name;
//		this.points = 0;
//		this.life = 10;
//	}
//	
	
	public int getPoints()
	{
		return this.points;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getLife()
	{
		return this.life;
	}
	
	public void decreaseLife()
	{
		life--;
	}
	
	public void increaseLife()
	{
		life++;
	}
	
	public void increaseLife(int amount)
	{
		life = life + amount;
	}
	
	public void increasePoints()
	{
		points++;
	}
	
	public void increasePoints(int amount)
	{
		points = points + amount;
	}
	
	
	
}

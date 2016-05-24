package jpu2016.dogfight.model;

public class Missile extends Mobile{
	static int SPEED = 4;
	int WIDTH = 30;
	static int HEIGHT = 10;
	int MAX_DISTANCE_TRAVELED = 100;
	static String IMAGE = "missile";
	int distanceTraveled = 0;
	
	//Constructeur
	public Missile(Direction direction, Dimension dimension){
		super(direction, new Position(0,0,0,1), dimension, SPEED, IMAGE);
	}
	
	//Autre fonction
	public int getWidthWithADirection(Direction direction){
		return 1;
	}
	public int getHeightWithADirection(Direction direction){
		return 1;
	}
	public void move(){
		
	}
	public boolean isWeapon(){
		return true;
	}
}

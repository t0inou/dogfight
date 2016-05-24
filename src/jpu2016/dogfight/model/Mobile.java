package jpu2016.dogfight.model;

import java.awt.*;

public class Mobile implements IMobile{
	int speed;
	Direction direction;
	Position position;
	Dimension dimension;
	Image image;
	DogfightModel dogfightModel;
	
	//Constructeur
	public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image){
		this.direction = direction;
		this.position = position;
		this.dimension = dimension;
		this.speed = speed;
	}
	
	//Methodes dans IMobile
	public Direction getDirection(){
		return direction;
	}
	public void setDirection(Direction direction){
		this.direction = direction;
	}
	public Position getPosition(){
		return position;
	}
	public Dimension getDimension(){
		return dimension;
	}
	public int getWidth(){
		return 1;
	}
	public int getHeight(){
		return 1;
	}
	public int getSpeed(){
		return 1;
	}
	public Image getImage(){
		return image;
	}
	public void move(){
		
	}
	public void placeInArea(IArea area){
		
	}
	public boolean isPlayer(){
		return true;
	}
	public void setDogfightModel(DogfightModel dogfightModel){
		this.dogfightModel = dogfightModel;
	}
	public boolean hit(){
		return true;
	}
	public boolean isWeapon(){
		return true;
	}
	
	//Méthode
	public void moveUp(){
		
	}
	public void moveRight(){
		
	}
	public void moveDown(){
		
	}
	public void moveLeft(){
		
	}
	public Color getColor(){
		return new Color(1);
	}
	public IDogfightModel getIDogfightModel(){
		return dogfightModel;
	}
	
}

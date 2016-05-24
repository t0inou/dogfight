package jpu2016.dogfight.model;

public class Cloud extends Mobile{
	static int SPEED = 1;
	int WIDTH = 300;
	static int HEIGHT = 150;
	static String IMAGE = "cloud";
	
	//Constructeur
	public Cloud(Direction direction, Dimension dimension){
		super(direction, new Position(1,1,1,1), dimension, SPEED, IMAGE);
	}
}

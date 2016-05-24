package jpu2016.dogfight.model;

public class Plane extends Mobile{
	static int SPEED = 2;
	static int WIDTH = 100;
	static int HEIGHT = 30;
	int player;
	
	//Constructeur
	public Plane(int player, Direction direction, Position position, String Image){
		super(direction, position, new Dimension(WIDTH, HEIGHT), SPEED, Image);
		this.player = player;
	}
	
	public boolean isPlayer(int player){
		return true;
	}
	
	public boolean hit(){
		return false;
	}
}

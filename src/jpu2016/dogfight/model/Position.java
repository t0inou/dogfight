package jpu2016.dogfight.model;

public class Position {
	double x;
	double y;
	
	double maxX;
	double maxY;
	
	//Constructeur
	public Position(double x, double y, double maxX, double maxY){
		
	}
	public Position(Position position){
		
	}
	
	//Assesseur
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public void setMaxX(double maxX) {
		this.maxX = maxX;
	}
	public void setMaxY(double maxY) {
		this.maxY = maxY;
	}
	
}

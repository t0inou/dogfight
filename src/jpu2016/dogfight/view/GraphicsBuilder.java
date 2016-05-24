package jpu2016.dogfight.view;

import java.awt.Graphics;
import java.awt.image.ImageObserver;

import jpu2016.gameframe.IGraphicsBuilder;

public class GraphicsBuilder implements IGraphicsBuilder{
	private int width;
	private int height;
	
	@Override
	public int getGlobalWidth(){
		return this.width;
	}
	@Override
	public int getGlobalHeight(){
		return this.height;
	}
	@Override
	public void applyModelToGraphic (Graphics graphics, ImageObserver obs){
		
	}
	
}

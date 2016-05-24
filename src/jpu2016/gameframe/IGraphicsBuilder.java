package jpu2016.gameframe;

import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.util.Observable;

public interface IGraphicsBuilder {
	public void applyModelToGraphic(Graphics graphics, ImageObserver obs);
	public int getGlobalHeight();
	public int getGlobalWidth();
}

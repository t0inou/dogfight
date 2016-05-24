package jpu2016.gameframe;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Observer{

	public GamePanel (IGraphicsBuilder graphicBuilder){
		
	}
	
	public void paintComponent (Graphics graphic){
		
	}
	
	@Override
	public void update(final Observable obs, Object obj){
		this.repaint();
	}
}

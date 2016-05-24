package jpu2016.gameframe;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;

import javax.swing.JFrame;

public class GameFrame extends JFrame implements KeyListener{
	public GameFrame(String title, IEventPerformer performer, IGraphicsBuilder graphicBuilder, Observable obs){
		this.setTitle(title);
		this.setDefaultCloseOperation(3);
		this.setResizable(false);
		this.setVisible(true);
		final GamePanel gamePanel = new GamePanel(graphicBuilder);
		this.setContentPane(gamePanel);
		this.setSize(1280, 720);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		obs.addObserver(gamePanel);
	}
	
	@Override
	public void keyPressed(KeyEvent keyEvent){
		
	}
	@Override
	public void keyReleased(KeyEvent keyEvent){
		
	}
	@Override
	public void keyTyped (KeyEvent keyEvent){
		
	}
}

package jpu2016.dogfight.view;

import java.awt.event.KeyEvent;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.controller.UserOrder;
import jpu2016.gameframe.IEventPerformer;

public class EventPerformer implements IEventPerformer{
	UserOrder test = new UserOrder(); //suppression de la faute
	
	public EventPerformer(IOrderPerformer orderPerformer){
		
	}
	
	public UserOrder keyCodeToUserOrder(int keyCode){
		return test;
	}
	
	@Override
	public void eventPerform(KeyEvent keyCode){
		
	}
}

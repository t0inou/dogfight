package jpu2016.dogfight.view;

import java.awt.event.KeyEvent;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.controller.UserOrder;
import jpu2016.gameframe.IEventPerformer;

public class EventPerformer implements IEventPerformer{
	
	public EventPerformer(IOrderPerformer orderPerformer){
		
	}
	
	public UserOrder keyCodeToUserOrder(int keyCode){
		return new UserOrder(); //lol
	}
	
	@Override
	public void eventPerform(KeyEvent keyCode){
		
	}
}

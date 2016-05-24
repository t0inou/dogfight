package jpu2016.dogfight.model;

import java.util.ArrayList;

public interface IDogfightModel {
	public IArea getIArea();
	public void buildArea();
	public void addMobile(IMobile IMobile);
	public void removeMobile(IMobile IMobile);
	public ArrayList<IMobile> getMobiles();
	public IMobile getMobileByPlayer(int Player);
	public void setMobilesHavesMoved();
}

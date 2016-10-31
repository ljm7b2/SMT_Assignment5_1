package AsteroidsArch;


import java.util.List;

import Asteroids1.entity.Entity;
import Asteroids1.entity.Player;
import AsteroidsArch.GameArch;

public interface IGameImp 
{

	/*
	  Getter and Setter of architecture reference
	*/
    public void setArch (GameArch arch);
	public GameArch getArch();
	
	/*
  	  Myx Lifecycle Methods: these methods are called automatically by the framework
  	  as the bricks are created, attached, detached, and destroyed respectively.
	*/	
	public void init();	
	public void begin();
	public void end();
	public void destroy();

	/*
  	  Implementation primitives required by the architecture
	*/
	public int getLevel();
	public int getLives(int playerNumber);
	public boolean isShowingLevel(int playerNumber);
	public boolean isPaused();
	public boolean isGameOver();
	public int getScore(int playerNumber);
	public Player getPlayer(int playerNumber);
	public boolean canDrawPlayer(int playerNumber);
	public List<Entity> getEntities();
}
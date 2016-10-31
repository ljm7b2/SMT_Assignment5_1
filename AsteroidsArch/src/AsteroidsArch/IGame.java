package AsteroidsArch;

import java.util.List;

import Asteroids1.entity.Entity;
import Asteroids1.entity.Player;

public interface IGame {
	
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

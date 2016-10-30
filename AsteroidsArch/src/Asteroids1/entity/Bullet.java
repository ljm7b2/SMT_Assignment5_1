package Asteroids1.entity;

import java.awt.Graphics2D;

import AsteroidsArch.GameImp;
import Asteroids1.util.Vector2;

/**
 * Represents a Bullet within the game world.
 * @author Brendan Jones
 *
 */
public class Bullet extends Entity {
	
	/**
	 * The magnitude of the velocity of a Bullet.
	 */
	private double VELOCITY_MAGNITUDE = 6.75;
	
	/**
	 * The maximum number of cycles that a Bullet can exist.
	 */
	private int MAX_LIFESPAN = 60;
	
	/**
	 * The number of cycles this Bullet has existed.
	 */
	private int lifespan;
	
	public int playerNumber;

	/**
	 * Creates a new Bullet instance.
	 * @param owner The object that fired the bullet.
	 * @param angle The direction of the Bullet.
	 */
	public Bullet(Entity owner, double angle, double VELOCITY_MAGNITUDE, int mL, int PlayerNumber) {
		super(new Vector2(owner.position), new Vector2(angle).scale(VELOCITY_MAGNITUDE), 2.0, 0);
		this.lifespan = mL;
		this.VELOCITY_MAGNITUDE = VELOCITY_MAGNITUDE;
		this.playerNumber = PlayerNumber;
	}
	
	@Override
	public void update(GameImp game) {
		super.update(game);
		
		//Decrement the lifespan of the bullet, and remove it if needed.
		this.lifespan--;
		if(lifespan <= 0) {
			flagForRemoval();
		}
	}

	@Override
	public void handleCollision(GameImp game, Entity other, int player) {
		if(other.getClass() != Player.class) {
			flagForRemoval();
		}
	}
	
	@Override
	public void draw(Graphics2D g, GameImp game) {
		g.drawOval(-1, -1, 2, 2);
	}

	@Override
	public int getPlayerNumber() {
		// TODO Auto-generated method stub
		return this.playerNumber;
	}

}

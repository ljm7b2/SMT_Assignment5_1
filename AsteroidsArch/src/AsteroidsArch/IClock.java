package AsteroidsArch;

public interface IClock {
	
	public void setPaused(boolean paused);
	
	public boolean isPaused();
	
	public void update();
	
	public boolean hasElapsedCycle();

}

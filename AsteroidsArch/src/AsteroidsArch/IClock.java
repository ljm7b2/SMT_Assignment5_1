package AsteroidsArch;

public interface IClock {
	
	public String SetCyclesPerSecond();
	public boolean hasElapsedCycle();
	public boolean isPaused();
	public void setPaused(boolean paused);
	public void update();

}

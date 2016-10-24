package AsteroidsArch;
import AsteroidsArch.ClockImp;

public interface IClock {
	
	public ClockImp setPaused(boolean paused, ClockImp clock);
	
	public boolean isPaused(ClockImp clock);
	
	public ClockImp update(ClockImp clock);
	
	public boolean hasElapsedCycle(ClockImp clock);
	
	public ClockImp newClock();

}

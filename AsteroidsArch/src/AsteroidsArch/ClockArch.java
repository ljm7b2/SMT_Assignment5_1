package AsteroidsArch;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;
import AsteroidsArch.ClockImp;

public class ClockArch extends AbstractMyxSimpleBrick implements IClock
{
    public static final IMyxName msg_IClock = MyxUtils.createName("AsteroidsArch.IClock");


	private IClockImp _imp;

    public ClockArch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected IClockImp getImplementation(){
        try{
			return new ClockImp();    
        } catch (Exception e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public void init(){
        _imp.init();
    }
    
    public void begin(){
        _imp.begin();
    }
    
    public void end(){
        _imp.end();
    }
    
    public void destroy(){
        _imp.destroy();
    }
    
	public Object getServiceObject(IMyxName arg0) {
		if (arg0.equals(msg_IClock)){
			return this;
		}        
		return null;
	}
  
    
    public ClockImp setPaused (boolean paused, ClockImp clock)   {
		_imp.setPaused(paused);
		clock.setPaused(paused);
		return clock;
    }    
    public boolean isPaused (ClockImp clock)   {
		_imp.isPaused();
		return clock.isPaused();
    }    
    public ClockImp update (ClockImp clock)   {
		_imp.update();
		clock.update();
		return clock;
    }    
    public boolean hasElapsedCycle (ClockImp clock)   {
		 _imp.hasElapsedCycle();
		 return clock.hasElapsedCycle();
    }
    public ClockImp newClock(){
    	ClockImp clock = new ClockImp();
    	clock.init();
    	return clock;
    }

}
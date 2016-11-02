package AsteroidsArch;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

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
  
    
    public String SetCyclesPerSecond ()   {
		return _imp.SetCyclesPerSecond();
    }

	@Override
	public boolean hasElapsedCycle() {
		// TODO Auto-generated method stub
		return _imp.hasElapsedCycle();
	}

	@Override
	public boolean isPaused() {
		// TODO Auto-generated method stub
		return _imp.isPaused();
	}

	@Override
	public void setPaused(boolean paused) {
		_imp.setPaused(paused);
		
	}

	@Override
	public void update() {
		_imp.update();
		
	}    
}
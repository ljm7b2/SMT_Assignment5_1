package AsteroidsArch;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

public class GameArch extends AbstractMyxSimpleBrick implements IClock
{
    public static final IMyxName msg_IClock = MyxUtils.createName("AsteroidsArch.IClock");


	private IGameImp _imp;

    public GameArch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected IGameImp getImplementation(){
        try{
			return new GameImp();    
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
  
    
    public void setPaused (boolean paused)   {
		_imp.setPaused(paused);
    }    
    public boolean isPaused ()   {
		return _imp.isPaused();
    }    
    public void update ()   {
		_imp.update();
    }    
    public boolean hasElapsedCycle ()   {
		return _imp.hasElapsedCycle();
    }    
}
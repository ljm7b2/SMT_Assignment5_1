package AsteroidsArch;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

public class PlayerArch extends AbstractMyxSimpleBrick implements IPlayer
{
    public static final IMyxName msg_IPlayer = MyxUtils.createName("AsteroidsArch.IPlayer");


	private IPlayerImp _imp;

    public PlayerArch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected IPlayerImp getImplementation(){
        try{
			return new PlayerImp();    
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
		if (arg0.equals(msg_IPlayer)){
			return this;
		}        
		return null;
	}
  
    
    public String SetMaxVelocity ()   {
		return _imp.SetMaxVelocity();
    }    
    public String SetRotationSpeed ()   {
		return _imp.SetRotationSpeed();
    }    
    public String SetMaxBullets ()   {
		return _imp.SetMaxBullets();
    }    
    public String SetFireRate ()   {
		return _imp.SetFireRate();
    }    
}
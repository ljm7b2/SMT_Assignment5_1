package AsteroidsArch;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

public class BulletArch extends AbstractMyxSimpleBrick implements IBullet
{
    public static final IMyxName msg_IBullet = MyxUtils.createName("AsteroidsArch.IBullet");


	private IBulletImp _imp;

    public BulletArch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected IBulletImp getImplementation(){
        try{
			return new BulletImp();    
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
		if (arg0.equals(msg_IBullet)){
			return this;
		}        
		return null;
	}
  
    
     String SetVelocityMagnitude ()   {
		return _imp.SetVelocityMagnitude();
    }    
     String SetMaxLifeSpan ()   {
		return _imp.SetMaxLifeSpan();
    }    
}
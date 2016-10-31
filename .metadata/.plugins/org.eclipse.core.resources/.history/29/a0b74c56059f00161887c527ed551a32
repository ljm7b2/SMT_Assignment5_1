package AsteroidsArch;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

public class GameArch extends AbstractMyxSimpleBrick
{
    public static final IMyxName msg_IPlayer = MyxUtils.createName("AsteroidsArch.IPlayer");
    public static final IMyxName msg_IClock = MyxUtils.createName("AsteroidsArch.IClock");
    public static final IMyxName msg_IBullet = MyxUtils.createName("AsteroidsArch.IBullet");

    public IPlayer OUT_IPlayer;
    public IClock OUT_IClock;
    public IBullet OUT_IBullet;

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
        OUT_IPlayer = (IPlayer) MyxUtils.getFirstRequiredServiceObject(this,msg_IPlayer);
        if (OUT_IPlayer == null){
 			System.err.println("Error: Interface AsteroidsArch.IPlayer returned null");
			return;       
        }
        OUT_IClock = (IClock) MyxUtils.getFirstRequiredServiceObject(this,msg_IClock);
        if (OUT_IClock == null){
 			System.err.println("Error: Interface AsteroidsArch.IClock returned null");
			return;       
        }
        OUT_IBullet = (IBullet) MyxUtils.getFirstRequiredServiceObject(this,msg_IBullet);
        if (OUT_IBullet == null){
 			System.err.println("Error: Interface AsteroidsArch.IBullet returned null");
			return;       
        }
        _imp.begin();
    }
    
    public void end(){
        _imp.end();
    }
    
    public void destroy(){
        _imp.destroy();
    }
    
	public Object getServiceObject(IMyxName arg0) {
		return null;
	}
}
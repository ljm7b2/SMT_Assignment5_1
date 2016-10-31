package AsteroidsArch;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

public class WorldPanelArch extends AbstractMyxSimpleBrick implements IWorldPanel
{
    public static final IMyxName msg_IGame = MyxUtils.createName("AsteroidsArch.IGame");
    public static final IMyxName msg_IWorldPanel = MyxUtils.createName("AsteroidsArch.IWorldPanel");

    public IGame OUT_IGame;

	private IWorldPanelImp _imp;

    public WorldPanelArch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected IWorldPanelImp getImplementation(){
        try{
			return new WorldPanelImp();    
        } catch (Exception e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public void init(){
        _imp.init();
    }
    
    public void begin(){
        OUT_IGame = (IGame) MyxUtils.getFirstRequiredServiceObject(this,msg_IGame);
        if (OUT_IGame == null){
 			System.err.println("Error: Interface AsteroidsArch.IGame returned null");
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
		if (arg0.equals(msg_IWorldPanel)){
			return this;
		}        
		return null;
	}
  
    
    public int saySomething ()   {
		return _imp.saySomething();
    }    
    public void repaint ()   {
		_imp.repaint();
    }    
}
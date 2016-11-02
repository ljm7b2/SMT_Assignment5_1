package AsteroidsArch;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

public class ResetGameArch extends AbstractMyxSimpleBrick implements IResetGame
{
    public static final IMyxName msg_IResetGame = MyxUtils.createName("AsteroidsArch.IResetGame");


	private IResetGameImp _imp;

    public ResetGameArch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected IResetGameImp getImplementation(){
        try{
			return new ResetGameImp();    
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
		if (arg0.equals(msg_IResetGame)){
			return this;
		}        
		return null;
	}
  
    
    public GameImp resetGame (GameImp game)   {
		return _imp.resetGame(game);
    }    
}
package AsteroidsArch;

import java.util.Random;

public class ResetGameImp implements IResetGameImp
{
	private ResetGameArch _arch;

    public ResetGameImp (){
    }

	public void setArch(ResetGameArch arch){
		_arch = arch;
	}
	public ResetGameArch getArch(){
		return _arch;
	}

	/*
  	  Myx Lifecycle Methods: these methods are called automatically by the framework
  	  as the bricks are created, attached, detached, and destroyed respectively.
	*/	
	public void init(){
	    //TODO Auto-generated method stub
	}
	public void begin(){
		//TODO Auto-generated method stub
	}
	public void end(){
		//TODO Auto-generated method stub
	}
	public void destroy(){
		//TODO Auto-generated method stub
	}

	/*
  	  Implementation primitives required by the architecture
	*/
  
    
	public GameImp resetGame(GameImp game)  {
		//TODO Auto-generated method stub
		return new GameImp();
    }
}
package AsteroidsArch;

import Asteroids1.Game;



public class GameImp implements IGameImp
{
	private GameArch _arch;

    public GameImp (){
    }

	public void setArch(GameArch arch){
		_arch = arch;
	}
	public GameArch getArch(){
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
		String[] args = {};
		Game.main(args);
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
}
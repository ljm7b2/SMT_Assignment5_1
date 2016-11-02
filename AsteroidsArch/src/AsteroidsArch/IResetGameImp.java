package AsteroidsArch;


import java.util.Random;

import AsteroidsArch.ResetGameArch;

public interface IResetGameImp 
{

	/*
	  Getter and Setter of architecture reference
	*/
    public void setArch (ResetGameArch arch);
	public ResetGameArch getArch();
	
	/*
  	  Myx Lifecycle Methods: these methods are called automatically by the framework
  	  as the bricks are created, attached, detached, and destroyed respectively.
	*/	
	public void init();	
	public void begin();
	public void end();
	public void destroy();

	/*
  	  Implementation primitives required by the architecture
	*/
  
    
	public GameImp resetGame(GameImp game);        
}
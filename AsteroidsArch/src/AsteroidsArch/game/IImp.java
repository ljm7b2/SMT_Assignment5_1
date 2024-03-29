package AsteroidsArch.game;


import AsteroidsArch.game.GameArch;

public interface IImp 
{

	/*
	  Getter and Setter of architecture reference
	*/
    public void setArch (GameArch arch);
	public GameArch getArch();
	
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
}
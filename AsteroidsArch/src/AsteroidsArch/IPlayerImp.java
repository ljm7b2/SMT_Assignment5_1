package AsteroidsArch;


import AsteroidsArch.PlayerArch;

public interface IPlayerImp 
{

	/*
	  Getter and Setter of architecture reference
	*/
    public void setArch (PlayerArch arch);
	public PlayerArch getArch();
	
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
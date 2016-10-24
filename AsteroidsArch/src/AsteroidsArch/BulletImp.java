package AsteroidsArch;



public class BulletImp implements IBulletImp
{
	private BulletArch _arch;

    public BulletImp (){
    }

	public void setArch(BulletArch arch){
		_arch = arch;
	}
	public BulletArch getArch(){
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
  
    
    public String SetVelocityMagnitude ()   {
		//TODO Auto-generated method stub
		return null;
    }
    public String SetMaxLifeSpan ()   {
		//TODO Auto-generated method stub
		return null;
    }
}
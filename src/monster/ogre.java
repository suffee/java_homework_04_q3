package monster;

public class ogre extends Alien{

	public ogre(int health,String name){
		super(health,name);
	}
	
	public ogre(String name,int health){
		super(health,name);	
	}
	public  String toString(){
		
		return "Booo!!";
		
	}	
	public int getDamage(){
		
	return OGRE_ALIEN;	
	}
	
}

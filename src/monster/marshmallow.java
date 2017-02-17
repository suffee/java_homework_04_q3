package monster;

public class marshmallow extends Alien{
	
	public marshmallow(int health,String name){
		super(health,name);	
	}
	public marshmallow(String name,int health){
		super(health,name);
	}
	public  String toString(){
		
		return "Don't eat me";
		
	}		
	public int getDamage(){
		
	return MARSHMALLOW_ALIEN;	
	}
	
}

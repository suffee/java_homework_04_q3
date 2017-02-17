package monster;

public class snake extends Alien {
	
	public snake(int health,String name){
		super(health,name);
	}
	
	public snake(String name,int health){
		super(health,name);	
	}
	public int getDamage(){
	
	return SNAKE_ALIEN;	
	}
	
	
	
	public  String toString(){
		
		return "psssss~";
		
	}	
	
}

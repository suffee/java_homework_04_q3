package monster;

public abstract class Alien {
	
	public static final int SNAKE_ALIEN = 10;
	public static final int OGRE_ALIEN = 6;
	public static final int MARSHMALLOW_ALIEN = 1;
	
	private int 		health;
	private String 	name;
	
	public Alien(int health,String name){
			this.health		=		health;
			this.name		=		name;
	}
	//mutator
	
	public void setHealth(int health){

		this.health=health;
	}
	
	public void setName(String name){

		this.name=name;
	}
	
	//accessor
	public String getName(){
		
		return this.name;	
	}
	
	public int getHealth(){
		
		return this.health;	
	}
	
	public abstract int getDamage();
	public abstract String toString();
		
	
}

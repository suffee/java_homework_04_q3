package homework_4_q3;
import monster.*;
import java.util.Scanner;
public class homework_4_q3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int      mount=0;	

		System.out.println("請輸入外星人數量");			
		mount=input.nextInt();
		
		AlienPack 			group1	= new AlienPack(mount); 
		
		for(int i=0;i<group1.getmount();i++){
			int 		health,type;
			String  name;
			
			System.out.println("請輸入外星人"+(i+1)+"的類型(snake=1;ogre=2;mashmallow=3)");
			type=input.nextInt();
			
			System.out.println("請輸入外星人"+(i+1)+"的生命值");
			health=input.nextInt();
	
			System.out.println("請輸入外星人"+(i+1)+"的名字");
			name=input.nextLine();	
			name=input.nextLine();			
			
					switch(type){
			
						case 1:
								group1.addAlien(	new snake(name,health),i);	
								break;
			
						case 2:
								group1.addAlien(	new ogre(name,health),i);		
								break;
				
						case 3:
								group1.addAlien(	new marshmallow(name,health),i);		
								break;
			
						default:
								System.out.println("請輸入正確的類型");		
								break;			
					}
					type=0;
			}		
		System.out.println("外星人的總攻擊力為: "+group1.calculateDamage());			
		input.close();
	}
}

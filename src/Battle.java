//Giants and Ogres Project

//Dhruvi Patel
//CSC 111 - Spring 2022
//2/14/2022

//two monsters that attack each other and battle till death

import java.util.Random;

public class Battle {

	public static void main(String[] args) {

		//creates a random number for the health and strength of a monster
		Random num = new Random();
		double randoNum1 = num.nextDouble(60,100);
		double randoNum2 = num.nextDouble(15,25);
		double randoNum3 = num.nextDouble(60,100);
		double randoNum4 = num.nextDouble(15,25);
		
		
		Monsters ogre = new Monsters (60,25);
		Monsters giant = new Monsters (100,15);
		
		
		//extra credit 
		Monsters m1 = new Monsters (randoNum1 ,randoNum2 );
		Monsters m2 = new Monsters (randoNum3, randoNum4);
		
		//displays the monsters initial health and strength
		System.out.println("Ogre health:" + ogre.getHealth()+ ", Ogre strength: " + ogre.getStrength()+ "\n");
		System.out.println("Giant health: " + giant.getHealth() + ", Giant strength: " + giant.getStrength()+"\n");
		
		
		int round = 0; //initial battle round
		

	while ((ogre.getHealth() > 0) && (giant.getHealth()> 0)) {
		
		 //decreases the ogres health
		double attack1 = ogre.attack();
		giant.takeDamage(ogre.attack());
		
		//decreases the giants health
		double attack2 = giant.attack();
		ogre.takeDamage(giant.attack());
		
		//increases the number of rounds
		round++;
		
		//prints out each round and the updated health of each monster from the round
		System.out.println(round + "." + "Ogre health: "+ ogre.getHealth()+ ", Giant health:" + giant.getHealth());
		
	}
	
	//checks the health of the monster and decides who wins or checks if they tied
		if ((ogre.getHealth() > 0)&& (giant.getHealth() < 0)) {
			System.out.println("\nThe Ogre Wins! \n");
			
		} else if ((ogre.getHealth()< 0)&& (giant.getHealth() > 0)) {
			
			System.out.println("\nThe Giant Wins! \n");
			
		} else {
			System.out.println("\nTie \n");
		}
	
		//displays the health and strength of the monsters
		System.out.println("M1 health:" + m1.getHealth()+ ", M1 strength: " + m1.getStrength()+ "\n");
		System.out.println("M2 health: " + m2.getHealth() + ", M2 strength: " + m2.getStrength() +"\n");
		
	
		int count = 0;//initial count for rounds
		
	while ((m1.getHealth() > 0) && (m2.getHealth()> 0)) {
		
		 //decreases M1 health
		double attack1 = m1.attack();
		m2.takeDamage(m1.attack());
		
		//decreases M2 health
		double attack2 = m2.attack();
		m1.takeDamage(m2.attack());
		
		//increases the number of rounds
		count++;
		
		//prints out each round and the updated health of each monster from the round
		System.out.println(count + "." + "M1 health: "+ m1.getHealth()+ ", M2 health:" + m2.getHealth());
		
	}
	
	//checks the health of the monster and decides who wins or checks if they tied
	if ((m1.getHealth() > 0)&& (m2.getHealth() < 0)) {
		System.out.println("\nThe M1 Wins!");
		
	} else if ((m1.getHealth()< 0)&& (m2.getHealth() > 0)) {
		
		System.out.println("\nThe M2 Wins!");
		
	} else {
		System.out.println("\nTie");
	}


}
}
//Giants and Ogres Project

//Dhruvi Patel
//CSC 111 - Spring 2022
//2/14/2022

//stores the data for the battle class

import java.util.Random;

public class Monsters
{
	//instance variables 
	private double health;
	private double strength;
	
	//contructor
	public Monsters (double health, double strength) {
		this.health = health;
		
		
		this.strength = strength;
				
	}
	
	//generates a random double between 0 to 1 to multiply the strength by for the attack method
	Random num = new Random();
	double randomNum = num.nextDouble(1);
	
	
	//Instance Methods
	
	//gives the health of the monsters
	//no parameters
	//return is double 
	public double getHealth() {
		return health; 
	}
	
	
	//gives the strength of the monsters
	//no parameters
	//return is double 
	public double getStrength() {
		return strength;
	}
	
	
	//sets the health in each monster that is created
	//parameter: health 
	//return: void
	public void setHealth(double health) {
		this.health =health ;
	}
	
	
	//sets the strength in each monster that is created
	//parameter: strength 
	//return: void
	public void setStrength(double strength) {
		this.strength = strength;
	}
	
	
	//checks if the monster is alive
	//no parameters
	//return: boolean
	public boolean isAlive() {
		if (health > 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	//creates the intensity of the attack
	//no parameters
	//return: double
	public double attack() {
		return (strength * randomNum);
	}
	
	
	//decreases the health of the monsters by this amount
	//parameter: x (number(double) to decrease health)
	//return: void
	public void takeDamage(double x) {
		health = health - x ;
	}
	
}

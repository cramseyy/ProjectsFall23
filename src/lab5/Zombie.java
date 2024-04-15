package lab5;
import java.util.Random;

public class Zombie extends Enemy{
	
	public Zombie(String name, int locationX, int locationY) {
        super(name, locationX, locationY); //call to our parent class's constructor
        this.setCurrentHitPoints(6); //Change the hitpoints from 0 to 8
        this.setWeaponDamage(3); 

	}
	
	@Override
    public void specialAbility() {
        System.out.printf("%s used special ability: jumped to new position\n", this.getName());
        setLocationY(this.getLocationY() + 2);
        setLocationX(this.getLocationX() + 2);
    }
	
	Random rand2 = new Random();
	
	@Override
	 public void move() { //we use a randomly generated number to automate the moves for the enemies
        if (this.getCurrentHitPoints() > 0) {
            int direction = rand2.nextInt(4);
            switch (direction) {
            case 0:
                this.setLocationY(this.getLocationY() + 2); //moves up
                break;
            case 1:
                this.setLocationY(this.getLocationY() - 1);//moves down
                break;
            case 2:
                this.setLocationX(this.getLocationX() - 1);//moves left
                break;
            case 3:
                this.setLocationX(this.getLocationX() + 2);//moves right
                break;
            case 4:
            	this.specialAbility();
            	break;
            }
        }
    }
}

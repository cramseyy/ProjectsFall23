package lab5;
import java.util.Random;

public class Enemy extends Character{
	
	@Override
    public void specialAbility() {
        System.out.printf("%s used special ability: bonus damage\n", this.getName());
        setWeaponDamage(this.getWeaponDamage() + 2);
    }
	
	//class fields
    private Random rand = new Random(); //Make sure to import java.util.Random;
    
    public void move() { //we use a randomly generated number to automate the moves for the enemies
        if (this.getCurrentHitPoints() > 0) {
            int direction = rand.nextInt(4) + 1;
            switch (direction) {
            case 0:
                this.setLocationY(this.getLocationY() + 1); //moves up
                break;
            case 1:
                this.setLocationY(this.getLocationY() - 1);//moves down
                break;
            case 2:
                this.setLocationX(this.getLocationX() - 1);//moves left
                break;
            case 3:
                this.setLocationX(this.getLocationX() + 1);//moves right
                break;
            case 4:
            	this.specialAbility();
            	break;
            }
        }
    }
    
    /**
     * @param name
     * @param locationX
     * @param locationY
     */
    public Enemy(String name, int locationX, int locationY) {
        super(name, locationX, locationY); //call to our parent class's constructor
        this.setCurrentHitPoints(8); //Change the hitpoints from 0 to 8
        this.setWeaponDamage(2); //Change the weaponDamage from 0 to 2
    }

}

package lab5;

public abstract class Character {
	
	//class fields
    private String name;
    private int currentHitPoints = 0;
    private int weaponDamage = 0;
    private int locationX;
    private int locationY;
    
  //Abstract method that needs to be implemented in child classes.
    //The actual implementation depends on the subclass
    public abstract void specialAbility();
    
    /**
     * @param name
     * @param locationX
     * @param locationY
     */
    public Character(String name, int locationX, int locationY) {
        this.name = name;
        this.locationX = locationX;
        this.locationY = locationY;
    }
	
    public String getName() {
		return name;
	}
	
    public void setName(String name) {
		this.name = name;
	}
	
    public int getCurrentHitPoints() {
		return currentHitPoints;
	}
	
    public void setCurrentHitPoints(int currentHitPoints) {
		this.currentHitPoints = currentHitPoints;
	}
	
    public int getWeaponDamage() {
		return weaponDamage;
	}
	
    public void setWeaponDamage(int weaponDamage) {
		this.weaponDamage = weaponDamage;
	}
	
    public int getLocationX() {
		return locationX;
	}
	
    public void setLocationX(int locationX) {
		this.locationX = locationX;
	}
	
    public int getLocationY() {
		return locationY;
	}
	
    public void setLocationY(int locationY) {
		this.locationY = locationY;
	}
    
    //Lower our current hitpoints by the damageTaken argument
    public void receiveDamage(int damageTaken) {
        this.currentHitPoints -= damageTaken;
    }

    //Object interaction. The parameter is an Character object
    //Check if this character is in the same location as the other character, if so then do weapon damage to them
    //We call the opponent's receiveDamage method within this attack method
    public void attack(Character other) {
        if (other.getLocationX() == this.getLocationX() && other.getLocationY() == this.getLocationY() && other.getCurrentHitPoints() > 0){
            System.out.printf("%s attacked %s\n", this.getName(), other.getName());
            other.receiveDamage(this.weaponDamage);
            if (other.getCurrentHitPoints() <= 0) {//if true, then the other character is defeated
                System.out.printf("%s defeated %s\n", this.getName(), other.getName());
                //Move them off the board
                other.setLocationX(-999);
                other.setLocationY(-999);
            }
        }
    }

    public String toString() {
        return String.format("%s location: %d, %d. HitPoints: %d", this.getName(), this.getLocationX(), this.getLocationY(), this.getCurrentHitPoints());
    }
    
    public boolean equals(Object other) {
        //Cast the Object parameter to a Character so we can access its name
        Character tempCast = (Character)other;
        if (this.name.equals(tempCast.getName())){
            return true;
        }
        else {
            return false;
        }
    }
    

}

/**
 * ---------------------------------------------------------------------------
 * File name: Monster.java
 * Project name: zork
 * ---------------------------------------------------------------------------
 * Creator's name and email: Justin Adams, adamsjl3@goldmail.etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Apr 21, 2016
 * ---------------------------------------------------------------------------
 */

package Monster;



/**
 * Super Class
 * 
 * <hr>
 * Date created: Apr 21, 2016
 * <hr>.
 *
 * @author Justin Adams
 */
public abstract class Monster
{
	
	/** The health points. */
	int healthPoints;
	
	/** The damage points. */
	int damagePoints;
	
	/**
	 * Constructor        
	 * 
	 * <hr>
	 * Date created: Apr 21, 2016.
	 */	
	public Monster ()
	{
		
	}	

	/**
	 * Gets the health points.
	 *
	 * @return healthPoints
	 */
	public int getHealthPoints ( )
	{
		return healthPoints;
	}
	
	/**
	 * Sets the health points.
	 *
	 * @param healthPoints the healthPoints to set
	 */
	public void setHealthPoints (int healthPoints)
	{
		this.healthPoints = healthPoints;
	}
	
	/**
	 * Gets the damage points.
	 *
	 * @return damagePoints
	 */
	public int getDamagePoints ( )
	{
		return damagePoints;
	}
	
	/**
	 * Sets the damage points.
	 *
	 * @param damagePoints the damagePoints to set
	 */
	void setDamagePoints (int damagePoints)
	{
		this.damagePoints = damagePoints;
	}
	
	/**
	 * Attack.
	 *
	 * @param i the i
	 * @return the int
	 */
	public abstract int attack(int i);
	
	/**
	 * Monster gets attacked        
	 *
	 * <hr>
	 * Date created: Apr 29, 2016
	 *
	 * <hr>
	 * @param attack
	 */
	public void attacked (int attack)
	{
		healthPoints -= attack;
	}	
	/**
	 * toString Method         
	 * 
	 * <hr>
	 * Date created: Apr 21, 2016 
	 * 
	 * <hr>.
	 *
	 * @return the string
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString ( )
	{
		return "M";
	}


}//End Monster

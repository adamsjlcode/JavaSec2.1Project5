/**
 * ---------------------------------------------------------------------------
 * File name: Player.java
 * Project name: zork
 * ---------------------------------------------------------------------------
 * Creator's name and email: Justin Adams, adamsjl3@goldmail.etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Apr 21, 2016
 * ---------------------------------------------------------------------------
 */

package zork;

import Weapons.Stick;
import Weapons.Weapon;


/**
 * Player in Zork
 * 
 * <hr>
 * Date created: Apr 21, 2016
 * <hr>.
 *
 * @author Justin Adams
 */
public class Player
{
	
	/** The health points. */
	private int healthPoints;
	
	/** The weapon. */
	private Weapon w;
		
	/** The missed. */
	private final int MISSED = 0;
	/**
	 * Constructor        
	 * 
	 * <hr>
	 * Date created: Apr 21, 2016 .
	 *
	 * @param i the i
	 */
	public Player (int i)
	{
		setHealthPoints (i);
		w = new Stick();
	}//End Player (int)
	
	/**
	 * Gets the damage points.
	 *
	 * @return the damage points
	 */
	public int getDamagePoints()
	{
		return w.getDamagePoints ( );
	}//End getDamagePoints()
	
	/**
	 * Gets the health points.
	 *
	 * @return healthPoints
	 */
	public int getHealthPoints ( )
	{
		return healthPoints;
	}//End getHealthPoints ( )

	
	/**
	 * Sets the health points.
	 *
	 * @param healthPoints the healthPoints to set
	 */
	public void setHealthPoints (int healthPoints)
	{
		this.healthPoints = healthPoints;
	}//End setHealthPoints (int)
	
	/**
	 * Attacked.
	 *
	 * @param i the i
	 */
	public void attacked(int i)
	{
		healthPoints -= i;
	}//End attacked(int)
	
	/**
	 * Attack.
	 *
	 * @param i the i
	 * @param monster the monster
	 * @return the int
	 */
	public int attack(int i, String monster)
	{
		if (i > 24)
		{
			Control.updateText("Player Hit The " + monster 
			+ " with the " + w.toString ( ));
			return w.getDamagePoints ( );
		}
		else
			Control.updateText("Player Missed");
			return MISSED;
	}//End attack(int,String)
	
	/**
	 * Set new weapon to player         
	 * 
	 * <hr>
	 * Date created: Apr 27, 2016
	 * 
	 * <hr>.
	 *
	 * @param w2 the new new weapon
	 */
	public void setNewWeapon (Weapon w2)
	{
		w = w2;
		
	}//End setNewWeapon (Weapon)
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
		return "P";
	}//End toString ( )

	/**
	 * Player Weapon         
	 *
	 * <hr>
	 * Date created: May 4, 2016
	 *
	 * <hr>
	 * @return
	 */
	public String getWeapon ( )
	{
		
		return w.toString ( );
	}
}

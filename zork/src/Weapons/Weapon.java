/**
 * ---------------------------------------------------------------------------
 * File name: Weapon.java
 * Project name: zork
 * ---------------------------------------------------------------------------
 * Creator's name and email: Justin Adams, adamsjl3@goldmail.etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Apr 21, 2016
 * ---------------------------------------------------------------------------
 */

package Weapons;


/**
 * Enter type purpose here
 *
 * <hr>
 * Date created: Apr 21, 2016
 * <hr>
 * @author Justin Adams
 */
public class Weapon
{
	int damagePoints = 20;
	
	/**
	 * Constructor        
	 *
	 * <hr>
	 * Date created: Apr 29, 2016 
	 *
	 * 
	 */
	public Weapon ( )
	{
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return damagePoints
	 */
	public int getDamagePoints ( )
	{
		return damagePoints;
	}

	
	/**
	 * @param damagePoints the damagePoints to set
	 */
	protected void setDamagePoints (int damagePoints)
	{
		this.damagePoints = damagePoints;
	}
	/**
	 * Enter method description here         
	 *
	 * <hr>
	 * Date created: Apr 21, 2016 
	 *
	 * <hr>
	 * @return
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString ( )
	{
		return "W";
	}
}

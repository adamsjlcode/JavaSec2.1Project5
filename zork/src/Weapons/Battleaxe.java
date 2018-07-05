/**
 * ---------------------------------------------------------------------------
 * File name: Axe.java
 * Project name: zork
 * ---------------------------------------------------------------------------
 * Creator's name and email: Justin Adams, adamsjl3@goldmail.etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Apr 21, 2016
 * ---------------------------------------------------------------------------
 */

package Weapons;

/**
 * Battleaxe
 *
 * <hr>
 * Date created: Apr 21, 2016
 * <hr>
 * @author Justin Adams
 */
public class Battleaxe extends Weapon
{
	
	/**
	 * Constructor        
	 * 
	 * <hr>
	 * Date created: Apr 21, 2016 .
	 */
	public Battleaxe ( )
	{
		setDamagePoints (10);
	}//End Battleaxe ( )
	
	/**
	 * Battleaxe toString ( )
	 * 
	 * <hr>
	 * Date created: Apr 24, 2016 
	 * 
	 * <hr>.
	 *
	 * @return the string
	 * @see Weapons.Weapon#toString()
	 */
	@Override
	public String toString ( )
	{
		return "Battleaxe";
	}//End toString ( )
	
}//End Battleaxe


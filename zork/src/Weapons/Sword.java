/**
 * ---------------------------------------------------------------------------
 * File name: Sword.java
 * Project name: zork
 * ---------------------------------------------------------------------------
 * Creator's name and email: Justin Adams, adamsjl3@goldmail.etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Apr 21, 2016
 * ---------------------------------------------------------------------------
 */

package Weapons;


/**
 * Sword
 * 
 * <hr>
 * Date created: Apr 21, 2016
 * <hr>.
 *
 * @author Justin Adams
 */
public class Sword extends Weapon
{
	
	/**
	 * Constructor        
	 * 
	 * <hr>
	 * Date created: Apr 21, 2016 .
	 */
	public Sword ( )
	{
		setDamagePoints (10);
	}//End Sword ( )
	
	/**
	 * Sword toString         
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
		return "Sword";
	}//End toString ( )
	
}//End Sword

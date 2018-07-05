/**
 * ---------------------------------------------------------------------------
 * File name: Stick.java
 * Project name: zork
 * ---------------------------------------------------------------------------
 * Creator's name and email: Justin Adams, adamsjl3@goldmail.etsu.edu
 * Course:  CSCI 1260
 * Creation Date: May 4, 2016
 * ---------------------------------------------------------------------------
 */

package Weapons;


/**
 * Stick
 *
 * <hr>
 * Date created: May 4, 2016
 * <hr>
 * @author Justin Adams
 */
public class Stick extends Weapon
{

	public Stick()
	{
		setDamagePoints (5);
	}//End Stick ( )

	/**
	 * Stick toString()         
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
		return "Stick";
	}//End toString ( )

}//End Stick()
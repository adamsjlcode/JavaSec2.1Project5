/**
 * ---------------------------------------------------------------------------
 * File name: Dagger.java
 * Project name: zork
 * ---------------------------------------------------------------------------
 * Creator's name and email: Justin Adams, adamsjl3@goldmail.etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Apr 24, 2016
 * ---------------------------------------------------------------------------
 */

package Weapons;

/**
 * Dagger
 *
 * <hr>
 * Date created: Apr 24, 2016
 * <hr>
 * @author Justin Adams
 */
public class Dagger extends Weapon
{
	
	/**
	 * Constructor        
	 * 
	 * <hr>
	 * Date created: Apr 21, 2016 .
	 */
	public Dagger ( )
	{
		setDamagePoints (4);
	}//End Dagger ( )
	
	/**
	 * Dagger toString ( )
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
		return "Dagger";
	}//End toString ( )
	
}//End Dagger

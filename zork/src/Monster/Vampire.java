/**
 * ---------------------------------------------------------------------------
 * File name: Vampire.java
 * Project name: zork
 * ---------------------------------------------------------------------------
 * Creator's name and email: Justin Adams, adamsjl3@goldmail.etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Apr 21, 2016
 * ---------------------------------------------------------------------------
 */

package Monster;

import zork.Control;

/**
 * Vampire
 *
 * <hr>
 * Date created: Apr 21, 2016
 * <hr>
 * @author Justin Adams
 */
public class Vampire extends Monster
{
	int slam = 5;
	int fastHeal = 5;
	int missed = 0;
	/**
	 * Constructor        
	 *
	 * <hr>
	 * Date created: Apr 21, 2016 
	 *
	 * 
	 * @param pct
	 */
	public Vampire ()
	{
		setHealthPoints (29);	
	}//End Vampire ()
	
	@Override
	public int attack(int pct)
	{
		if (pct>25)
		{
			Control.updateText ("Vampire Has Slamed You");
			Control.updateText ("Vampire Fasthealed Itself");
			healthPoints += fastHeal;
			return slam;
		}
		else
			Control.updateText("Vampire Missed");
			Control.updateText ("Vampire Fasthealed Itself");
			healthPoints += fastHeal;
			return missed;
	}//attack(int)
	/**
	 * Vampire toString()         
	 *
	 * <hr>
	 * Date created: Apr 24, 2016 
	 *
	 * <hr>
	 * @return
	 * @see Monster.Monster#toString()
	 */
	@Override
	public String toString ( )
	{
		return "Vampire";
	}
}//End Vampire ()

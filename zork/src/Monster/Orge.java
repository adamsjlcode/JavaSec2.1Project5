/**
 * ---------------------------------------------------------------------------
 * File name: Orge.java
 * Project name: zork
 * ---------------------------------------------------------------------------
 * Creator's name and email: Justin Adams, adamsjl3@goldmail.etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Apr 24, 2016
 * ---------------------------------------------------------------------------
 */

package Monster;

import zork.Control;

/**
 * Orge Monster
 *
 * <hr>
 * Date created: Apr 24, 2016
 * <hr>
 * @author Justin Adams
 */
public class Orge extends Monster
{
	
	/** The bite. */
	private int greatclub = 8;
	
	/** The missed. */
	final int MISSED = 0;
	
	/**
	 * Constructor        
	 * 
	 * <hr>
	 * Date created: Apr 24, 2016 .
	 */
	public Orge ( )
	{
		setHealthPoints (29);
	}//End Orge()
	
	/**
	 * Attack.
	 *
	 * @param pct the pct
	 * @return the int
	 */
	@Override
	public int attack(int pct)
	{
		if (pct>25)
		{
			Control.updateText ("Orge hit you with a Greatclub");
			return greatclub;
		}
		else
			Control.updateText("Orge Missed");
			return MISSED;
	}//attack(int)
	
	/**
	 * Orge toString        
	 * 
	 * <hr>
	 * Date created: Apr 24, 2016 
	 * 
	 * <hr>.
	 *
	 * @return the string
	 * @see Monster.Monster#toString()
	 */
	@Override
	public String toString ( )
	{
		return "Orge";
	}//End toString ( )
}//End Orge

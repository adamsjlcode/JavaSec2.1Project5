/**
 * ---------------------------------------------------------------------------
 * File name: Ghoul.java
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
 * Ghoul
 *
 * <hr>
 * Date created: Apr 24, 2016
 * <hr>
 * @author Justin Adams
 */
public class Ghoul extends Monster
{
	
	/** The bite. */
	private int bite = 2;
	
	/** The missed. */
	final int MISSED = 0;
	
	/**
	 * Constructor        
	 * 
	 * <hr>
	 * Date created: Apr 24, 2016 .
	 */
	public Ghoul ( )
	{
		setHealthPoints (13);
	}//End Ghoul()
	
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
			Control.updateText("Ghoul Has Bite You");
			return bite;
		}
		else
			Control.updateText("Ghoul Missed");
			return MISSED;
	}//attack(int)
	
	/**
	 * Ghoul toString        
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
		return "Ghoul";
	}//End toString ( )
}//End Ghoul

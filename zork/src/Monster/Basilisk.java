/**
 * ---------------------------------------------------------------------------
 * File name: Basilisk.java
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
 * Basilisk Monster
 * 
 * <hr>
 * Date created: Apr 24, 2016
 * <hr>.
 *
 * @author Justin Adams
 */
public class Basilisk extends Monster
{
	
	/** The bite. */
	private int bite = 8;
	
	/** The missed. */
	final int MISSED = 0;
	
	/**
	 * Constructor        
	 * 
	 * <hr>
	 * Date created: Apr 24, 2016 .
	 */
	public Basilisk ( )
	{
		setHealthPoints (45);
	}//End Basilisk()
	
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
			Control.updateText ("Basilisk Has Bite You");
			return bite;
		}
		else
			Control.updateText("Basilisk Missed");
			return MISSED;
	}//attack(int)
	
	/**
	 * toString Method        
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
		return "Basilisk";
	}//End toString ( )
}//End Basilisk

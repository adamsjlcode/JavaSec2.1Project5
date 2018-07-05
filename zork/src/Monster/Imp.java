/**
 * ---------------------------------------------------------------------------
 * File name: Imp.java
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
 * Imp
 *
 * <hr>
 * Date created: Apr 24, 2016
 * <hr>
 * @author Justin Adams
 */
public class Imp extends Monster
{
	
	/** The sting. */
	private int sting = 8;
	
	/** The missed. */
	final int MISSED = 0;
	
	/**
	 * Constructor        
	 * 
	 * <hr>
	 * Date created: Apr 24, 2016 .
	 */
	public Imp ( )
	{
		setHealthPoints (13);
	}//End Imp()
	
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
			Control.updateText("Imp Stung You");
			return sting;
		}
		else
			Control.updateText("Imp Missed");
			return MISSED;
	}//attack(int)
	
	/**
	 * Imp toString        
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
		return "Imp";
	}//End toString ( )
}//End Imp

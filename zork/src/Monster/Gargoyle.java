/**
 * ---------------------------------------------------------------------------
 * File name: Gargoyle.java
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
 * Gargoyle
 *
 * <hr>
 * Date created: Apr 24, 2016
 * <hr>
 * @author Justin Adams
 */
public class Gargoyle extends Monster
{
	
	/** The claw. */
	private int claw = 8;
	
	/** The missed. */
	final int MISSED = 0;
	
	/**
	 * Constructor        
	 * 
	 * <hr>
	 * Date created: Apr 24, 2016 .
	 */
	public Gargoyle ( )
	{
		setHealthPoints (37);
	}//End Gargoyle()
	
	/**
	 * Attack.
	 *
	 * @param pct the pct
	 * @return the int
	 */
	@Override
	public int attack(int pct)
	{
		if (pct<25)
		{
			Control.updateText("Gargoyle Clawed You");
		return claw;
		}
		else
			Control.updateText("Gargoyle Missed");
			return MISSED;
	}//attack(int)
	
	/**
	 * Gargoyle toString        
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
		return "Gargoyle";
	}//End toString ( )
}//End Gargoyle

/**
 * ---------------------------------------------------------------------------
 * File name: White_Dragon.java
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
 * White_Dragon
 *
 * <hr>
 * Date created: Apr 21, 2016
 * <hr>
 * @author Justin Adams
 */
public class White_Dragon extends Monster
{
	
	/** The bite. */
	private int grapple = 8;
	
	/** The missed. */
	final int MISSED = 0;
	
	/**
	 * Constructor        
	 * 
	 * <hr>
	 * Date created: Apr 24, 2016 .
	 */
	public White_Dragon ( )
	{
		setHealthPoints (189);
	}//End Dragon()
	
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
			Control.updateText ("White Dragon Has Grapple You");
		return grapple;
		}
		else
			Control.updateText("White Dragon Missed");
			return MISSED;
	}//attack(int)
	
	/**
	 * White_Dragon toString        
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
		return "White Dragon";
	}//End toString ( )
}//End Dragon

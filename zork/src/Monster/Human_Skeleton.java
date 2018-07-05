/**
 * ---------------------------------------------------------------------------
 * File name: Human_Skeleton.java
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
 * Human_Skeleton
 *
 * <hr>
 * Date created: Apr 24, 2016
 * <hr>
 * @author Justin Adams
 */
public class Human_Skeleton extends Monster
{
	
	/** The claw. */
	private int claw = 1;
	
	/** The missed. */
	private final int MISSED = 0;
	
	/**
	 * Constructor        
	 * 
	 * <hr>
	 * Date created: Apr 24, 2016 .
	 */
	public Human_Skeleton ( )
	{
		setHealthPoints (6);
	}//End Human_Skeleton()
	
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
			Control.updateText("Human Skeleton Hit You");
			return claw;
		}
		else
			Control.updateText("Human Skeleton Missed");
			return MISSED;
	}//attack(int)
	
	/**
	 * Human_Skeleton toString        
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
		return "Human Skeleton";
	}//End toString ( )
}//End Human_Skeleton

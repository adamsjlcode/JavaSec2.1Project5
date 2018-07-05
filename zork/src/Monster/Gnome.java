/**
 * ---------------------------------------------------------------------------
 * File name: Gnome.java
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
 * Gnome
 *
 * <hr>
 * Date created: Apr 24, 2016
 * <hr>
 * @author Justin Adams
 */
public class Gnome extends Monster
{
	
	/** The claw. */
	private int crossbow = 1;
	
	/** The missed. */
	final int MISSED = 0;
	
	/**
	 * Constructor        
	 * 
	 * <hr>
	 * Date created: Apr 24, 2016 .
	 */
	public Gnome ( )
	{
		setHealthPoints (6);
	}//End Gnome()
	
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
			Control.updateText("Gnome Use A Crossbow On You");
			return crossbow;
		}
		else
			Control.updateText("Gnome Missed");
			return MISSED;
	}//attack(int)
	
	/**
	 * Gnome toString        
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
		return "Gnome";
	}//End toString ( )
}//End Gnome
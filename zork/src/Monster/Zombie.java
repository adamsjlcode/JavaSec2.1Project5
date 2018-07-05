/**
 * ---------------------------------------------------------------------------
 * File name: Zombie.java
 * Project name: zork
 * ---------------------------------------------------------------------------
 * Creator's name and email: Justin Adams, adamsjl3@goldmail.etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Apr 21, 2016
 * ---------------------------------------------------------------------------
 */

package Monster;

import zork.Control;

// TODO: Auto-generated Javadoc
/**
 * Zombie
 * 
 * <hr>
 * Date created: Apr 21, 2016
 * <hr>.
 *
 * @author Justin Adams
 */
public class Zombie extends Monster
{
	
	/** The slam. */
	int slam = 2;
	
	/** The missed. */
	int missed = 0;
	
	/**
	 * Constructor        
	 * 
	 * <hr>
	 * Date created: Apr 21, 2016 .
	 */
	public Zombie ()
	{
		setHealthPoints (16);
	}
	
	/**
	 * Attack Player         
	 *
	 * <hr>
	 * Date created: Apr 29, 2016 
	 *
	 * <hr>
	 * @param pct
	 * @return
	 * @see Monster.Monster#attack(int)
	 */
	@Override
	public int attack(int pct)
	{
		if (pct>25)
		{
			Control.updateText ("Zombie Has Slamed You");
			return slam;
		}
		else
			Control.updateText("Zombie Missed");
		return missed;
	}
	
	/**
	 * Zombie toString Method    
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
		return "Zombie";
	}

}

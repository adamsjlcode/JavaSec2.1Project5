/**
 * ---------------------------------------------------------------------------
 * File name: Game.java
 * Project name: zork
 * ---------------------------------------------------------------------------
 * Creator's name and email: Justin Adams, adamsjl3@goldmail.etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Apr 21, 2016
 * ---------------------------------------------------------------------------
 */

package zork;

import javax.swing.JOptionPane;

/**
 * Game Zork
 * 
 * <hr>
 * Date created: Apr 21, 2016
 * <hr>.
 *
 * @author Justin Adams
 */
public class Game
{
	
	/** The util. */
	private Utility util = new Utility();
	
	/** The dungon. */
	protected Room dungon[][] = new Room[5][5];
	
	/** The one. */
	protected Player one = new Player(100);
	
	/** The i index. */
	private int iIndex = 0;
	
	/** The row. */
	private int ROW = 0;
	
	/** The col. */
	private int COL = 0;
	
	/**
	 * Constructor        
	 * 
	 * <hr>
	 * Date created: Apr 21, 2016 .
	 */
	public Game ( )
	{
		for (int index = 0; index<dungon.length;index++)
			for (int sort = 0; sort<dungon.length;sort++)
				{
					System.out.println("Room: " + index + " " + sort);
					dungon[index][sort] = new Room();
					if(index == 0 && sort == 0)
					{
						dungon[index][sort].start(false);
					}
					if(index == 4 && sort == 4)
					{
						dungon[index][sort].exit(true);
					}
				}
		try
		{
			dungon[ROW][COL].move(one);

		}
		catch (Exception e)
		{
			System.out.println("Was not able to move the player to the first room");
		}	
		
	}//End Game ()
	
	/**
	 * Move.
	 *
	 * @param move the move
	 * @throws Exception the exception
	 */
	public void move (String move) throws Exception
	{
		System.out.println("Moved From Room " + ROW + " " + COL);
		switch(move)
		{
		case "North":
			dungon[ROW][COL].remove(false);
			ROW -= 1;
			try
			{
				dungon[ROW][COL].move(one);
				
			}
			catch (ArrayIndexOutOfBoundsException e)
			{
				ROW += 1;
				dungon[ROW][COL].move(one);
				throw new Exception();
			}
			break;
		case "South":
			dungon[ROW][COL].remove(false);
			ROW += 1;
			try
			{
				dungon[ROW][COL].move(one);
			}
			catch (ArrayIndexOutOfBoundsException e)
			{
				ROW -= 1;
				dungon[ROW][COL].move(one);
				throw new Exception();
			}
			break;
		case "East":
			dungon[ROW][COL].remove(false);
			COL += 1;
			try
			{
				dungon[ROW][COL].move(one);
			}
			catch (ArrayIndexOutOfBoundsException e)
			{
				COL -= 1;
				dungon[ROW][COL].move(one);
				throw new Exception();
			}
			break;
		case "West":
			dungon[ROW][COL].remove(false);
			COL -= 1;
			try
			{
				dungon[ROW][COL].move(one);
				
			}
			catch (ArrayIndexOutOfBoundsException e)
			{
				COL += 1;
				
				dungon[ROW][COL].move(one);
				throw new Exception();
			}
			break;
			
		}
		System.out.println("Moved To Room " + ROW + " " + COL);
	}//End move(String)
	
	/**
	 * Gets the health.
	 *
	 * @return the health
	 */
	public int getHealth()
	{
		return one.getHealthPoints ( );
	}//End getHealth()
		
		/**
		 * End Programs         
		 * 
		 * <hr>
		 * Date created: Apr 24, 2016
		 * 
		 * <hr>.
		 *
		 * @param b the b
		 */
	public void gameover (boolean b)
	{
		if(b == true)
		{
			JOptionPane.showMessageDialog (null,
				"Congrats you have made it throught the dungon", "Winner", 0);
			System.exit (0);
		}
		if(b== false)
		{
			JOptionPane.showMessageDialog (null,"Gameover", "Loser", 0);
			System.exit (0);
		}
	}//End gamneover()

	/**
	 * Continue Running game until Game ends.
	 *
	 * @return true, if successful
	 */
	public boolean rungame()
	{
		return false;
	}//End rungame()	
	
	/**
	 *  toString Method       
	 * 
	 * <hr>
	 * Date created: Apr 21, 2016 
	 * 
	 * <hr>.
	 *
	 * @return the string
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString ( )
	{
		String dungon = "";
		for (int index = 0; index<this.dungon.length;index++)
			for (int sort = 0; sort<this.dungon.length;sort++)
			{
				if(iIndex < 5)
				{
					iIndex++;
					dungon += this.dungon[index][sort].toString();
				}
				else
				{	
					iIndex = 1;
					dungon += "\n"+this.dungon[index][sort].toString();
				}
			}
		return dungon;
	}//End toString ( )
	
}//End Game

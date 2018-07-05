/**
 * ---------------------------------------------------------------------------
 * File name: Driver.java
 * Project name: zork
 * ---------------------------------------------------------------------------
 * Creator's name and email: Justin Adams, adamsjl3@goldmail.etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Apr 21, 2016
 * ---------------------------------------------------------------------------
 */

package zork;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 * Start of game Zork
 * 
 * <hr>
 * Date created: Apr 21, 2016
 * <hr>.
 *
 * @author Justin Adams
 */
@SuppressWarnings ("serial")
public class Driver extends JFrame
{
	
	/** The zork. */
	static Game zork = new Game();
	
	/** The know. */
	private static Utility know = new Utility();
	
	/**
	 * Main Method         
	 * 
	 * <hr>
	 * Date created: Apr 21, 2016
	 * 
	 * <hr>.
	 *
	 * @param args the arguments
	 */
	public static void main (String [ ] args)
	{		
		SwingUtilities.invokeLater(new Runnable()
		{
		@Override
		public void run()
		{
			JOptionPane.showMessageDialog (null,
				"<html><div style='text-align: center;'>"+
				know.theProgrammerInfo ( ) + "<br>" + "</html>.",
					"Welcome To ZORK",
						JOptionPane.INFORMATION_MESSAGE);
			new Welcome();
		}//End run()
		});
	}//End main (String [ ])

}//End Driver()







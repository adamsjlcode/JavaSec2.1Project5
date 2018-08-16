/**
 * ---------------------------------------------------------------------------
 * File name: Welcome.java
 * Project name: zork
 * ---------------------------------------------------------------------------
 * Creator's name and email: Justin Adams, adamsjl3@goldmail.etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Apr 26, 2016
 * ---------------------------------------------------------------------------
 */

package zork;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;


/**
 * Welcome Screen
 * 
 * <hr>
 * Date created: Apr 26, 2016
 * <hr>.
 *
 * @author Justin Adams
 */
public class Welcome
{
	
	/** The window. */
	JFrame window = new JFrame("Welcome");
	
	/** The start. */
	JButton start  = new JButton ("Start");
	
	/** The file. */
	Container file;
	
	/** The a start. */
	ActionListener aStart;
	
	/**
	 * Instantiates a new welcome.
	 */
	public Welcome()
	{
		try
		{
			window.setContentPane (new JLabel(new ImageIcon
			(ImageIO.read (this.getClass ( ).getResource ("/img/Welcome.jpg")))));
			file = window.getContentPane ( );
		}
		catch (Exception IO)
		{
			System.out.println ("Can't find Picture");
							
		}	
		window.setLayout(null);
		window.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		window.setResizable (false);
		start.setBounds (225, 325, 200, 40);
		start.addActionListener (new ButtonListener());
		window.add (start);
		window.pack ( );
		window.setVisible (true);
	}//End Welcome()
	
	/**
	 * The listener interface for receiving button events.
	 * The class that is interested in processing a button
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addButtonListener<code> method. When
	 * the button event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see ButtonEvent
	 */
	private class ButtonListener implements ActionListener
	{
		
		/**
		 * Start Zork         
		 *
		 * <hr>
		 * Date created: Apr 27, 2016 
		 *
		 * <hr>
		 * @param e
		 * @see java.awt.event.ActionListener#actionPerformed
		 *(java.awt.event.ActionEvent)
		 */
		@Override
		public void actionPerformed(ActionEvent e)
		{
			SwingUtilities.invokeLater (new Runnable()
			{
			@Override
			public void run()
			{
				try
				{
					new Control();
					window.dispose ( );
				}
				catch (Exception e2)
				{
					System.out.print ("Welcome error");
				}

			}//End run()
			});
		}//End actionPerformed(ActionEvent)
	}//End ButtomListener
}//End Welcome


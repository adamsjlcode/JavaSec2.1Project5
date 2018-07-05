/**
 * ---------------------------------------------------------------------------
 * File name: Control.java
 * Project name: zork
 * ---------------------------------------------------------------------------
 * Creator's name and email: Justin Adams, adamsjl3@goldmail.etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Apr 22, 2016
 * ---------------------------------------------------------------------------
 */

package zork;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;


/**
 * JFrame Zork Controller
 * 
 * <hr>
 * Date created: Apr 22, 2016
 * <hr>.
 *
 * @author Justin Adams
 */
public class Control extends JFrame
{
	
	/** The window. */
	private static JFrame window = new JFrame("ZORK");
	
	/** The upButton. */
	private JButton upButton  = new JButton ("UP");		
	
	/** The down Button. */
	private JButton downButton = new JButton ("Down");
	
	/** The left Button. */
	private JButton leftButton = new JButton ("Left");
	
	/** The right Button. */
	private JButton rightButton = new JButton ("Right");
	
	/** The map. */
	private JTextArea map;
	
	/** The playing info. */
	private static String playingInfo ="";
	
	/** The playing. */
	private static JScrollPane playing;
	
	/** The playing text. */
	private static JTextArea playingText;
	
	/** The file. */
	Container file;
	
	/** The plaf. */
	private String plaf = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";
	
	/** The move error. */
	private String moveError = "Can Not Move That Way";
	
	/** The dungeon font. */
	private Font dungeon = new Font ("ROMAN_BASELINE",Font.BOLD,16);
	
	/** The players font. */
	private Font players = new Font ("ROMAN_BASELINE",Font.BOLD,20);
	
	/** The player Info. */
	private static JTextArea playerInfo;
	

	/**
	 * Instantiates a new control.
	 */
	public Control()
	{
		try
		{
			UIManager.setLookAndFeel (plaf);
			SwingUtilities.updateComponentTreeUI (window);
		}
		catch (Exception e)
		{
			e.printStackTrace ( );
		}

		try
		{
			window.setContentPane (new JLabel(new ImageIcon(ImageIO.read 
			(this.getClass ( ).getResource ("/Dungeon.jpg")))));
			file = window.getContentPane ( );
		}
		catch (Exception IO)
		{
			System.out.println ("Can't find Picture");

		}
		window.setLayout(null);
		window.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		window.setResizable (false);
		window.setSize (1000, 800);
		map = new JTextArea (Driver.zork.toString ( ));
		map.setEditable (false);
		map.setBounds (100, 100, 500, 150);
		map.setFont (dungeon);
		map.setForeground (Color.WHITE);
		map.setOpaque (false);
		playerInfo = new JTextArea ("Player Health: " + Driver.zork.getHealth ( )+
									"\nPlayer Weapon: " + 
									Driver.zork.one.getWeapon());
		playerInfo.setBounds (100, 300, 400, 250);
		playerInfo.setForeground (Color.BLUE);
		playerInfo.setFont (players);
		playerInfo.setOpaque (false);
		playingText = new JTextArea();
		playing = new JScrollPane (playingText);
		playing.setBounds (600, 100, 350, 350);
		upButton.setBounds (410, 550, 200, 40);		
		downButton.setBounds (410, 650, 200, 40);
		leftButton.setBounds (210, 600, 200, 40);
		rightButton.setBounds (610, 600, 200, 40);		
		upButton.addActionListener (new ButtonListener());
		downButton.addActionListener (new ButtonListener());
		leftButton.addActionListener (new ButtonListener());
		rightButton.addActionListener (new ButtonListener());
		window.add (map);
		window.add (upButton);
		window.add (downButton);
		window.add (leftButton);
		window.add (rightButton);
		window.add (playing);
		window.add (playerInfo);
		window.setVisible (true);
	}//End Control()
	
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
		 * Move Player Around       
		 * 
		 * <hr>
		 * Date created: May 4, 2016 
		 * 
		 * <hr>.
		 *
		 * @param e the e
		 * @see java.awt.event.ActionListener#actionPerformed
		 *(java.awt.event.ActionEvent)
		 */
		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource ( ) == upButton)
			{
				try
				{
					Driver.zork.move ("North");
					playerStat();
					updateMap();
				}
				catch (Exception e1)
				{
					JOptionPane.showMessageDialog (null, moveError, "Error", 
					DISPOSE_ON_CLOSE);
				}
			}
			else if(e.getSource ( )==downButton)
			{
				try
				{
					Driver.zork.move ("South");
					playerStat();
					updateMap();
				}
				catch (Exception e1)
				{
					JOptionPane.showMessageDialog (null, moveError, "Error", 
					DISPOSE_ON_CLOSE);
				}
			}
			else if(e.getSource ( )==leftButton)
			{
				try
				{
					Driver.zork.move ("West");
					playerStat();
					updateMap();
				}
				catch (Exception e1)
				{
					JOptionPane.showMessageDialog (null, moveError, "Error", 
					DISPOSE_ON_CLOSE);
				}
			}
			else if(e.getSource ( )==rightButton)
			{
				try
				{
					Driver.zork.move ("East");
					playerStat();
					updateMap();
				}
				catch (Exception e1)
				{
					JOptionPane.showMessageDialog (null, moveError, "Error", 
					DISPOSE_ON_CLOSE);
				}
			}
		}//End actionPerformed(ActionEvent)
	}//End ButtonListener
	
	/**
	 * Update text.
	 *
	 * @param newInfo the new info
	 */
	public static void updateText(String newInfo)
	{
		playingInfo += newInfo+"\n";
		playingText.setText (playingInfo);
		playingText.invalidate ( );
		playing.repaint ( );
	}//End updateText(String)
	
	/**
	 * Player stat.
	 */
	public void playerStat()
	{
		window.remove (playerInfo); 
		playerInfo = new JTextArea ("Player Health: " + Driver.zork.getHealth ( )+
			"\nPlayer Weapon: " + Driver.zork.one.getWeapon());
		playerInfo.setBounds (100, 300, 400, 250);
		playerInfo.setForeground (Color.BLUE);
		playerInfo.setFont (players);
		playerInfo.setOpaque (false);
		window.add (playerInfo); 
		window.repaint ( );
	}//End playerStat()
	
	/**
	 * Update map.
	 */
	public void updateMap()
	{
		window.remove (map); 
		map = new JTextArea (Driver.zork.toString ( ));
		map.setEditable (false);
		map.setBounds (100, 100, 500, 150);
		map.setFont (dungeon);
		map.setForeground (Color.WHITE);
		map.setOpaque (false);
		window.add (map); 
		window.repaint ( );
	}//End updateMap()
			
}//End Control
	
	

	


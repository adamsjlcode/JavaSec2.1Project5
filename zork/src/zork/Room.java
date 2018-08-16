/**
 * ---------------------------------------------------------------------------
 * File name: Room.java
 * Project name: zork
 * ---------------------------------------------------------------------------
 * Creator's name and email: Justin Adams, adamsjl3@goldmail.etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Apr 21, 2016
 * ---------------------------------------------------------------------------
 */

package zork;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
import Monster.Basilisk;
import Monster.Gargoyle;
import Monster.Ghoul;
import Monster.Gnome;
import Monster.Human_Skeleton;
import Monster.Imp;
import Monster.Monster;
import Monster.Orge;
import Monster.Vampire;
import Monster.White_Dragon;
import Monster.Zombie;
import Weapons.Battleaxe;
import Weapons.Dagger;
import Weapons.Diamond_Sword;
import Weapons.Sword;
import Weapons.Weapon;

// TODO: Auto-generated Javadoc
/**
 * A Single Room in Game
 * 
 * <hr>
 * Date created: Apr 21, 2016
 * <hr>.
 *
 * @author Justin Adams
 */
public class Room
{

	/** The m. */
	private Monster m;

	/** The w. */
	private Weapon w;

	/** The one. */
	private Player one;

	/** The pct. */
	private int pct;

	/** The monster chance. */
	private boolean mChance;

	/** The weapon chance. */
	private boolean wChance;

	/** The random number. */
	private Random ran;

	/** The player chance. */
	private boolean pChance;

	/** The util. */
	private Utility util = new Utility();

	/** The kb. */
	private Scanner kb = new Scanner(System.in);

	/** The exit. */
	private boolean exit;



	/**
	 * Constructor        
	 * 
	 * <hr>
	 * Date created: Apr 21, 2016 .
	 */
	public Room ()
	{
		ran = new Random();
		pct = ran.nextInt (125);
		if (pct<25)
		{	
			pct = ran.nextInt (100);
			switchMonster (pct);
			System.out.println (m);
			mChance = true;
		}
		pct = ran.nextInt (100);
		if (pct<25)
		{
			pct = ran.nextInt (100);
			switchWeapon (pct);
			System.out.println (w);
			wChance = true;
		}
		if (mChance == false && wChance == false)
		{
			System.out.println("Empty");
		}			
	}//End Room ()

	/**
	 * Shallow Copy Constructor        
	 * 
	 * <hr>
	 * Date created: Apr 21, 2016 .
	 *
	 * @param one the one
	 */
	public Room (Player one)
	{
		this.one = one;
	}//End Room (Player)

	/**
	 * Move Player around         
	 * 
	 * <hr>
	 * Date created: Apr 21, 2016
	 * 
	 * <hr>.
	 *
	 * @param one2 the one2
	 */
	public void move(Player one2)
	{
		one=one2;
		pChance = true;
		if (mChance == true)fight();
		if(wChance == true)
		{
			int option;	//Option For JOptionPane
			option = JOptionPane.showConfirmDialog (null, 
			"Would you to keep the weapon you find in the room"+
			"\n"+ w +" Damage: " + w.getDamagePoints ( ), "New Weapon", 
											JOptionPane.YES_NO_OPTION);
			if(option == JOptionPane.YES_OPTION)
			{
				one.setNewWeapon(w);
				wChance = false;
			}
		}
		if (exit == true)
		{
			Driver.zork.gameover (true);
		}
	}//End move(Player)

	/**
	 * A Fight Between Player and Monster         
	 * 
	 * <hr>
	 * Date created: Apr 22, 2016
	 * 
	 * <hr>.
	 */
	private void fight ( )
	{
		Control.updateText("You have enter a room with a monster");
		do
		{
			pct = ran.nextInt (100);
			one.attacked (m.attack (pct));
			Control.updateText(("Player Health: " + one.getHealthPoints ( )));
			pct = ran.nextInt (100);
			m.attacked (one.attack(pct, m.toString ( )));
			if (one.getHealthPoints ( ) <= 0)
			{
				Control.updateText("Player is died");
				Driver.zork.gameover (false);
			}			
			Control.updateText((m.toString ( )+ " Health: "
			+ m.getHealthPoints ( )));
			if (m.getHealthPoints ( ) <= 0)
			{
				Control.updateText(m + " is died");
				mChance = false;
				return;
			}			
		}while (m.getHealthPoints ( ) >= 0|| one.getHealthPoints ( ) >= 0);
	}//End fight()

	/**
	 * Removes the player from room.
	 *
	 * @param blnI the bln i
	 */
	public void remove(boolean blnI)
	{
		one=null;
		pChance = false;
	}//End remove(boolean)

	/**
	 * Switch monster.
	 *
	 * @param pct the pct
	 */
	public void switchMonster(int pct)
	{
		if (pct<2)
		{
			m = new White_Dragon();
		}
		else if (pct>2&&pct<10)
		{
			m = new Basilisk();
		}
		else if (pct>10&&pct<20)
		{
			m = new Gargoyle();
		}
		else if (pct>20&&pct<30)
		{
			m = new Vampire();
		}
		else if (pct>30&&pct<40)
		{
			m = new Orge();
		}
		else if (pct>40&&pct<50)
		{
			m = new Ghoul();
		}
		else if (pct>50&&pct<60)
		{
			m = new Gnome();
		}
		else if (pct>60&&pct<75)
		{
			m = new Zombie();
		}
		else if (pct>75&&pct<95)
		{
			m = new Human_Skeleton();
		}
		else 
			m = new Imp();
	}//End switchMonster(int)

	/**
	 * Switch weapon.
	 *
	 * @param pct the pct
	 */
	public void switchWeapon(int pct)
	{
		if (pct<10)
		{
			w = new Diamond_Sword ();
		}
		else if (pct>10&&pct<30)
		{
			w = new Battleaxe ();
		}
		else if (pct>30&&pct<50)
		{
			w = new Sword ();
		}
		else
			w = new Dagger ();
	}//End switchWeapon(int)

	/**
	 * Starting point with no monster or weapons         
	 * 
	 * <hr>
	 * Date created: Apr 27, 2016
	 * 
	 * <hr>.
	 *
	 * @param b the b
	 */
	public void start(boolean b)
	{
		mChance = b;
		wChance = b;
		System.out.println("Start Created");
	}//End start(boolean)

	/**
	 * Exit point         
	 * 
	 * <hr>
	 * Date created: Apr 27, 2016
	 * 
	 * <hr>.
	 *
	 * @param b the b
	 */
	public void exit (boolean b)
	{
		System.out.println("Exit Created");
		exit = b;
	}//End exit (boolean)

	/**
	 * toString Method         
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
		String room = "";	//Creates Room Image

		if (mChance == true&&wChance == true&&pChance == true)	
			room =  ("|_P_M_W_|");
		else if(mChance == true&&wChance == true&&pChance == false)
			room = ("|___M_W_|");
		else if(mChance == true&&wChance == false&&pChance == false)
			room = ("|___M___|");
		else if(mChance == false&&wChance == true&&pChance == false)
			room = ("|_____W_|");
		else if(mChance == false&&wChance == false&&pChance == true)
			room = ("|_P_____|");
		else if(mChance == false&&wChance == true&&pChance == true)
			room = ("|_P___W_|");	
		else if(mChance == true&&wChance == false&&pChance == true)
			room = ("|_P_M___|");
		else 
			room += "|_______|";
		return room;
	}//End toString()
}//End Room

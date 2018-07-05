/**
 * ---------------------------------------------------------------------------
 * File name: GetCurrentDateAndTime.java
 * Project name: rollManager
 * ---------------------------------------------------------------------------
 * Creator's name and email: Justin Adams, Adamsjl3@goldmail.etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Apr 1, 2016
 * ---------------------------------------------------------------------------
 */

package zork;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Get the current time.
 *
 * <hr>
 * Date created: Nov 4, 2015
 * <hr>
 * Date updated: Apr 1, 2016
 * <hr>
 * @author Justin Adams
 */
public class GetCurrentDateAndTime
{
	 
	   
    int day;
	int month; 
	int year;
	GregorianCalendar date = new GregorianCalendar();
	  
	public String date()
	{
		String update;
		day = date.get(Calendar.DAY_OF_MONTH);
		month = date.get(Calendar.MONTH);
		year = date.get(Calendar.YEAR);
		update = ("Current date is  "+(month+1)+"/"+day+"/"+year);
		return update;
	}//End date()
}//End GetCurrentDateAndTime()
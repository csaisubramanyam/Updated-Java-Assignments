package com.valtech.training.corejava.day5;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateTest {
	
    /*
     * HH - Hour
     * mm - minute         
     * SS - second
     * SSS - MilliSeconds
     * YY / YYYY - Year
     * MM / MMMM - Month
     * dd - Day 
     */
	DateFormat df = new SimpleDateFormat("dd-MMM-YYYY HH:mm:ss");

	@Test
	public void testDate() {
		Date date = new Date();
		System.out.println(date);
		System.out.println(df.format(date));
	}


    @Test
    public void testDateOldWay() {
	    Date date = new Date(100,3,11);
	    System.out.println(date);
	    System.out.println(df.format(date));
    }
    
    
    @Test
    public void testDateWithCal() {
    	Calendar cal = Calendar.getInstance();
    	cal.set(Calendar.YEAR,2000);
	    cal.set(Calendar.MONTH, 3);
	    cal.set(Calendar.DATE, 11);
	    Date date = cal.getTime();
	    System.out.println(date);
	    System.out.println(df.format(date));
    }
    
    
    @Test
    public void testDateFromString() throws Exception {
    	DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
    	Date date = df.parse("15-08-1947");
    	System.out.println(date);
    }
    
}

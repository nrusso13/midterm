package com.cisc181.core;

import static org.junit.Assert.*;



import com.cisc181.eNums.eTitle;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;
import java.util.Date;



public class Staff_Test {
	
	//makes arraylist of staff	
	static ArrayList<Staff> staff = new ArrayList<Staff>();
	
	public static Date newDate(int yr, int mn, int day){
		Calendar Cal = Calendar.getInstance();
		Cal.set(yr,  mn, day);
		return Cal.getTime();
	
	}
	
	
	//five people added to the ArrayList
	@BeforeClass
	public static void setup() throws PersonException{
		
		staff.add(new Staff("Gilberto", "Peter", "Schleniger", newDate(1955, 6, 24),"Ivy Court",
				"(484)-343-7584","berto@gmail.com","M 6:00-8:00pm",4, 62900, newDate(2012, 1,14), eTitle.MR));
		
		staff.add(new Staff("Andrew", "Ryan", "Gates", newDate(1983, 6, 4),"Stallion Lane",
				"(302)-333-2984","andyman@gmail.com","M 11:00-12:00pm",3, 42000, newDate(2010, 6, 12), eTitle.MR));
		
		staff.add(new Staff("Renee", "Marie", "Smith", newDate(1986, 3, 2),"Sunset Avenue",
				"(610)-222-4276","RMSbabe@yahoo.com","W 2:30-4:00pm",1, 55200, newDate(2011, 8,12), eTitle.MRS));
		
		staff.add(new Staff("Michael", "Richard", "Scott", newDate(1969, 9, 15),"Lancaster Court",
				"(484)-931-7278","mikeymike89@gmail.com","TH 12:00-2:00pm",2, 62000, newDate(2012, 5,30), eTitle.MR));
		
		staff.add(new Staff("Natalie", "Rose", "Russo", newDate(1989, 4, 12),"Bradford Drive",
				"(484)-477-5509","natty1990@aol.com","T 1:00-3:00pm",5, 75899, newDate(2015, 12,10), eTitle.MS));
		
		
	}
	
	@Test 
	public void testAvgSalary()  throws PersonException{
		double sum = 0;
		for (Staff avgStaff : staff){
			sum = sum + avgStaff.getSalary();
		}
		
		double AvrgSalary = (sum / staff.size());
		
		assertEquals(AvrgSalary, 59599.80, .01);

	}	
	
	@Test (expected = PersonException.class)
	public void testPhoneNmbrfail() throws PersonException{
		
		new Staff("Aurthur", "Swag", "Thomas", newDate(1976, 7, 17),"Roseway Avenue",
				"1-800-123-4567","swagon100@aol.com","F 8:00-9:00pm",3, 78000, newDate(2010, 6,18), eTitle.MR);

}
	
	@Test (expected = PersonException.class)
	public void testDOBfail() throws PersonException{
		
		new Staff("Jonathon", "Sean", "Phillips", newDate(1899, 4, 12),"Apple Court",
				"(610)-453-9923","johnnyman@aol.com","T 1:00-2:00pm",4, 43900, newDate(2001, 1,10), eTitle.MR);
	}
	

}

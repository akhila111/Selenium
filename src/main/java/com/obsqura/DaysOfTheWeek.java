package com.obsqura;

public class DaysOfTheWeek 
{


	public String getDay(int a) 
	{
	    String day;
		switch(a)
	{
		case 1:
			day="Sunday";
			return day ; 
		case 2:
			day="Monday";
			return day ; 
		case 3:
			day="Tuesday";
			return day ; 
		case 4:
			day="Wednesday";
			return day ; 
		case 5:
			day="Thursday";
			return day ; 
		case 6:
			day="Friday";
			return day ; 
		case 7:
			day="Saturday";
			return day ; 
		default:
			return "Invalid Entry";
		}
	}

}

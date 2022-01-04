package com.obsqura;

public class TestDayOfTheWeek
{
	
	public static void main(String args[])
	{
		case_0();
		caseValidData();
		case_8();
		caseBigNumber();		
	}

	/*1.  Test case '0'
	Expected Result: "Invalid Entry"*/
	public static void case_0()
	{
	int test_data=0;
	DaysOfTheWeek obj=new DaysOfTheWeek();
	String actual_result=obj.getDay(test_data);
	String Expected="Invalid Entry";
	if(actual_result.equals(Expected))
	{
		System.out.println("Test passed");
	}
	else
	{
		System.out.println("Test Failed");

	}
	}
	
	/* 2 to 8 Test case '1' to '7'
	   Expected Result : "Show corresponding dates"
	 */
	public static void caseValidData()
	{
	for(int test_data=1;test_data<8;test_data++)
	{

	DaysOfTheWeek obj=new DaysOfTheWeek();
	String actual_result=obj.getDay(test_data);
	if(actual_result.equals("Sunday")||
			actual_result.equals("Monday")||
			actual_result.equals("Tuesday")||
			actual_result.equals("Wednesday")||
			actual_result.equals("Thursday")||
			actual_result.equals("Friday")||
			actual_result.equals("Saturday"))
	{
		System.out.println("Test passed");
	}
	else
	{
		System.out.println("Test Failed");

	}
	}
	}
	/*
	 3. Test case '8'
	 Expected Result "Invalid Entry"
	 */
	public static void case_8()
	{
		int test_data=8;
		DaysOfTheWeek obj=new DaysOfTheWeek();
		String actual_result=obj.getDay(test_data);
		String Expected="Invalid Entry";
		if(actual_result.equals(Expected))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test Failed");

		}
	}
	/*
	 4. Test case '1111111111111111111111111111111111111111111111111111111111'
	 Expected Result "Invalid Entry"
	 */
	
	public static void caseBigNumber()
	{
		int test_data=11111111;
		DaysOfTheWeek obj=new DaysOfTheWeek();
		String actual_result=obj.getDay(test_data);
		String Expected="Invalid Entry1";
		if(actual_result.equals(Expected))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test Failed");

		}
	}
	
	
	
	
}

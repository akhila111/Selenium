package com.obsqura;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDayOfTheWeek
{
	/*1.  Test case '0'
	Expected Result: "Invalid Entry"*/
	@Test
	public static void case_0()
	{
	int test_data=0;
	DaysOfTheWeek obj=new DaysOfTheWeek();
	String actual_result=obj.getDay(test_data);
	String Expected="Invalid Entry";
	Assert.assertEquals(actual_result,Expected,"Test Failed");
	}
	
	/* 2 to 8 Test case '1' to '7'
	   Expected Result : "Show corresponding dates"
	   */
	@Test
	public static void case_1()
	{
	int test_data=1;
	DaysOfTheWeek obj=new DaysOfTheWeek();
	String actual_result=obj.getDay(test_data);
	String Expected="Sunday";
	Assert.assertEquals(actual_result,Expected,"Test Failed");
	}
	
	@Test
	public static void case_2()
	{
	int test_data=2;
	DaysOfTheWeek obj=new DaysOfTheWeek();
	String actual_result=obj.getDay(test_data);
	String Expected="Monday";
	Assert.assertEquals(actual_result,Expected,"Test Failed");
	}
	
	@Test
	public static void case_3()
	{
	int test_data=3;
	DaysOfTheWeek obj=new DaysOfTheWeek();
	String actual_result=obj.getDay(test_data);
	String Expected="Tuesday";
	Assert.assertEquals(actual_result,Expected,"Test Failed");
	}
	
	@Test
	public static void case_4()
	{
	int test_data=4;
	DaysOfTheWeek obj=new DaysOfTheWeek();
	String actual_result=obj.getDay(test_data);
	String Expected="Wednesday";
	Assert.assertEquals(actual_result,Expected,"Test Failed");
	}
	
	@Test
	public static void case_5()
	{
	int test_data=5;
	DaysOfTheWeek obj=new DaysOfTheWeek();
	String actual_result=obj.getDay(test_data);
	String Expected="Thursday";
	Assert.assertEquals(actual_result,Expected,"Test Failed");
	}
	
	@Test
	public static void case_6()
	{
	int test_data=6;
	DaysOfTheWeek obj=new DaysOfTheWeek();
	String actual_result=obj.getDay(test_data);
	String Expected="Friday";
	Assert.assertEquals(actual_result,Expected,"Test Failed");
	}
	
	@Test
	public static void case_7()
	{
	int test_data=7;
	DaysOfTheWeek obj=new DaysOfTheWeek();
	String actual_result=obj.getDay(test_data);
	String Expected="Saturday";
	Assert.assertEquals(actual_result,Expected,"Test Failed");
	}
	
	
	
	/* 3. Test case '8'
	 Expected Result "Invalid Entry"
	 */
	@Test
	public static void case_8()
	{
	int test_data=8;
	DaysOfTheWeek obj=new DaysOfTheWeek();
	String actual_result=obj.getDay(test_data);
	String Expected="Invalid Entry";
	Assert.assertEquals(actual_result,Expected,"Test Failed");
	}
	
	
	/*
	 4. Test case '1111111111111111111111111111111111111111111111111111111111'
	 Expected Result "Invalid Entry"

		 */
	@Test
	public static void caseBigNumber()
	{
		int test_data=11111111;
		DaysOfTheWeek obj=new DaysOfTheWeek();
		String actual_result=obj.getDay(test_data);
		String Expected="Invalid Entry1";
		Assert.assertEquals(actual_result,Expected,"Test Failed");
	}
	
	
	
	
}

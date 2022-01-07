package com.obsqura;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumAssignment_Jan06 
{

    @Test
    void verifyPageTitle()
    {
 		System.setProperty("webdriver.chrome.driver","C://Users//user//Drivers//chromedriver.exe");
 		WebDriver driver=new ChromeDriver();
 		driver.manage().window().maximize();
 		driver.get("https://www.obsqurazone.com");
	    String actual_result=driver.getTitle();
	    String expected_result="Obsqura Zone: Selenium Automation Trainers";
	    Assert.assertEquals(actual_result, expected_result,"Page title is not as expected");
	    driver.close();
    }
    
	
	@Test
	void countNumberOfImages()
	{
		System.setProperty("webdriver.chrome.driver","C://Users//user//Drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.obsqurazone.com");
        String pageSource=driver.getPageSource();
		driver.get("https://toolsqa.com");
		String words[] = pageSource.split(">"); 
		int count=0;   
 	      for(int i=0;i<words.length;i++)     
	      {
	    	  System.out.println("Words"+words[i]);
	         if(words[i].contains("<img src=")) 
	            {
	               count=count+1;    
	            }
	      }
	         System.out.println("No of images : "+count); 
         
      driver.close();   
	}
}
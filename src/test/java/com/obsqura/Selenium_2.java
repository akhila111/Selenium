package com.obsqura;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium_2 
{

    @Test
   void verifyPageTitle()
   {
		System.setProperty("webdriver.chrome.driver","C://Users//Akhila//Drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://toolsqa.com");
	    System.out.println("Page1 title  is : "+ driver.getTitle());
	    //driver.navigate().to("https://toolsqa.com/selenium-webdriver/selenium-tutorial");
	   // System.out.println("Page2 title is : "+ driver.getTitle());
	    driver.navigate().back();
	    System.out.println("Page3 title is : "+ driver.getTitle());
	    //driver.navigate().forward();
	    //System.out.println("Page4 title is : "+ driver.getTitle());
	    driver.navigate().refresh();
	    System.out.println("Page5 title is : "+ driver.getTitle());
	    driver.close();
   }
   
}

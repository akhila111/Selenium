package com.obsqura;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Selenium_WebElement
{
	WebDriver driver;
    @BeforeMethod
   void openBrowser()
   {
		System.setProperty("webdriver.chrome.driver","C://Users//user//Drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.get("https://toolsqa.com");
   }
    @Test
    void findImage()
    {
    	//WebElement element=driver.findElement(By.tagName("img"));
    	List<WebElement> elements=driver.findElements(By.tagName("img"));
    	
    	System.out.println("No of images"+elements.size());
    	//Assert.assertEquals(true,elements.isDisplayed(),"Element not present");
    }

    
    @AfterMethod
    void closeBrowser()
    {
    	driver.close();
    }
}

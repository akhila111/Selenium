package com.obsqura;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumAssignment_Jan07
{
	WebDriver driver;
	@BeforeMethod
	void openingBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//user//Drivers//chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.obsqurazone.com");
	}
	
	@Test
	void getNumberOfImages()
	{
		List<WebElement> elements =driver.findElements(By.tagName("img"));
		System.out.println("No of images : "+elements.size());
	}
	
	@AfterMethod
	void closingBrowser()
	{
		driver.close();
	}
	
}

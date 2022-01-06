package com.obsqura;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium_1 {

	@Test
	void OpeningBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//user//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.obsqurazone.com");
		driver.getTitle();
		System.out.println("The url is : "+driver.getCurrentUrl());
		System.out.println("The source: "+driver.getPageSource());
		driver.close();
	    
	}
}

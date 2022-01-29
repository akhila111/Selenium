package com.obsqura;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test25thJan 
{
@Test
	void testBrowserWindow()
	{
	WebElement window_button=driver.findElement(By.id("windowButton"));
	window_button.click();
	window_button.click();
	window_button.click();
	window_button.click();
	String parent_windiow_id=driver.getWindowHandle();
	System.out.println("Parent window : "+parent_windiow_id);
	Set<String> child_windows=driver.getWindowHandles();
	System.out.println("Number of child windows : "+child_windows.size());
	for (String st:child_windows)
	{
		if(!st.equalsIgnoreCase(parent_windiow_id))
		{
			driver.switchTo().window(st);
			WebElement child_pagetitle=driver.findElement(By.id("sampleHeading"));
            System.out.println("Heading : "+child_pagetitle.getText());
            driver.close();					
		
		}
	}
	driver.switchTo().window(parent_windiow_id);
	}
	
		WebDriver driver;
		@BeforeMethod
		void openingBrowser()
		{
			System.setProperty("webdriver.chrome.driver", "C://Users//Akhila//Drivers//chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/browser-windows");
	}
		@AfterMethod
		void closingBrowser()
		{
			driver.close();
		}
}

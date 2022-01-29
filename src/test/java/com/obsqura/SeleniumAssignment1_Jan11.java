package com.obsqura;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumAssignment1_Jan11
{
	WebDriver driver;
	@BeforeMethod
	void openingBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//Akhila//Drivers//chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/elements");
	}

	@Test
	void verifyTextBox() throws InterruptedException
	{
		driver.navigate().to("https://demoqa.com/text-box");
		WebElement fullName_textbox=driver.findElement(By.id("userName"));
		Assert.assertTrue(fullName_textbox.isDisplayed(),"Full Name text box is not present in the page");
		fullName_textbox.sendKeys("Akhila Kumar");
		WebElement userEmail_textbox=driver.findElement(By.id("userEmail"));
		Assert.assertTrue(userEmail_textbox.isDisplayed(),"User Email text box is not present in the page");
		userEmail_textbox.sendKeys("akku.akhila111@gmail.com");
		WebElement currentAddress_textbox=driver.findElement(By.id("currentAddress"));
		Assert.assertTrue(currentAddress_textbox.isDisplayed(),"Current Address text box is not present in the page");
		currentAddress_textbox.sendKeys("Current");
		WebElement permanentAddress_textbox=driver.findElement(By.id("permanentAddress"));
		Assert.assertTrue(permanentAddress_textbox.isDisplayed(),"Permanent Address text box is not present in the page");	
		permanentAddress_textbox.sendKeys("Permanent");
		WebElement submit_Button=driver.findElement(By.id("submit"));
		submit_Button.click();
	    WebElement name=driver.findElement(By.id("name"));
		Assert.assertTrue(name.getText().contains("Akhila Kumar"),"Full Name is not displayed correctly");
	    WebElement email=driver.findElement(By.id("email"));
		Assert.assertTrue(email.getText().contains("akku.akhila111@gmail.com"),"Email is not displayed correctly");
		WebElement currentAddress=driver.findElement(By.id("currentAddress"));
		Assert.assertTrue(currentAddress.getText().contains("Current"),"Current address is not displayed correctly");
		WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
		Assert.assertTrue(permanentAddress.getText().contains("Permanent"),"Permanent address is not displayed correctly");
	}
	
	
	@AfterMethod
	void closingBrowser()
	{
		driver.close();
	}
}

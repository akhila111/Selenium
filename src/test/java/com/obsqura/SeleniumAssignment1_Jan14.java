package com.obsqura;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumAssignment1_Jan14 
{
WebDriver driver;
@BeforeMethod
void openingBrowser()
{
	System.setProperty("webdriver.chrome.driver", "C://Users//user//Drivers//chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	driver.manage().window().maximize();
	driver.get("http://buffalocart.com/demo/crm/");
	WebElement userName_textbox=driver.findElement(By.id("email"));
	userName_textbox.sendKeys("admin@admin.com");
	WebElement password_textbox=driver.findElement(By.id("password"));
	password_textbox.sendKeys("123456");
	WebElement submit_button=driver.findElement(By.xpath("//button[@type='submit']"));
	submit_button.click();
}
@Test
void GetCompanyNamesInClients() throws InterruptedException
{
	WebElement clients_link=driver.findElement(By.xpath("//span[text()='Clients']"));
	clients_link.click();
	WebElement clients_tab=driver.findElement(By.xpath("//a[text()='Clients']"));
	clients_tab.click();
	List<WebElement> company_list=driver.findElements(By.xpath("//table[@id='client-table']/tbody/tr/td[2]"));
	System.out.println("No of compoanies: "+company_list.size());
	Iterator<WebElement> iter = company_list.iterator();
	while(iter.hasNext()) {
	System.out.println(iter.next().getText());
	}
}

@AfterMethod
void closingBrowser()
{
	driver.close();
}
}

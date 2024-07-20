package com.synechron.selenium.SeleniumTraining.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicOperations {

	WebDriver driver = null;
	
	@Test
	public void formFill() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/form");
		driver.findElement(By.id("first-name")).sendKeys("FirstName");
		driver.findElement(By.id("last-name")).sendKeys("LastName");
		driver.findElement(By.id("job-title")).sendKeys("Trainer");
		driver.findElement(By.id("radio-button-2")).click();
		driver.findElement(By.id("checkbox-1")).click();
		driver.findElement(By.id("datepicker")).click();
		driver.findElement(By.xpath("//td[text()='24']")).click();
		
		Thread.sleep(10000);
		driver.quit();
	}
}

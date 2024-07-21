package com.synechron.selenium.SeleniumTraining.browser;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.synechron.selenium.SeleniumTraining.utils.DriverUtils;


public class BrowserOperations extends DriverUtils
{
	
	@Test
	public void browserOperations() throws InterruptedException
	{
		driver = getDriver("edge");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://www.gsmarena.com/apple_iphone_15_pro-12557.php");
		Thread.sleep(5000);
		System.out.println("Current url : " + driver.getCurrentUrl());
		System.out.println("Window ID : " + driver.getWindowHandle());
		System.out.println("Title of the page " + driver.getTitle());
		
		Assert.assertEquals("Apple iPhone 15 Pro - Full phone specifications", driver.getTitle());
		
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
//		driver.close();
		driver.quit();
	}

}

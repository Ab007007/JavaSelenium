package com.synechron.selenium.SeleniumTraining.dropdown;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import com.synechron.selenium.SeleniumTraining.utils.DriverUtils;

public class DropDownDemo extends DriverUtils 
{
	
	@AfterSuite
	public void cleanupDriverInstances() throws IOException
	{
		driver.quit();
		Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe");
		Runtime.getRuntime().exec("taskkill /F /IM edgedriver.exe");
	}
	
	@Test
	public void dropDownwithCustomTag() throws InterruptedException
	{
		driver = getDriver();
		
		driver.get("https://formy-project.herokuapp.com/dropdown");

		driver.findElement(By.id("dropdownMenuButton")).click();
		
		fluentWaitforVisibility(driver.findElement(By.linkText("Page Scroll")));
		
		driver.findElement(By.linkText("Page Scroll")).click();
		
		Thread.sleep(5000);
		
		String textOnScreen = driver.findElement(By.tagName("h1")).getText();
		
		System.out.println("Text on Page Scroll : " + textOnScreen);
		
		driver.quit();
	}
	
	
	
	@Test
	public void dropDownWithSelectTag() throws InterruptedException
	{
		driver = getDriver();
		
		driver.get("https://formy-project.herokuapp.com/form");
		
		Select sel = new Select(driver.findElement(By.id("select-menu")));
		
		sel.selectByIndex(2);
		Thread.sleep(3000);

		sel.selectByValue("4");
		Thread.sleep(3000);
		
		sel.selectByVisibleText("0-1");
		Thread.sleep(3000);
		
		driver.quit();
	}

	
	
	@Test
	public void multiSelectdropDownWithSelectTag() throws InterruptedException
	{
		driver = getDriver();
		
		driver.get("file:///C:/Trainings/Synechron_13_07_Weekend_Java/Eclipse_WS/SeleniumTraining/html/multiSelect.html");
		
		Select sel = new Select(driver.findElement(By.tagName("select")));
		
		sel.selectByIndex(2);
		Thread.sleep(3000);

		sel.selectByValue("volvo");
		Thread.sleep(3000);
		
		sel.selectByVisibleText("Audi");
		Thread.sleep(3000);
		
		sel.deselectByIndex(3);
		Thread.sleep(3000);

		sel.deselectByValue("volvo");
		Thread.sleep(3000);
		
		sel.deselectByVisibleText("Mercedes");
		Thread.sleep(3000);
		
		
		sel.selectByIndex(2);
		Thread.sleep(3000);

		sel.selectByValue("volvo");
		Thread.sleep(3000);
		
		sel.selectByVisibleText("Audi");
		Thread.sleep(3000);
		
		sel.deselectAll();
		
		driver.quit();
	}
	
	
}

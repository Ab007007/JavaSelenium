package com.synechron.selenium.SeleniumTraining.waits;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.base.Function;
import com.synechron.selenium.SeleniumTraining.utils.DriverUtils;

public class FluentWaitUsingFunctionDemo extends DriverUtils
{
	
	@Test
	public void waitTillSpecificConditionMet() 
	{
		driver = getDriver("edge");
		driver.get("file:///C:/Trainings/Synechron_13_07_Weekend_Java/Eclipse_WS/SeleniumTraining/html/tiimeout.html");
		
		driver.findElement(By.tagName("button")).click();
		
	//	fluentWaitforVisibility(driver.findElement(By.id("demo")));
		fluentWaitforVisibility(100, 10, driver.findElement(By.id("demo")));
				
		String text1 = driver.findElement(By.id("demo")).getText();
		String text2 = driver.findElement(By.id("demo2")).getText();
		
		System.out.println(text1);
		System.out.println(text2);
		
		driver.quit();
		
	}

}

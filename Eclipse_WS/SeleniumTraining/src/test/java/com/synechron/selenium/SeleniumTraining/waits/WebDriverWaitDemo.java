package com.synechron.selenium.SeleniumTraining.waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.synechron.selenium.SeleniumTraining.utils.DriverUtils;

public class WebDriverWaitDemo extends DriverUtils
{
	
	@Test
	public void waitTillSpecificConditionMet() 
	{
		driver = getDriver("edge");
		driver.get("file:///C:/Trainings/Synechron_13_07_Weekend_Java/Eclipse_WS/SeleniumTraining/html/tiimeout.html");
		
		driver.findElement(By.tagName("button")).click();
		
		//Step-1 : Create a wait object and specify the  max timeout
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		//Step-2 : Using wait object wait for the specific condition to be met
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("demo"))));
		
		String text1 = driver.findElement(By.id("demo")).getText();
		String text2 = driver.findElement(By.id("demo2")).getText();
		
		System.out.println(text1);
		System.out.println(text2);
		
		driver.quit();
		
	}

}

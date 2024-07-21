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

public class FluentWaitDemo extends DriverUtils
{
	
	@Test
	public void waitTillSpecificConditionMet() 
	{
		driver = getDriver("edge");
		driver.get("file:///C:/Trainings/Synechron_13_07_Weekend_Java/Eclipse_WS/SeleniumTraining/html/tiimeout.html");
		
		driver.findElement(By.tagName("button")).click();
		
		//Step-1 : Create a Fluent wait object and specify the  
		//1. Web Element 
		//2. max timeout
		//3. polling time
		//4. Can i allowed to ignore exception 
		FluentWait<WebElement> wait = new FluentWait<WebElement>(driver.findElement(By.id("demo")))
				.pollingEvery(Duration.ofMillis(500))
				.withTimeout(Duration.ofSeconds(20))
				.ignoring(NoSuchElementException.class)
				.ignoring(Exception.class);
		
		//Step-2 : Create an object to Function Interface and Write your own wait logic
		// inside apply method
		Function<WebElement, Boolean> fun = new Function<WebElement, Boolean>() {
			
			@Override
			public Boolean apply(WebElement ele) 
			{
				if(!ele.isDisplayed())
				{
					System.out.println("Element Still not loaded..Waiting!!!!");
					return false;
				}
				else
				{
					System.out.println("Element Found");
					return true;
				}
			}
		};
		
		//Step-3 : use wait object to exeute the wait logic
		
		wait.until(fun);
		
		
		String text1 = driver.findElement(By.id("demo")).getText();
		String text2 = driver.findElement(By.id("demo2")).getText();
		
		System.out.println(text1);
		System.out.println(text2);
		
		driver.quit();
		
	}

}

package com.synechron.selenium.SeleniumTraining.utils;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;

public class DriverUtils {
	public WebDriver driver = null;

	public WebDriver getDriver() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		return driver;

	}

	public WebDriver getDriver(String type) {
		switch (type) {
		case "chrome": {

			driver = new ChromeDriver();
			break;
		}

		case "ff": {

			driver = new FirefoxDriver();
			break;
		}

		case "edge": {

			driver = new EdgeDriver();
			break;
		}

		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		return driver;

	}
	
	
	public void fluentWaitforVisibility(WebElement ele)
	{
		System.out.println("Waiting, Fluent wait for the visibility of element!!!");
		//Step-1 : Create a Fluent wait object and specify the  
				//1. Web Element 
				//2. max timeout
				//3. polling time
				//4. Can i allowed to ignore exception 
				FluentWait<WebElement> wait = new FluentWait<WebElement>(ele)
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
	}
	
	
	public void fluentWaitforVisibility(int pollingTime, int maxTimout, WebElement ele)
	{
		System.out.println("Waiting, Fluent wait for the visibility of element!!!");
		//Step-1 : Create a Fluent wait object and specify the  
				//1. Web Element 
				//2. max timeout
				//3. polling time
				//4. Can i allowed to ignore exception 
				FluentWait<WebElement> wait = new FluentWait<WebElement>(ele)
						.pollingEvery(Duration.ofMillis(pollingTime))
						.withTimeout(Duration.ofSeconds(maxTimout))
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
	}

}

package com.synechron.selenium.SeleniumTraining.suggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoSuggestions {

	
	@Test
	public void printSuggestions() throws InterruptedException
	{
		System.out.println("Welcome to selenium Automation");

		WebDriver driver = null;
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Synechron");
		
//		Thread.sleep(5000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));		
		
		for (WebElement suggestion : suggestions) 
		{
			System.out.println(suggestion.getText());
			
		}
		
		driver.quit();
	}
}

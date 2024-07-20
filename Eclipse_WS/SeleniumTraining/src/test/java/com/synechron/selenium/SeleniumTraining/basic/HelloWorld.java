package com.synechron.selenium.SeleniumTraining.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld 
{
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Welcome to selenium Automation");

		WebDriver driver = null;
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Synechron");
		Thread.sleep(5000);
		driver.quit();
	}

}

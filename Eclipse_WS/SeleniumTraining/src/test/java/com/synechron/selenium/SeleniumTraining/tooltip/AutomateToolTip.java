package com.synechron.selenium.SeleniumTraining.tooltip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.service.DriverCommandExecutor;
import org.testng.annotations.Test;

import com.synechron.selenium.SeleniumTraining.utils.DriverUtils;

public class AutomateToolTip extends DriverUtils
{
	
	@Test
	public void toolTipGoogle() throws InterruptedException
	{
		driver = getDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		WebElement searchByVoice = driver.findElement(By.xpath("//div[@jsname='R5mgy']"));
		WebElement dottedIcon = driver.findElement(By.xpath("//a[contains(@href,'products')]"));
		
		System.out.println("Tool tip " + searchByVoice.getAttribute("aria-label"));
		
		
		System.out.println("Tool tip " + dottedIcon.getAttribute("aria-label"));
	
	
		driver.quit();
	}
}

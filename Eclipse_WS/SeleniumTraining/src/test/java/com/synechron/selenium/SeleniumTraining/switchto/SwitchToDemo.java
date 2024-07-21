package com.synechron.selenium.SeleniumTraining.switchto;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.synechron.selenium.SeleniumTraining.utils.DriverUtils;

public class SwitchToDemo extends DriverUtils
{
	
	
	@Test(priority = 1)
	public void alertHandling()
	{
		driver = getDriver();
		driver.get("https://formy-project.herokuapp.com/switch-window");
		
		driver.findElement(By.id("alert-button")).click();
		
		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().sendKeys("type");
		driver.switchTo().alert().accept();
		
		
	}
	
	
	@Test(priority = 2)
	public void multipleBrowserHandling()
	{
		
		driver.findElement(By.id("new-tab-button")).click();
		
		Set<String> windowIds = driver.getWindowHandles();
		
		Iterator<String> it = windowIds.iterator();
		String parentID = it.next();
		String childID = it.next();
		
		driver.switchTo().window(childID);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Child browser links : ");
		for (WebElement link : links) {
			if(link.getText().length()>0)
				System.out.println(link.getText());
		}
		
		driver.close();
		
		driver.switchTo().window(parentID);
		
		
		String parentTxt = driver.findElement(By.tagName("h1")).getText();
		System.out.println("Parent browser text : " +  parentTxt);
		
		driver.quit();
		
	}
	
	
	@Test(priority = 3)
	public void frameHandling()
	{
		driver = getDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'default')]")));
		
		WebElement srcEle = driver.findElement(By.id("draggable"));
		WebElement destEle = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(srcEle,destEle).perform();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Draggable")).click();
		
		driver.quit();
	}

}

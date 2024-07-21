package com.synechron.selenium.SeleniumTraining.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.synechron.selenium.SeleniumTraining.utils.DriverUtils;

public class ActionsDemo extends DriverUtils
{

	
	@Test
	public void mouseMoveDemo() throws InterruptedException
	{

		driver = getDriver();
		driver.get("https://www.flipkart.com/goat-sale-is-live-store");
		
		Actions act = new Actions(driver);
		WebElement menSection = driver.findElement(By.xpath("//span[text()='Men']"));
		WebElement womenSection = driver.findElement(By.xpath("//span[text()='Women']"));
		WebElement homeAndFur = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));

		act.moveToElement(menSection).perform();
		Thread.sleep(3000);
		act.moveToElement(womenSection).perform();
		Thread.sleep(3000);
		act.moveToElement(homeAndFur).perform();
		Thread.sleep(3000);
		
	}
	
	
	@Test
	public void keyBoardAction() throws InterruptedException
	{
		driver = getDriver();
		driver.get("https://www.flipkart.com/goat-sale-is-live-store");
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(3000);
		act.sendKeys("ABCD").perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER).perform();
		
		
		
	}
	
	@Test
	public void dragAndDrop() {
		driver = getDriver();
		driver.get("https://formy-project.herokuapp.com/dragdrop");
		
		Actions act = new Actions(driver);
		WebElement dropingEle = driver.findElement(By.id("box"));
		
		System.out.println("Before Drag and Drop " + dropingEle.getText());
		
		act.dragAndDrop(driver.findElement(By.id("image")), dropingEle).perform();
	
		System.out.println("After Drag and Drop " + dropingEle.getText());
		
	}
	
	@Test
	public void misellanious() {
		
		driver = getDriver();
		driver.get("https://formy-project.herokuapp.com/dragdrop");
		
		Actions act = new Actions(driver);
//		act.doubleClick();
//		act.doubleClick(null);
//		act.contextClick();
//		act.contextClick(null);
		act.clickAndHold(driver.findElement(By.id("image"))).perform();
		act.release(driver.findElement(By.id("box"))).perform();
	}
	
	
	
}

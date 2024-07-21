package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.synechron.selenium.SeleniumTraining.utils.DriverUtils;

import page.DragAndDropPage;
import page.DropDownPage;
import page.FormyHomePage;

public class DragAndDrop extends DriverUtils 
{

	FormyHomePage fp = null;
	DragAndDropPage ddp = null;
	DropDownPage dp = null;
	
	
	@BeforeTest
	public void initPages() {
		driver = getDriver();
		fp = new FormyHomePage(driver);
		ddp = new DragAndDropPage(driver);
		dp = new DropDownPage(driver);
	}
	
	
	
	@AfterTest
	public void cleanUp() {
		driver.close();
		fp = null;
		ddp =null;
		dp = null;
	}
	
	
	@BeforeMethod
	public void launchApp()
	{
		driver.get("https://formy-project.herokuapp.com/");
	}
	
	@Test
	public void dragAndDropDemo()
	{
		fp.clickOnDragAndDrop();
		ddp.dragAndDrop();
		
	}
	
	@Test
	public void dropDown()
	{
		fp.clickOnDropDown();
		dp.clickOnMenu();
		
	}
	
	
	
	
	
	
	
	
}

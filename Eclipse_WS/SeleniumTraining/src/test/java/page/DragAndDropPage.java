package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragAndDropPage 
{
	WebDriver driver;
	
	@FindBy(id = "image")
	WebElement srcElement;
	
	@FindBy(id = "box")
	WebElement destEle;

	
	public void dragAndDrop()
	{
		Actions act = new Actions(driver);
		act.dragAndDrop(srcElement, destEle).perform();
	}
	
	
	public DragAndDropPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}

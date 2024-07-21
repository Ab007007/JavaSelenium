package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormyHomePage {

	
	@FindBy(linkText = "Drag and Drop")
	WebElement dragAndDrop;
	
	
	@FindBy(linkText = "Dropdown")
	WebElement dropDown;
	
	
	public void clickOnDragAndDrop()
	{
		dragAndDrop.click();
	}
	
	
	public void clickOnDropDown()
	{
		dropDown.click();
	}
	
	public FormyHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}

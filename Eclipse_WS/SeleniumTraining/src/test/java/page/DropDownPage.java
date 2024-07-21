package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropDownPage {
	
	
	@FindBy(id = "dropdownMenuButton")
	WebElement menu;

	
	public void clickOnMenu()
	{
		
		menu.click();
	}
	
	
	public DropDownPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}

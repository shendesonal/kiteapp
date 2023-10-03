package PomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage {
	@FindBy (xpath = "//a[@class='inline-image-text']")
	private WebElement viewHistoryButton;
	
	
	public OrderPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void viewTheHistoryOfOurTrading() {
		viewHistoryButton.click();
	}

}

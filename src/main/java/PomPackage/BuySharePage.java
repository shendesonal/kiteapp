package PomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuySharePage {
	@FindBy (xpath = "(//input[@type='number'])[1]")
	private WebElement noOfShares;
	@FindBy (xpath = "(//input[@type='number'])[2]")
	private WebElement limitValue;
	
	public BuySharePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendQuantityField() {
		noOfShares.sendKeys("10");
	}
	public void PriceLimitValueField() {
		limitValue.clear();
	}
	
	public void sendTheNewLimitValue() {
		limitValue.sendKeys("11.73");
	}
	public void clearTheLimitFieldFirst() {
		limitValue.clear();
	}
}




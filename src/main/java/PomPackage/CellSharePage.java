package PomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellSharePage {

	@FindBy (xpath = "//button[@type='submit']")
	private WebElement cellButton;
	
	
	public CellSharePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOncellButton() {
		cellButton.click();
	}
	
}

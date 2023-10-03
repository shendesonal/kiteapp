package PomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPasswordPage {
	@FindBy (xpath = "//input[@label='Password']")
	private WebElement loginPassword;
	@FindBy (xpath = "//button[@type='submit']")
	private WebElement continueButton;
	
	public LoginPasswordPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void sendLoginPin(String pin) {
		loginPassword.sendKeys(pin);
	}
	public void selectContinueButton() {
		continueButton.click();
	}

}

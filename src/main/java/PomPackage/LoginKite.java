package PomPackage;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackageKite.BaseKiteClass;

public class LoginKite extends BaseKiteClass  {
	
	public LoginKite() throws IOException {
		super();
		
	}
	@FindBy (xpath = "//input[@id='userid']")
	private WebElement userName;
	
	@FindBy (xpath = "//input[@id='password']")
	private WebElement password;
	
	@FindBy (xpath = "//button[@type='submit']")
	private WebElement loginbutton;
	
	
	public void  LoginKitepage() {
		PageFactory.initElements(driver, this);
		
	}

	public HomePageKite login(String user,String pass, WebDriver WebDriver) throws IOException {
		userName.sendKeys("user");
		password.sendKeys("pass");
		loginbutton.click();
		return new HomePageKite();
	}
      
	public void sendUsername(String user) {
		userName.sendKeys("NT0923");
	}
	public void sendPassword(String pass) {
		password.sendKeys("Amol@1993");
	}
	public void clickOnLoginButton() {
		loginbutton.click();
	}
}

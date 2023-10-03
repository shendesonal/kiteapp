package PomPackage;


import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackageKite.BaseKiteClass;

public class HomePageKite extends BaseKiteClass{
	
	@FindBy (xpath = "//input[@type='text']")
	private WebElement searchBox;
	
	@FindBy (xpath = "(//span[text()='VODAFONES'])[1]")
	private WebElement vodafone;
	
	@FindBy (xpath = "(//li[@class='item'])[6]")
	private WebElement wishlist1thnumber;
	
	@FindBy (xpath = "//button[@class='button-blue buy']")
	private WebElement buyButton;
	
	@FindBy (xpath = "(//button[@type='button'])[2]")
	private WebElement sellButton;
	
	@FindBy (xpath = "//span[text()='EH6261']")
	private WebElement accoundIdButton;
	
	@FindBy (xpath = "//a[@target='_self']")
	private WebElement logoutButton;
	
public HomePageKite() throws IOException {
		
		PageFactory.initElements(driver, this);
	}
	
	
	//public HomePageKite() {
		//searchBox.sendKeys("vodafone");
		//vodafone.click();
		//wishlist1thnumber.click();
		//vodafone.click();
		//buyButton.click();
		//sellButton.click();
	//}//

	

	public void sendCVodafoneShare() {
		searchBox.sendKeys("vodafone");
	}
	public void clickOnShare() {
		vodafone.click();
	}
	public void clickOn7ThWishlist() {
		wishlist1thnumber.click();
	}
	public void againOnceClickOnShare() {
		vodafone.click();
	}
	public void buyTheShare() {
		buyButton.click();
	}
	public void sellTheShare() {
		sellButton.click();
	}
	
	public void clickOnAccountIdButton()
	{
		accoundIdButton.click();
	}
	public void clickOnLogOutButton()
	{
		logoutButton.click();
	}

}

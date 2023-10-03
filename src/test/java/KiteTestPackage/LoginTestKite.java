package KiteTestPackage;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BasePackageKite.BaseKiteClass;
import PomPackage.HomePageKite;
import PomPackage.LoginKite;

public class LoginTestKite extends BaseKiteClass{
	LoginKite loginKite;
	HomePageKite  homePageKite ;
	
	public LoginTestKite() throws IOException {
		super();
		}

    @BeforeMethod
public void setup() throws IOException {
	initilization();
	loginKite=new LoginKite ();
	}
	
@Test
public void loginApp() throws IOException{
	homePageKite=loginKite.login(prop.getProperty("userName"),prop.getProperty("password"),driver);
	
}
	@AfterMethod
	public void tearDown()
	{
		driver.close();	
	}
	
	}
	

	



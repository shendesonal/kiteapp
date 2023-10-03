package BasePackageKite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;



public class BaseKiteClass {
	public static WebDriver driver;
	public static Properties prop;
	
	public BaseKiteClass() throws IOException {
	     prop=new Properties();     
	     String path="C:\\Users\\sonal\\eclipse-workspace\\KiteApplication\\src\\main\\java\\Config\\PropertiesKite\\Config.properties";
	     FileInputStream fis =new FileInputStream(path);
	     prop.load(fis);
		}
		
		public static void initilization() {
			
			String BrowserName=prop.getProperty("browser");
			
			if (BrowserName.equalsIgnoreCase("chrome")) 
			{
				
				System.setProperty("webdriver.chrome.driver","C:\\Users\\sonal\\eclipse-workspace\\KiteApplication\\drivers\\chromedriver.exe");
				
				
				driver=new ChromeDriver();
				}
			
			 
			else if(BrowserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver","C:\\Users\\sonal\\eclipse-workspace\\KiteApplication\\geckodrivers\\gdriver.exe");
				driver=new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			//driver.manage().timeouts().pageLoadTimeout(.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			//driver.manage().timeouts().implicitlyWait(.IMPLICIT_WAIT, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
			
	
	
	
	
	}
}
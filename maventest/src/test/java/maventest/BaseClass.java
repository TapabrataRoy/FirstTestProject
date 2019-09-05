package maventest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseClass {
	WebDriver driver;
	
	@BeforeMethod
	public void OpenApplication() {
		System.setProperty("webdriver.chrome.driver","D:\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();	
		driver.get("https://www.facebook.com");	
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void closeApplication() {
		driver.quit();
	}

}

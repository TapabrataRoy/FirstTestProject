package maventest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class logInTest extends BaseClass {
	//WebDriver driver;

	@Test
	public void getTitle() {
	/*System.setProperty("webdriver.chrome.driver","D:\\webdriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();	
	driver.get("https://www.facebook.com");	*/
	System.out.println(driver.getTitle());

}
}

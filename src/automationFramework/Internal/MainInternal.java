package automationFramework.Internal;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainInternal {
	public static void main(String[] args) throws InterruptedException {
		String d = "webdriver.chrome.driver";
		String exePath = "/Users/codymccarter/eclipse-workspace/Selenium/chromedriver";
		System.setProperty(d, exePath);
		
		String release = "20190612";
		String username = "john";
		String password = "test";
		//set driver
		WebDriver driver = new ChromeDriver();
		//set default wait time
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		InternalLogin.logIntoInternal(driver,release,username,password);
	}
}
package automationFramework.Admin;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import automationFramework.Admin.Payments.Payments;
import automationFramework.Admin.People.People;

public class MainAdmin {
	public static void main(String[] args) throws InterruptedException {
		String d = "webdriver.chrome.driver";
		String exePath = "/Users/codymccarter/eclipse-workspace/Selenium/chromedriver";
		System.setProperty(d, exePath);
		
		//Update to release number
		String release = "20191016";
		//Update to your login information
		String username = "john";
		String password = "test";
		//set driver
		WebDriver driver = new ChromeDriver();
		//set default wait time
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		AdminLogin.logIntoAdmin(driver,release,username,password);
		Payments.paymentsTests(driver);
		People.peopleTests(driver);
	}
}
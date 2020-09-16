package automationFramework.Portal;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import automationMaps.Portal.PortalLoginMap;

public class PortalLogin {
	public static void logIntoPortal(WebDriver driver,String release,String email,String pin) throws InterruptedException {

		//set page map
		PortalLoginMap page = new PortalLoginMap(driver);
		
		//navigate to test site
		driver.get("https://selenium10.aptx.cm/release_"+release+"/#/person/login/");
		//enter login information to proper fields
		page.setEmailTextbox(email);
		page.setPinTextbox1(pin);
		page.clickLoginButton();
		Thread.sleep(1000);
		
		//Select person to login as if multiple people are under the same account
		if(driver.getCurrentUrl().contains("https://selenium10.aptx.cm/release_"+release+"/#/person/login/")) {
			driver.findElement(By.id("person_login_resultsSection_loginPerson1")).click();
			Thread.sleep(1000);
		}
		
		Assert.assertTrue(driver.getCurrentUrl().contains("https://selenium10.aptx.cm/release_"+release+"/#/portal/home/"));
		
		System.out.println("Logged In");
	}
}

package automationFramework.Admin;

import java.util.Scanner;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import automationMaps.Internal.InternalLoginMap;

//Created on 3/21/2018 by Cody McCarter

public class AdminLogin {
	
	public static void logIntoAdmin(WebDriver driver,String release,String username,String password) throws InterruptedException {
//		String token="";

		//set page map
		InternalLoginMap page = new InternalLoginMap(driver);
		
		//navigate to test site
		driver.get("https://selenium.aptx.cm/release_"+release+"/#/admin/dashboard/client/1JKMN1DJ3OFPNMK0");
		//enter login information to proper fields
		Thread.sleep(1000);
		page.setUsername(username);
		page.setPassword(password);
		page.clickLoginButton();
		
//		Scanner reader = new Scanner(System.in);  // Reading from System.in
//		System.out.println("Enter your Authy code: ");
//		token = reader.nextLine(); // Scans the next line of the input.
//		//once finished
//		reader.close();
//		
//		page.setTokenInput(token);
//		page.clickLoginButton();
		Thread.sleep(1000);
		Assert.assertTrue(driver.getCurrentUrl().contains("https://selenium.aptx.cm/release_"+release+"/#/admin/dashboard/"));
		
		System.out.println("Logged In");
	}
}
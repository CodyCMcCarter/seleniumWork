package automationFramework.Internal;

import java.util.Scanner;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import automationMaps.Internal.InternalLoginMap;

//Created on 3/21/2018 by Cody McCarter

public class InternalLogin {
	
	public static void logIntoInternal(WebDriver driver,String release,String username,String password) throws InterruptedException {
		//get chrome driver
		String token="";

		//set page map
		InternalLoginMap page = new InternalLoginMap(driver);
		
		//navigate to test site
		driver.get("https://test.aptx.cm/release_"+release);
		//enter login information to proper fields
		page.setUsername(username);
		page.setPassword(password);
		page.clickLoginButton();
		
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter your Authy code: ");
		token = reader.nextLine(); // Scans the next line of the input.
		//once finished
		reader.close();
		
		page.setTokenInput(token);
		page.clickLoginButton();
		Thread.sleep(1000);
		Assert.assertEquals("https://test.aptx.cm/release_"+release+"/#/internal/clients/clientActive/true/", driver.getCurrentUrl());
		
		System.out.println("Logged In");
	}
}
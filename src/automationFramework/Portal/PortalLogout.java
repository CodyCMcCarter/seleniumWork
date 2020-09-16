package automationFramework.Portal;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import automationMaps.Portal.PortalLoginMap;
import automationMaps.Portal.PortalUserDropdownMap;

public class PortalLogout {
	public static void logOutOfPortal(WebDriver driver) throws InterruptedException {

		//set page map
		PortalUserDropdownMap user = new PortalUserDropdownMap(driver);
		
		user.clickPersonName();
		user.clickUserDropdownLogout();
		
		System.out.println("Logged Out");
	}
}

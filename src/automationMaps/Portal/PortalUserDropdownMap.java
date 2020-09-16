package automationMaps.Portal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PortalUserDropdownMap {
	
	protected WebDriver driver;
	
	//set driver for instance
	public PortalUserDropdownMap(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickPersonName() {
		driver.findElement(By.id("personName")).click();
	}
	
	public void clickUserDropdownSettings() {
		driver.findElement(By.id("portal_home_userDropdownSettings")).click();
	}
	
	public void clickUserDropdownLogout() {
		driver.findElement(By.id("portal_payments_userDropdownLogout")).click();
	}
}

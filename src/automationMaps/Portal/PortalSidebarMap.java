package automationMaps.Portal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PortalSidebarMap {
	
	protected WebDriver driver;
	
	//set driver for instance
	public PortalSidebarMap(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickUserMenu() {
		driver.findElement(By.id("portal_payments_userDropdown")).click();
	}
	
	//Accepts either Settings or Logout
	public void selectUserMenuOption(String option) {
		clickUserMenu();
		driver.findElement(By.id("portal_payments_userDropdown"+option)).click();
	}
	
	public void clickHomeLink() {
		driver.findElement(By.partialLinkText("Home")).click();
	}
	
	public void clickApplicationsLink() {
		driver.findElement(By.partialLinkText("Applications")).click();
	}
	
	public void clickPaymentsLink() {
		driver.findElement(By.linkText("Payments")).click();
	}
	
	public void clickMaintenanceLink() {
		driver.findElement(By.linkText("Maintenance")).click();
	}
	
	public void clickPackagesLink() {
		driver.findElement(By.linkText("Packages")).click();
	}
	
	public void clickMessagesLink() {
		driver.findElement(By.linkText("Messages")).click();
	}
	
	public void clickSettingsLink() {
		driver.findElement(By.linkText("Settings")).click();
	}
}

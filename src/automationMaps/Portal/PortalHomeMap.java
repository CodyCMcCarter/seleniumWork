package automationMaps.Portal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PortalHomeMap {
	
	protected WebDriver driver;
	
	//set driver for instance
	public PortalHomeMap(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickMakeAPaymentDropdown() {
		driver.findElement(By.id("portal_home_makePaymentQuickLinkDropdown")).click();
	}
	
	public void selectMakeAPaymentOption(String option) {
		clickMakeAPaymentDropdown();
		driver.findElement(By.id("portal_home_makePaymentQuickLinkOption"+option)).click();
	}
	
	public void clickMakeAPaymentButton() {
		driver.findElement(By.id("portal_home_makePaymentQuickLink")).click();
	}
	
	public void clickSubmitMaintenanceDropdown() {
		driver.findElement(By.id("portal_home_maintenanceRequestQuickLinkDropdown")).click();
	}
	
	public void selectSubmitMaintenanceOption(String option) {
		clickSubmitMaintenanceDropdown();
		driver.findElement(By.id("portal_home_maintenanceRequestQuickLinkOption"+option)).click();
	}
	
	public void clickSubmitMaintenanceButton() {
		driver.findElement(By.id("portal_home_maintenanceRequestQuickLink")).click();
	}
	
	public void clickContactDropdown() {
		driver.findElement(By.id("portal_home_contactQuickLinkDropdown")).click();
	}
	
	public void selectContactButton(String option) {
		clickContactDropdown();
		driver.findElement(By.id("portal_home_contactQuickLinkOption"+option)).click();
	}
	
	public void clickContactButton() {
		driver.findElement(By.id("portal_home_contactQuickLink")).click();
	}
	
	public void clickApplicationsButton() {
		driver.findElement(By.id("portal_home_homeLinkApplications")).click();
	}
	
	public void clickPaymentHistoryButton() {
		driver.findElement(By.id("portal_home_homeLinkPayments")).click();
	}
	
	public void clickScheduledPaymentsButton() {
		driver.findElement(By.id("portal_home_homeLinkScheduledPayments")).click();
	}
	
	public void clickPaymentMethodsButton() {
		driver.findElement(By.id("portal_home_homeLinkMethods")).click();
	}
	
	public void clickMaintenanceHistoryButton() {
		driver.findElement(By.id("portal_home_homeLinkMaintenance")).click();
	}
	
	public void clickMessageHistoryButton() {
		driver.findElement(By.id("portal_home_homeLinkMessages")).click();
	}
	
	public void clickMySettingsButton() {
		driver.findElement(By.id("portal_home_homeLinkProfile")).click();
	}
	
	public void clickNotificationsButton() {
		driver.findElement(By.id("portal_home_homeLinkNotifications")).click();
	}
}

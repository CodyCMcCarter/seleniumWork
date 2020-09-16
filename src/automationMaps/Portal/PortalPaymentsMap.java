package automationMaps.Portal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PortalPaymentsMap {
	protected WebDriver driver;
	
	//set driver for instance
	public PortalPaymentsMap(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickPaymentHistoryTab() {
		driver.findElement(By.id("portal_payments_paymentHistoryTab")).click();
	}
	
	public void clickScheduledPaymentsTab() {
		driver.findElement(By.id("portal_payments_scheduledPaymentsTab")).click();
	}
	
	public void clickPayMethodsTab() {
		driver.findElement(By.id("portal_payments_paymentMethodsTab")).click();
	}
	
	public void clickMakeAPaymentButton() {
		driver.findElement(By.id("portal_payments_makePaymentQuickLink")).click();
	}
	
	public void clickMakeAPaymentDropdown() {
		driver.findElement(By.id("portal_payments_makePaymentQuickLinkDropdown")).click();
	}
	
	public void selectMakeAPaymentOption(String option) {
		driver.findElement(By.id("portal_payments_makePaymentQuickLinkDropdownOption"+option)).click();
	}
	
	public void clickDeleteScheduledPaymentButton(String payment) {
		driver.findElement(By.id("portal_payments_schedulesSection_deleteScheduleButton"+payment)).click();
	}
	
	public void clickNewScheduledPaymentButton() {
		driver.findElement(By.id("portal_payments_addScheduleButton")).click();
	}
	
	public void clickNewScheduledPaymentDropdown() {
		driver.findElement(By.id("portal_payments_addScheduleDropdown")).click();
	}
	
	public void selectNewScheduledPaymentOption(String option) {
		clickNewScheduledPaymentDropdown();
		driver.findElement(By.id("portal_payments_addScheduleDropdownOption"+option)).click();
	}
	
	public void clickMakeDefaultButton(String option) {
		driver.findElement(By.id("portal_payments_methodsSection_makeDefaultMethodButton"+option)).click();
	}
	
	public void clickMethodDeleteButton(String option) {
		driver.findElement(By.id("portal_payments_methodsSection_deleteMethodButton"+option)).click();
	}
	
	public void clickAddPaymentMethodButton() {
		driver.findElement(By.id("portal_payments_addMethodButton")).click();
	}
	
	public void clickAddPaymentMethodDropdown() {
		driver.findElement(By.id("portal_payments_addMethodDropdown")).click();
	}
	
	public void selectAddPaymentOption(String option) {
		clickAddPaymentMethodDropdown();
		driver.findElement(By.id("portal_payments_addMethodDropdownOption"+option)).click();
	}
}
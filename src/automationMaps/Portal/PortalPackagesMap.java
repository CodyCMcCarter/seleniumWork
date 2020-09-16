package automationMaps.Portal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PortalPackagesMap {
protected WebDriver driver;
	
	//set driver for instance
	public PortalPackagesMap(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getPackageCarrier(String no) {
		return driver.findElement(By.id("portal_packages_carrier" + no)).getText();
	}
	
	public String getPackageCreatedOn(String no) {
		return driver.findElement(By.id("portal_packages_createdOn" + no)).getText();
	}
	
	public String getPackageStatus(String no) {
		return driver.findElement(By.id("portal_packages_status" + no)).getText();
	}
	
	public String getPackageSizeType(String no) {
		return driver.findElement(By.id("portal_packages_sizeType" + no)).getText();
	}
	
	public String getPackageReceivedBy(String no) {
		return driver.findElement(By.id("portal_packages_receivedBy" + no)).getText();
	}
	
	public void clickPackageViewImageLink(String no) {
		driver.findElement(By.id("portal_packages_imageLink" + no)).click();
	}
	
	public String getPackagesNotes(String no) {
		return driver.findElement(By.id("portal_packages_notes" + no)).getText();
	}
}

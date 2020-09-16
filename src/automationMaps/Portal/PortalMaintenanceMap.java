package automationMaps.Portal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PortalMaintenanceMap {
protected WebDriver driver;
	
	//set driver for instance
	public PortalMaintenanceMap(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getAddMaintenanceRequestButton() {
		return driver.findElement(By.id("portal_maintenances_newMaintenanceRequestBtn"));
	}
	
	public void clickAddMaintenanceRequestButton() {
		getAddMaintenanceRequestButton().click();
	}
	
	public WebElement getCloseMaintenanceRequestButton() {
		return driver.findElement(By.id("js-close-maintenance"));
	}
	
	public void clickCloseMaintenanceRequestButton() {
		getCloseMaintenanceRequestButton().click();
	}
	
	public Select getMaintenanceTypeSelect() {
		Select dropdown = new Select(driver.findElement(By.id("method-select")));
		return dropdown;
	}
	
	public void setMaintenanceTypeSelect(String option) {
		getMaintenanceTypeSelect().selectByVisibleText(option);
	}
	
	public Select getMaintenanceLocationSelect() {
		Select dropdown = new Select(driver.findElement(By.name("locationType")));
		return dropdown;
	}
	
	public void setMaintenanceLocationSelect(String location) {
		getMaintenanceLocationSelect().selectByVisibleText(location);
	}
	
	public WebElement getMaintenancePhoneTextbox() {
		return driver.findElement(By.name("maintenancePhone"));
	}
	
	public void setMaintenancePhoneTextbox(String phone) {
		getMaintenancePhoneTextbox().sendKeys(phone);
	}
	
	public WebElement getMaintenanceDescriptionTextbox() {
		return driver.findElement(By.name("description"));
	}
	
	public void setMaintenanceDescriptionTextbox(String desc) {
		getMaintenanceDescriptionTextbox().sendKeys(desc);
	}
	
	public WebElement getMaintenanceEnterYes() {
		return driver.findElement(By.id("portal_maintenances_maintenanceRequestPane_enterRadioYes"));
	}
	
	public WebElement getMaintenanceEnterNo() {
		return driver.findElement(By.id("portal_maintenances_maintenanceRequestPane_enterRadioNo"));
	}
	
	public void setMaintenanceEnterRadio(Boolean enter) {
		if(enter) {
			getMaintenanceEnterYes().click();
		}
		else {
			getMaintenanceEnterNo().click();
		}
	}
	
	public WebElement getMaintenancePetsYes() {
		return driver.findElement(By.id("portal_maintenances_maintenanceRequestPane_petsRadioYes"));
	}
	
	public WebElement getMaintenancePetsNo() {
		return driver.findElement(By.id("portal_maintenances_maintenanceRequestPane_petsRadioNo"));
	}
	
	public void setMaintenancePetsRadio(Boolean pets) {
		if(pets) {
			getMaintenancePetsYes().click();
		}
		else {
			getMaintenancePetsNo().click();
		}
	}
	
	public WebElement getMaintenancePhotoButton() {
		return driver.findElement(By.name("photo"));
	}
	
	public void clickMaintenancePhotoButton() {
		getMaintenancePhotoButton().click();
	}
	
	public WebElement getMaintenanceSubmitButton() {
		return driver.findElement(By.id("portal_maintenances_maintenanceRequestPane_submitMaintenanceBtn"));
	}
	
	public void clickMaintenanceSubmitButton() {
		getMaintenanceSubmitButton().click();
	}
	
	public WebElement getMaintenanceReturnButton() {
		return driver.findElement(By.partialLinkText("BACK TO PROFILE"));
	}
	
	public void clickMaintenanceReturnButton() {
		getMaintenanceReturnButton().click();
	}
}

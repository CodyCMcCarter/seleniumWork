package automationMaps.Admin.Payments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateGuestPaymentMap {

	protected WebDriver driver;
	
	public CreateGuestPaymentMap(WebDriver driver) {
		this.driver = driver;
	}
	
	public Select getPropertyDropdown() {
		Select dropdown = new Select(driver.findElement(By.id("admin_create_guest_accountSelectorContainer_lazyLoadSelect")));
		return dropdown;
	}
	
	public void setPropertyDropdown(String property) {
		getPropertyDropdown().selectByVisibleText(property);
	}
	
	public Select getTargetDropdown() {
		Select dropdown = new Select(driver.findElement(By.name("target")));
		return dropdown;
	}
	
	public void setTargetDropdown(String target) {
		getTargetDropdown().selectByVisibleText(target);
	}
	
	public WebElement getPaymentAmountTextbox() {
		return driver.findElement(By.name("amount"));
	}
	
	public void setPaymentAmountTextbox(String amount) {
		getPaymentAmountTextbox().sendKeys(amount);
	}
	
	public WebElement getUnitTextbox() {
		return driver.findElement(By.name("accountNumber"));
	}
	
	public void setUnitTextbox(String unit) {
		getUnitTextbox().sendKeys(unit);
	}
	
	public void clickPaymentButton() {
		driver.findElement(By.cssSelector(".button[data-submit-group='createGuest']")).click();
	}
	
	public WebElement getMessageTextarea() {
		return driver.findElement(By.name("message"));
	}
	
	public void setMessageTextarea(String message) {
		getMessageTextarea().sendKeys(message);
	}
	
	public Select getDeliveryTypeDropdown() {
		Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"page\"]/div[2]/div/select")));
		return dropdown;
	}
	
	public void setDeliveryTypeDropdown(String type) {
		getDeliveryTypeDropdown().selectByVisibleText(type);
	}
	
	public WebElement getEmailTextbox() {
		return driver.findElement(By.name("email"));
	}
	
	public void setEmailTextbox(String email) {
		getEmailTextbox().sendKeys(email);
	}
	
	public WebElement getPhoneTextbox() {
		return driver.findElement(By.name("phone"));
	}
	
	public void setPhoneTextbox(String phone) {
		getPhoneTextbox().sendKeys(phone);
	}
	
	public void clickPaymentLinkButton() {
		driver.findElement(By.cssSelector(".button[data-submit-group='sendGuest']")).click();
	}
	
	//Making Guest Payment
	public WebElement getGuestNameTextbox() {
		return driver.findElement(By.name("name"));
	}
	
	public void setGuestNameTextbox(String name) {
		getGuestNameTextbox().sendKeys(name);
	}
	
	public WebElement getGuestEmailTextbox() {
		return driver.findElement(By.name("email"));
	}
	
	public void setGuestEmailTextbox(String email) {
		getGuestEmailTextbox().sendKeys(email);
	}
	
	public WebElement getGuestAccountNumberTextbox() {
		return driver.findElement(By.name("accountNumber"));
	}
	
	public void setGuestAccountNumberTextbox(String acctnum) {
		getGuestAccountNumberTextbox().sendKeys(acctnum);
	}
}
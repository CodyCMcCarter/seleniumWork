package automationMaps.Portal.Payments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PortalAddPaymentMethodMap {
	protected WebDriver driver;
	
	//set driver for instance
	public PortalAddPaymentMethodMap(WebDriver driver) {
		this.driver = driver;
	}
	
	public Select getMethodTypeDropdown() {
		Select dropdown = new Select(driver.findElement(By.id("vault_add_method_methodSection_methodTypeSelect")));
		return dropdown;
	}
	
	public void setMethodTypeDropdown(String option) {
		getMethodTypeDropdown().selectByVisibleText(option);
	}
	
	public WebElement getHolderNameTextbox() {
		return driver.findElement(By.name("name"));
	}
	
	public void setHolderNameTextbox(String name) {
		getHolderNameTextbox().sendKeys(name);
	}
	
	//Card fields
	public WebElement getCardNumberTextbox() {
		return driver.findElement(By.name("number"));
	}
	
	public void setCardNumberTextbox(String number) {
		getCardNumberTextbox().sendKeys(number);
	}
	
	public WebElement getExpDateTextbox() {
		return driver.findElement(By.name("expiresOn"));
	}
	
	public void setExpDateTextbox(String month, String year) throws InterruptedException {
		getExpDateTextbox().click();
		Thread.sleep(1000);
		getExpDateTextbox().sendKeys(month);
		Thread.sleep(1000);
		getExpDateTextbox().sendKeys(year);
	}
	
	public WebElement getZipCodeTextbox() {
		return driver.findElement(By.name("zip"));
	}
	
	public void setZipCodeTextbox(String zip) {
		getZipCodeTextbox().sendKeys(zip);
	}
	
	public void clickSaveCardButton() {
		driver.findElement(By.id("vault_add_method_saveCardButton")).click();
	}
	
	//Bank fields
	public WebElement getRoutingNumberTextbox() {
		return driver.findElement(By.name("routing"));
	}
	
	public void setRoutingNumberTextbox(String routing) {
		getRoutingNumberTextbox().sendKeys(routing);
	}
	
	public WebElement getBankNumberTextbox() {
		return driver.findElement(By.id("js-bank-account"));
	}
	
	public void setBankNumberTextbox(String bank) {
		getBankNumberTextbox().sendKeys(bank);
	}
	
	public WebElement getConfirmBankTextbox() {
		return driver.findElement(By.name("numberConfirm"));
	}
	
	public void setConfirmBankTextbox(String bank) {
		getConfirmBankTextbox().sendKeys(bank);
	}
	
	public Select getAccountTypeDropdown() {
		Select dropdown = new Select(driver.findElement(By.id("vault_add_method_methodSection_methodTypeSelect")));
		return dropdown;
	}
	
	public void setAccountTypeDropdown(String option) {
		getAccountTypeDropdown().selectByVisibleText(option);
	}
	
	public void clickSaveBankButton() {
		driver.findElement(By.id("vault_add_method_saveBankButton")).click();
	}
	
	public void clickBackButton() {
		driver.findElement(By.id("vault_add_method_backButton")).click();
	}
	
	public void clickConfirmDupButton() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.className("sa-confirm-button-container")).click();
	}
}

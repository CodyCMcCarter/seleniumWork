package automationMaps.Portal.Payments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PortalMakePaymentMap {
	protected WebDriver driver;
	
	//set driver for instance
	public PortalMakePaymentMap(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getPaymentAmountTextbox() {
		return driver.findElement(By.id("portal_payment_paymentAmount"));
	}
	
	public void setPaymentAmountTextbox(String amount) {
		getPaymentAmountTextbox().clear();
		getPaymentAmountTextbox().sendKeys(amount);
	}
	
	public WebElement getCvvTextbox(String card) {
		return driver.findElement(By.id("portal_payment_cvvInput"+card));
	}
	
	public void setCvvTextbox(String card, String cvv) {
		getCvvTextbox(card).sendKeys(cvv);
	}
	
	public void clickFirstNewPaymentMethodButton() {
		driver.findElement(By.id("portal_payment_addFirstMethodButton")).click();
	}
	
	public void clickNewPaymentMethodButton() {
		driver.findElement(By.id("portal_payment_addMethodButton")).click();
	}
	
	public WebElement getPaymentMemoTextbox() {
		return driver.findElement(By.id("portal_payment_memoInput"));
	}
	
	public void setPaymentMemoTextbox(String memo) {
		getPaymentMemoTextbox().sendKeys(memo);
	}
	
	public void clickReviewPaymentButton() {
		driver.findElement(By.id("portal_payment_reviewPaymentButton")).click();
	}
	
	public void clickCancelButton() {
		driver.findElement(By.id("portal_payment_cancelButton")).click();
	}
	
	public String getConfirmMethodText() {
		return driver.findElement(By.id("portal_payment_confirmMethodText")).getText();
	}
	
	public String getConfirmMemoText() {
		return driver.findElement(By.id("portal_payment_confirmMemoText")).getText();
	}
	
	public void clickCloseConfirmPaneButton() {
		driver.findElement(By.id("portal_payment_closeConfirmPane")).click();
	}
	
	public void clickConfirmPaymentButton() {
		driver.findElement(By.id("portal_payment_confirmButton")).click();
	}
	
	public void clickMyPortalButton() {
		driver.findElement(By.id("portal_receipt_myPortalLink")).click();
	}
	
	public void clickMyPaymentHistoryButton() {
		driver.findElement(By.id("portal_receipt_paymentHistoryLink")).click();
	}
	
	public Select getFrequencyTypeDropdown() {
		Select dropdown = new Select(driver.findElement(By.id("portal_receipt_frequencyTypeSelect")));
		return dropdown;
	}
	
	public void selectFrequencyTypeDropdown(String option) {
		getFrequencyTypeDropdown().selectByVisibleText(option);
	}
	
	public Select getDayToPayOnDropdown() {
		Select dropdown = new Select(driver.findElement(By.id("portal_receipt_payOnDaySelect")));
		return dropdown;
	}
	
	public void selectDayToPayOnDropdown(String option) {
		getDayToPayOnDropdown().selectByVisibleText(option);
	}
	
	public void clickNoEndRadioButton() {
		driver.findElement(By.id("portal_receipt_noEndRadio")).click();
	}
	
	public void clickEndOnRadioButton() {
		driver.findElement(By.id("portal_receipt_endOnRadio")).click();
	}
	
	public void clickScheduleThisPaymentButton() {
		driver.findElement(By.id("portal_receipt_addScheduleButton")).click();
	}
}

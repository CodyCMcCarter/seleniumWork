package automationMaps.Admin.Payments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CheckScanningMap {

	protected WebDriver driver;
	
	public CheckScanningMap(WebDriver driver) {
		this.driver = driver;
	}

	public Select getSelectBatchDropdown() {
		Select dropdown = new Select(driver.findElement(By.id("admin_scan_scanBatchesSelect_scanBatchesSelect")));
		return dropdown;
	}
	
	public void setSelectBatchDropdown(int option) {
		getSelectBatchDropdown().selectByIndex(option);
	}
	
	public void clickDemoCheckButton() {
		driver.findElement(By.id("admin_scan_demoCheckButton")).click();
	}
	
	public void clickDeleteBatchButton() {
		driver.findElement(By.id("admin_scan_deleteBatchButton")).click();
	}
	
	public void clickNewBatchButton() {
		driver.findElement(By.id("admin_scan_createBatchButton")).click();
	}
	
	public void clickConfirmBatchButton() {
		driver.findElement(By.id("admin_scan_confirmBatchButton")).click();
	}
	
//	public void clickScanCheckButton() {
//		driver.findElement(By.cssSelector(".button[data-field='scanButton']")).click();
//	}
	
	public void clickDeleteScanButton(String num) {
		driver.findElement(By.id("admin_scan_deleteScanButton"+num)).click();
	}
	
	public void clickViewEditScanButton(String num) {
		driver.findElement(By.id("admin_scan_viewEditButton"+num)).click();
	}
	
	//View/Edit page
	
	public WebElement getCheckNoTextbox() {
		return driver.findElement(By.id("admin_assignScan_checkNumberInput"));
	}
	
	public void setCheckNoTextbox(String checkNo) {
		getCheckNoTextbox().sendKeys(checkNo);
	}
	
	public WebElement getCheckAmountTextbox() {
		return driver.findElement(By.id("admin_assignScan_checkAmountInput"));
	}
	
	public void setCheckAmountTextbox(String checkAmount) {
		getCheckAmountTextbox().sendKeys(checkAmount);
	}
	
	public Select getScanTypeDropdown() {
		Select dropdown = new Select(driver.findElement(By.name("type")));
		return dropdown;
	}
	
	public void setScanTypeDropdown(String option) {
		getScanTypeDropdown().selectByVisibleText(option);
	}
	
	public WebElement getMemoTextbox() {
		return driver.findElement(By.id("admin_assignScan_memoInput"));
	}
	
	public void setMemoTextbox(String memo) {
		getMemoTextbox().sendKeys(memo);
	}
	
	public void clickPersonRemoveButton() {
		driver.findElement(By.id("admin_assignScan_assignedPersonsSection_deleteAssignedPersonButton")).click();
	}
	
	public WebElement getPersonAmountTextbox() {
		return driver.findElement(By.name("amount"));
	}
	
	public void setPersonAmountTextbox(String amount) {
		getPersonAmountTextbox().sendKeys(amount);
	}
	
	public Select getPropertyDropdown() {
		Select dropdown = new Select(driver.findElement(By.id("admin_assignScan_accountSelect")));
		return dropdown;
	}
	
	public void setPropertyDropdown(String property) {
		getPropertyDropdown().selectByVisibleText(property);
	}
	
	public Select getTypeDropdown() {
		Select dropdown = new Select(driver.findElement(By.id("admin_assignScan_accountTargetSelect")));
		return dropdown;
	}
	
	public void setTypeDropdown(String type) {
		getTypeDropdown().selectByVisibleText(type);
	}
	
	public void clickAssignPersonButton() {
		driver.findElement(By.id("admin_assignScan_assignPersonButton")).click();
	}
	
	public void clickCreateNewPersonButton() {
		driver.findElement(By.cssSelector(".button[data-field='createPerson']")).click();
	}
	
	public void clickSubmitButton() {
		driver.findElement(By.cssSelector(".button[data-field='scanSubmitButton']")).click();
	}
	
	public void clickUpdateButton() {
		driver.findElement(By.id("admin_assignScan_scanSubmitButton")).click();
	}
	
	public void clickRepairCheckButton() {
		driver.findElement(By.id("admin_assignScan_repairScanButton")).click();
	}
	
	public void clickDeleteCheckButton() {
		driver.findElement(By.id("admin_assignScan_deleteScanButton")).click();
	}
	
	//Add Person
	public WebElement getNewEmailTextbox() {
		return driver.findElement(By.name("email"));
	}
	
	public void setNewEmailTextbox(String email) {
		getNewEmailTextbox().sendKeys(email);
	}
	
	public WebElement getNewFirstNameTextbox() {
		return driver.findElement(By.name("firstName"));
	}
	
	public void setNewFirstNameTextbox(String first) {
		getNewFirstNameTextbox().sendKeys(first);
	}
	
	public WebElement getNewLastNameTextbox() {
		return driver.findElement(By.name("lastName"));
	}
	
	public void setNewLastNameTextbox(String last) {
		getNewLastNameTextbox().sendKeys(last);
	}
	
	public WebElement getNewBornOnTextbox() {
		return driver.findElement(By.name("bornOn"));
	}
	
	public void setNewBornOnTextbox(String born) {
		getNewBornOnTextbox().sendKeys(born);
	}
	
	public WebElement getNewPhoneTextbox() {
		return driver.findElement(By.name("phone"));
	}
	
	public void setNewPhoneTextbox(String phone) {
		getNewPhoneTextbox().sendKeys(phone);
	}
	
	public WebElement getNewUnitTextbox() {
		return driver.findElement(By.name("accountNumber"));
	}
	
	public void setNewUnitTextbox(String unit) {
		getNewUnitTextbox().sendKeys(unit);
	}
	
	public void clickNewSavePersonButton() {
		
	}
	
	//Assign Person
	public WebElement getAssignNameTextbox() {
		return driver.findElement(By.name("personName"));
	}
	
	public void setAssignNameTextbox(String name) {
		getAssignNameTextbox().sendKeys(name);
	}
	
	public WebElement getAssignUnitTextbox() {
		return driver.findElement(By.name("unitNumber"));
	}
	
	public void setAssignUnitTextbox(String unit) {
		getAssignUnitTextbox().sendKeys(unit);
	}
	
//	public WebElement getAssignCodeTextbox() {
//		
//	}
	
	public void setAssignCodeTextbox(String code) {
		
	}
	
	public void clickSearchButton() {
		
	}
	
	public void clickResetFiltersButton() {
		
	}
}

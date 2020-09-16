package automationMaps.Admin.Payments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentsMap {
	
	protected WebDriver driver;
	
	//set driver for instance
	public PaymentsMap(WebDriver driver) {
		this.driver = driver;
	}
	
	//Options under Payments
	public void clickTransactions() {
		driver.findElement(By.linkText("Transactions")).click();;
	}
			
	public void clickTransactionsCalendar() {
		driver.findElement(By.linkText("Transactions Calendar")).click();;
	}
	
	public void clickDeposits() {
		driver.findElement(By.linkText("Deposits")).click();;
	}
	
	public void clickDepositsCalendar() {
		driver.findElement(By.linkText("Deposits Calendar")).click();;
	}

	public void clickCheckScanning() {
		driver.findElement(By.linkText("Check Scanning")).click();;
	}

	public void clickCheckBatches() {
		driver.findElement(By.linkText("Check Batches")).click();;
	}

	public void clickSkipBank() {
		driver.findElement(By.linkText("Skip Bank")).click();;
	}
	
	public void clickExports() {
		driver.findElement(By.linkText("Exports")).click();;
	}

	public void clickScheduledPay() {
		driver.findElement(By.linkText("Scheduled Pay")).click();;
	}

	public void clickComparePayments() {
		driver.findElement(By.linkText("Compare Payments")).click();;
	}
	
	public void clickCreateGuestPayment() {
		driver.findElement(By.linkText("Create Guest Payment")).click();;
	}
}

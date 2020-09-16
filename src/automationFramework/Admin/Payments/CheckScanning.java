package automationFramework.Admin.Payments;

import org.openqa.selenium.WebDriver;

import automationMaps.Admin.AdminSidebarMap;
import automationMaps.Admin.Payments.CheckScanningMap;
import automationMaps.Admin.Payments.PaymentsMap;

public class CheckScanning {
	protected WebDriver driver;

	public CheckScanning(WebDriver driver) {
		this.driver = driver;
	}

	public void checkScanningTests() throws InterruptedException {
		CheckScanningMap scanning = new CheckScanningMap(driver);
		PaymentsMap payments = new PaymentsMap(driver);
		AdminSidebarMap sidebar = new AdminSidebarMap(driver);

//		sidebar.clickPayments();
		payments.clickCheckScanning();
		Thread.sleep(1000);
		
		scanning.setSelectBatchDropdown(1);
		Thread.sleep(1000);
		scanning.clickDemoCheckButton();
		scanning.clickDemoCheckButton();
		Thread.sleep(5000);
		scanning.clickViewEditScanButton("1");
	}
}

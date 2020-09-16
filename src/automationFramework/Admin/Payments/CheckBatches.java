package automationFramework.Admin.Payments;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import automationMaps.Admin.AdminSidebarMap;
import automationMaps.Admin.Payments.CheckBatchesMap;
import automationMaps.Admin.Payments.PaymentsMap;

public class CheckBatches {
	protected WebDriver driver;

	public CheckBatches(WebDriver driver) {
		this.driver = driver;
	}

	public void checkScanningTests() throws InterruptedException {
		CheckBatchesMap batches = new CheckBatchesMap(driver);
		PaymentsMap payments = new PaymentsMap(driver);
		AdminSidebarMap sidebar = new AdminSidebarMap(driver);

		sidebar.clickPayments();
		payments.clickCheckBatches();
		String refId = batches.getRefId();
		batches.setRefIdTextbox(refId + Keys.ENTER);
	}
}

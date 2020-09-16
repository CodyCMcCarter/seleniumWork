package automationFramework.Admin.Payments;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import automationMaps.Admin.AdminSidebarMap;
import automationMaps.Admin.Payments.DepositsCalendarMap;
import automationMaps.Admin.Payments.DepositsMap;
import automationMaps.Admin.Payments.PaymentsMap;

public class DepositsCalendar {
	protected WebDriver driver;
	
	public DepositsCalendar(WebDriver driver) {
		this.driver=driver;
	}
	
	public void depositsCalendarTest() throws InterruptedException {
		PaymentsMap payments = new PaymentsMap(driver);
		DepositsMap deposits = new DepositsMap(driver);
		DepositsCalendarMap calendar = new DepositsCalendarMap(driver);
		
		payments.clickDepositsCalendar();
		Thread.sleep(1000);
		
		//Test Bank Account filter
		calendar.clickBankAccount();
		Thread.sleep(1000);
		calendar.clickBankAccountDropdown();
		Thread.sleep(1000);
		calendar.setBankAccountSearchTextbox("Centennial Station");
		Thread.sleep(1000);
		calendar.clickResetFilters();
		Thread.sleep(1000);
		
		//Test clicking a day on the calendar
		calendar.clickDate("1");
		Thread.sleep(1000);
		assertTrue(deposits.getFromTextbox().getAttribute("value").contains("-01-"));
		assertEquals(deposits.getFromTextbox().getAttribute("value"),deposits.getToTextbox().getAttribute("value"));
	}
}

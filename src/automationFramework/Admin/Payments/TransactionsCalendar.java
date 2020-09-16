package automationFramework.Admin.Payments;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import automationMaps.Admin.AdminSidebarMap;
import automationMaps.Admin.Payments.PaymentsMap;
import automationMaps.Admin.Payments.TransactionsCalendarMap;
import automationMaps.Admin.Payments.TransactionsMap;

public class TransactionsCalendar {
	protected WebDriver driver;
	
	public TransactionsCalendar(WebDriver driver) {
		this.driver=driver;
	}
	
	public void transactionsCalendarTest() throws InterruptedException {
		TransactionsMap transactions = new TransactionsMap(driver);
		TransactionsCalendarMap calendar = new TransactionsCalendarMap(driver);
		PaymentsMap payments = new PaymentsMap(driver);
		
		payments.clickTransactionsCalendar();
		
		//Test Transactions Type filter
		calendar.setTransactionsTypeFilterDropdown("Decline");
		assertEquals("DECLINE Calendar", calendar.getCalendarLabel());
		calendar.setTransactionsTypeFilterDropdown("Void");
		assertEquals("VOID Calendar", calendar.getCalendarLabel());
		calendar.setTransactionsTypeFilterDropdown("Refund");
		assertEquals("REFUND Calendar", calendar.getCalendarLabel());
		calendar.setTransactionsTypeFilterDropdown("Reversal");
		assertEquals("REVERSAL Calendar", calendar.getCalendarLabel());
		calendar.setTransactionsTypeFilterDropdown("Payment");
		assertEquals("PAYMENT Calendar", calendar.getCalendarLabel());
		
		//Test Property Status filter
		calendar.clickPropertyStatusInactiveFilter();
		calendar.clickPropertyStatusAllFilter();
		calendar.clickPropertyStatusActiveFilter();
		
		//Test Method filter
		calendar.clickMethod();
		calendar.setMethodFilterDropdown("Credit Card");
		calendar.setMethodFilterDropdown("Debit Card");
		calendar.setMethodFilterDropdown("eChecks/ACH");
		calendar.setMethodFilterDropdown("Scanned Check");
		calendar.clickResetFilters();
		
		//Test clicking a day on the calendar
		calendar.clickDate("1");
		Thread.sleep(1000);
		assertTrue(transactions.getFromTextbox().getAttribute("value").contains("-01-"));
		assertEquals(transactions.getFromTextbox().getAttribute("value"),transactions.getToTextbox().getAttribute("value"));
	}
}

package automationFramework.Admin.People;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import automationMaps.Admin.AdminSidebarMap;
import automationMaps.Admin.Payments.PaymentsMap;
import automationMaps.Admin.Payments.TransactionsCalendarMap;
import automationMaps.Admin.Payments.TransactionsMap;

public class Residents {
	
	protected WebDriver driver;
	
	public Residents(WebDriver driver) {
		this.driver=driver;
	}
	
	public void transactionsTest() throws InterruptedException {
		AdminSidebarMap sidebar = new AdminSidebarMap(driver);
		TransactionsMap transactions = new TransactionsMap(driver);
		PaymentsMap payments = new PaymentsMap(driver);
		
		sidebar.clickPayments();
		Thread.sleep(1000);
		
		//Test Type filter
		transactions.setFromTextbox("01-01-2017");
		transactions.setToTextbox("12-31-2017");
		transactions.clickUpdateButton();
		Thread.sleep(1000);
		transactions.setTypeFilterDropdown("Decline");
		Thread.sleep(1000);
		assertEquals("Declines", transactions.getLabelText());
		Thread.sleep(1000);
		transactions.setTypeFilterDropdown("Void");
		Thread.sleep(1000);
		assertEquals("Voids", transactions.getLabelText());
		Thread.sleep(1000);
		transactions.setTypeFilterDropdown("Refund");
		Thread.sleep(1000);
		assertEquals("Refunds", transactions.getLabelText());
		Thread.sleep(1000);
		transactions.setTypeFilterDropdown("Reversal");
		Thread.sleep(1000);
		assertEquals("Reversals", transactions.getLabelText());
		Thread.sleep(1000);
		transactions.setTypeFilterDropdown("Payment");
		Thread.sleep(1000);
		assertEquals("Payments", transactions.getLabelText());
		Thread.sleep(1000);
		
		//Test Reference Number filter
		transactions.clickYearTimeFilter();
		Thread.sleep(1000);
		transactions.setYearFilterDropdown("2018");
		transactions.clickUpdateButton();
		Thread.sleep(1000);
		String refNo = transactions.getReferenceNumber();
		transactions.setReferenceNumberFilter(refNo + Keys.ENTER);
		Thread.sleep(1000);
		assertEquals("#"+refNo, driver.findElement(By.xpath("//*[@id=\"page\"]/div/div[4]/div[1]/div[1]/div/h1/span")).getText());
		payments.clickTransactions();
		Thread.sleep(1000);
		
		//Test Property Status filter
		transactions.clickPropertyStatusInactiveFilter();
		Thread.sleep(1000);
		transactions.clickPropertyStatusAllFilter();
		Thread.sleep(1000);
		transactions.clickPropertyStatusActiveFilter();
		Thread.sleep(1000);
		
		//Test Time filters
		transactions.clickMonthTimeFilter();
		Thread.sleep(1000);
		transactions.setMonthYearFilterDropdown("2018");
		transactions.setMonthFilterDropdown("Jan");
		transactions.clickUpdateButton();
		Thread.sleep(1000);
		transactions.clickQuarterTimeFilter();
		Thread.sleep(1000);
		transactions.setQuarterYearFilterDropdown("2018");
		transactions.setQuarterFilterDropdown("Q1");
		transactions.clickUpdateButton();
		Thread.sleep(1000);
		transactions.clickYearTimeFilter();
		Thread.sleep(1000);
		transactions.setYearFilterDropdown("2017");
		transactions.clickUpdateButton();
		Thread.sleep(1000);
		transactions.clickCustomTimeFilter();
		Thread.sleep(1000);
		transactions.setFromTextbox("01-01-2018");
		transactions.setToTextbox("03-31-2018");
		transactions.clickUpdateButton();
		Thread.sleep(1000);
		transactions.clickResetFilters();
		Thread.sleep(1000);
		
		//Test Method filter
		transactions.clickMethod();
		Thread.sleep(1000);
		transactions.setMethodFilterDropdown("Credit Card");
		Thread.sleep(1000);
		transactions.setMethodFilterDropdown("Debit Card");
		Thread.sleep(1000);
		transactions.setMethodFilterDropdown("eChecks/ACH");
		Thread.sleep(1000);
		transactions.clickResetFilters();
		Thread.sleep(1000);
		
		//Test Last Four filter
		transactions.clickLastFour();
		Thread.sleep(1000);
		transactions.setLastFourFilterTextbox("4747" + Keys.ENTER);
		Thread.sleep(1000);
		transactions.clickResetFilters();
		Thread.sleep(1000);
		
		//Test Check Number filter
		transactions.clickYearTimeFilter();
		Thread.sleep(1000);
		transactions.setYearFilterDropdown("2017");
		transactions.clickUpdateButton();
		Thread.sleep(1000);
		transactions.clickMethod();
		Thread.sleep(1000);
		transactions.setMethodFilterDropdown("Scanned Check");
		Thread.sleep(1000);
		transactions.clickCheckNo();
		Thread.sleep(1000);
		String checkNo = transactions.getCheckNo();
		transactions.setCheckNoFilterTextbox(checkNo + Keys.ENTER);
		Thread.sleep(1000);
		transactions.clickResetFilters();
		Thread.sleep(1000);
		
		//Test Scan Type filter
		transactions.clickScanType();
		Thread.sleep(1000);
		transactions.setScanTypeFilterDropdown("Check");
		Thread.sleep(1000);
		transactions.setScanTypeFilterDropdown("Money Order");
		Thread.sleep(1000);
		transactions.setScanTypeFilterDropdown("Cashier's Check");
		Thread.sleep(1000);
		transactions.clickResetFilters();
		Thread.sleep(1000);
		
		//Test Target filter
		transactions.clickTarget();
		Thread.sleep(1000);
		transactions.setTargetFilterDropdown("Application");
		Thread.sleep(1000);
		transactions.setTargetFilterDropdown("Deposit");
		Thread.sleep(1000);
		transactions.setTargetFilterDropdown("Non-Integrated");
		Thread.sleep(1000);
		transactions.setTargetFilterDropdown("Rent");
		Thread.sleep(1000);
		transactions.clickResetFilters();
		Thread.sleep(1000);
		
		//Test Integration filter
		transactions.clickIntegration();
		Thread.sleep(1000);
		transactions.setIntegrationFilterDropdown("Integrated");
		Thread.sleep(1000);
		transactions.setIntegrationFilterDropdown("Non-Integrated");
		Thread.sleep(1000);
		transactions.clickResetFilters();
		Thread.sleep(1000);
		
		//Test Amount filter
		transactions.clickAmount();
		Thread.sleep(1000);
		transactions.setAmountFilterDropdown("Greater than or equal");
		Thread.sleep(1000);
		transactions.setMinAmountFilterTextbox("1000" + Keys.ENTER);
		Thread.sleep(1000);
		transactions.setAmountFilterDropdown("Less than or equal");
		Thread.sleep(1000);
		transactions.setMaxAmountFilterTextbox("10" + Keys.ENTER);
		Thread.sleep(1000);
		transactions.setAmountFilterDropdown("Equal");
		Thread.sleep(1000);
		transactions.setMinAmountFilterTextbox("1" + Keys.ENTER);
		Thread.sleep(1000);
		transactions.setAmountFilterDropdown("Range");
		Thread.sleep(1000);
		transactions.setMinAmountFilterTextbox("10");
		transactions.setMaxAmountFilterTextbox("1000" + Keys.ENTER);
		Thread.sleep(1000);
		transactions.clickResetFilters();
		Thread.sleep(1000);
		
		//Test Person Name filter
		transactions.clickPersonName();
		Thread.sleep(1000);
		transactions.setPersonNameFilterTextbox("Nickolas" + Keys.ENTER);
		Thread.sleep(1000);
		transactions.clickResetFilters();
		Thread.sleep(1000);
		
		//Test Unit filter
		transactions.clickUnit();
		Thread.sleep(1000);
		transactions.setUnitFilterTextbox("001" + Keys.ENTER);
		Thread.sleep(1000);
		transactions.clickResetFilters();
		Thread.sleep(1000);
		
		//Test Memo filter
		transactions.clickMemo();
		Thread.sleep(1000);
		transactions.setMemoFilterTextbox("test" + Keys.ENTER);
		Thread.sleep(1000);
		transactions.clickResetFilters();
		Thread.sleep(1000);
		
		//Test MICR filter
	}
}

package automationFramework.Admin.Payments;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import automationMaps.Admin.AdminSidebarMap;
import automationMaps.Admin.Payments.DepositsMap;
import automationMaps.Admin.Payments.PaymentsMap;

public class Deposits {

	protected WebDriver driver;

	public Deposits(WebDriver driver) {
		this.driver = driver;
	}

	public void depositsTest() throws InterruptedException {
		DepositsMap deposits = new DepositsMap(driver);
		PaymentsMap payments = new PaymentsMap(driver);

		payments.clickDeposits();
		
		//Test Reference Number filter
		Thread.sleep(1000);
		deposits.clickMonthTimeFilter();
		Thread.sleep(1000);
		deposits.setMonthYearFilterDropdown("2018");
		deposits.setMonthFilterDropdown("Jan");
		deposits.clickUpdateButton();
		Thread.sleep(1000);
		deposits.setReferenceNumberFilter(deposits.getReferenceNumber() + Keys.ENTER);
		Thread.sleep(1000);
		payments.clickDeposits();
		
		//Test Deposits/Withdrawals filter
		deposits.clickDepositFilter();
		Thread.sleep(1000);
		deposits.clickWithdrawalFilter();
		Thread.sleep(1000);
		deposits.clickAllFilter();
		Thread.sleep(1000);
		
		//Test Time filters
		deposits.clickMonthTimeFilter();
		Thread.sleep(1000);
		deposits.setMonthYearFilterDropdown("2018");
		deposits.setMonthFilterDropdown("Jan");
		deposits.clickUpdateButton();
		Thread.sleep(1000);
		deposits.clickQuarterTimeFilter();
		Thread.sleep(1000);
		deposits.setQuarterYearFilterDropdown("2018");
		deposits.setQuarterFilterDropdown("Q1");
		deposits.clickUpdateButton();
		Thread.sleep(1000);
		deposits.clickYearTimeFilter();
		Thread.sleep(1000);
		deposits.setYearFilterDropdown("2017");
		deposits.clickUpdateButton();
		Thread.sleep(1000);
		deposits.clickCustomTimeFilter();
		Thread.sleep(1000);
		deposits.setFromTextbox("01-01-2018");
		deposits.setToTextbox("03-31-2018");
		deposits.clickUpdateButton();
		Thread.sleep(1000);
//		deposits.clickResetFilters();
//		Thread.sleep(1000);

		//Test Bank Account filter
		deposits.clickBankAccount();
		Thread.sleep(1000);
		System.out.println(deposits.getBankAccountDropdown());
		deposits.clickBankAccountDropdown();
		Thread.sleep(1000);
		deposits.setBankAccountSearchTextbox("Centennial Station");
		Thread.sleep(1000);
		deposits.clickResetFilters();
		Thread.sleep(1000);

		//Test Amount filter
		deposits.clickAmount();
		Thread.sleep(1000);
		deposits.setAmountFilterDropdown("Greater than or equal");
		Thread.sleep(1000);
		deposits.setMinAmountFilterTextbox("1000" + Keys.ENTER);
		Thread.sleep(1000);
		deposits.setAmountFilterDropdown("Less than or equal");
		Thread.sleep(1000);
		deposits.setMaxAmountFilterTextbox("10" + Keys.ENTER);
		Thread.sleep(1000);
		deposits.setAmountFilterDropdown("Equal");
		Thread.sleep(1000);
		deposits.setMinAmountFilterTextbox("1" + Keys.ENTER);
		Thread.sleep(1000);
		deposits.setAmountFilterDropdown("Range");
		Thread.sleep(1000);
		deposits.setMinAmountFilterTextbox("10");
		deposits.setMaxAmountFilterTextbox("1000" + Keys.ENTER);
		Thread.sleep(1000);
		deposits.clickResetFilters();
		Thread.sleep(1000);
	}
}

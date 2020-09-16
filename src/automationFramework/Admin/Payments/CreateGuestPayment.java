package automationFramework.Admin.Payments;

import org.openqa.selenium.WebDriver;

import automationMaps.Admin.AdminSidebarMap;
import automationMaps.Admin.Payments.CreateGuestPaymentMap;
import automationMaps.Admin.Payments.PaymentsMap;

public class CreateGuestPayment {
	protected WebDriver driver;

	public CreateGuestPayment(WebDriver driver) {
		this.driver = driver;
	}

	public void createGuestPaymentTest() throws InterruptedException {
		CreateGuestPaymentMap guestPayment = new CreateGuestPaymentMap(driver);
		PaymentsMap payments = new PaymentsMap(driver);
		AdminSidebarMap sidebar = new AdminSidebarMap(driver);

		sidebar.clickPayments();
		payments.clickCreateGuestPayment();
		guestPayment.setTargetDropdown("Rent");
		guestPayment.setPaymentAmountTextbox("10");
		guestPayment.setUnitTextbox("123");
		guestPayment.clickPaymentButton();
	}
}

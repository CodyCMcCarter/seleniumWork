package automationFramework.Admin.Payments;

import org.openqa.selenium.WebDriver;

public class Payments {
	
	public static void paymentsTests(WebDriver driver) throws InterruptedException {
		Transactions transactions = new Transactions(driver);
		TransactionsCalendar transactionsCalendar = new TransactionsCalendar(driver);
		Deposits deposits = new Deposits(driver);
		DepositsCalendar depositsCalendar = new DepositsCalendar(driver);
		CheckScanning scanning = new CheckScanning(driver);
		CreateGuestPayment guestPayment = new CreateGuestPayment(driver);
		
		transactions.transactionsTest();
		transactionsCalendar.transactionsCalendarTest();
		deposits.depositsTest();
		depositsCalendar.depositsCalendarTest();
//		guestPayment.createGuestPaymentTest();
		
		System.out.println("Success");
	}

}
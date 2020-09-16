package automationFramework.Portal;

import java.util.Arrays;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import automationMaps.Portal.PortalHomeMap;
import automationMaps.Portal.PortalPaymentsMap;
import automationMaps.Portal.PortalSidebarMap;
import automationMaps.Portal.Payments.PortalAddPaymentMethodMap;
import automationMaps.Portal.Payments.PortalMakePaymentMap;

public class PortalPayments {
	public static void portalPaymentsTests(WebDriver driver,String release) throws InterruptedException {

		//set page map
		PortalHomeMap home = new PortalHomeMap(driver);
		PortalSidebarMap sidebar = new PortalSidebarMap(driver);
		PortalPaymentsMap payments = new PortalPaymentsMap(driver);
		PortalMakePaymentMap makePayment = new PortalMakePaymentMap(driver);
		PortalAddPaymentMethodMap addMethod = new PortalAddPaymentMethodMap(driver);
		
		//Alter variables for testing
		String[] cardNos = {"4400000000000008","4111111111111111","5500000000000004","6011000000000004","340000000000009"};
		String expMonth = "01";
		String expYear = "23";
		String amount = "1";
		String payMethod0 = "0";
		String cvv = "999";
		String zip = "29420";
		String memo = "Selenium Testing";
		String methodTypeCard = "Debit or Credit Card";
		String methodTypeBank = "Bank Account";
		String routing = "061000227";
		String accountNo = "00000000123456789";
		String confirmBankMethod = "Checking #6789";
		String assertConfirmUrl = "portal/receipt/payment/";
		String deletePaymentMethod = "0";
		String defaultPaymentMethod = "1";
		
		//Move to new payment page
		sidebar.clickPaymentsLink();
		
		payments.clickMakeAPaymentButton();
		makePayment.clickFirstNewPaymentMethodButton();
		//All payments after first will take the second slot, so this will keep track of that
		String cv = "0";
		
		for(int i=0; i<=4; i++) {
			if(i==4) {
				cvv = "9999";
			}
			
			//Add new card payment method
			addMethod.setMethodTypeDropdown(methodTypeCard);
			addMethod.setCardNumberTextbox(cardNos[i]);
			addMethod.setExpDateTextbox(expMonth,expYear);
			addMethod.setZipCodeTextbox(zip);
			addMethod.clickSaveCardButton();
			addMethod.clickConfirmDupButton();
			
			//Fill out payment form
			makePayment.setPaymentAmountTextbox(amount);
			if(i==1) {
				cv = "1";
			}
			makePayment.setCvvTextbox(cv,cvv);
			makePayment.setPaymentMemoTextbox(memo);
			
			//Confirm payment info
			makePayment.clickReviewPaymentButton();
			Thread.sleep(1000);
			Assert.assertTrue(makePayment.getConfirmMethodText().contains(cardNos[i].substring(cardNos[i].length() - 3)));
			Assert.assertTrue(makePayment.getConfirmMemoText().contains(memo));
			Thread.sleep(1000);
			
			//Submit payment
			makePayment.clickConfirmPaymentButton();
			Thread.sleep(2000);
			makePayment.clickMyPaymentHistoryButton();
			payments.clickMakeAPaymentButton();
//			Thread.sleep(1000);
			makePayment.clickNewPaymentMethodButton();
		};
		
		//Return to new payment page
//		payments.clickMakeAPaymentButton();
//		Thread.sleep(1000);
		
		//Add new bank payment method
		makePayment.clickNewPaymentMethodButton();
		addMethod.setMethodTypeDropdown(methodTypeBank);
		addMethod.setRoutingNumberTextbox(routing);
		addMethod.setBankNumberTextbox(accountNo);
		addMethod.setConfirmBankTextbox(accountNo);
		addMethod.clickSaveBankButton();
		addMethod.clickConfirmDupButton();
		Thread.sleep(2000);
		
		//Close confirm pane and fill out payment form
		makePayment.setPaymentAmountTextbox(amount);
		makePayment.setPaymentMemoTextbox(memo);
		
		//Confirm payment info
		makePayment.clickReviewPaymentButton();
		Assert.assertTrue(makePayment.getConfirmMethodText().contains(confirmBankMethod));
		Assert.assertTrue(makePayment.getConfirmMemoText().contains(memo));
		Thread.sleep(1000);
		
		//Submit payment and return to portal home
		makePayment.clickConfirmPaymentButton();
		Thread.sleep(5000);
		Assert.assertTrue(driver.getCurrentUrl().contains(assertConfirmUrl));
		makePayment.clickMyPortalButton();
		
		//Make payment from Home page
		home.clickMakeAPaymentButton();
		makePayment.setPaymentAmountTextbox(amount);
		makePayment.setCvvTextbox(payMethod0,cvv);
		makePayment.setPaymentMemoTextbox(memo);
		makePayment.clickReviewPaymentButton();
		Assert.assertTrue(makePayment.getConfirmMemoText().contains(memo));
		Thread.sleep(1000);
		makePayment.clickConfirmPaymentButton();
		Thread.sleep(5000);
		Assert.assertTrue(driver.getCurrentUrl().contains(assertConfirmUrl));
		makePayment.selectFrequencyTypeDropdown("Annual");
		makePayment.clickEndOnRadioButton();
		makePayment.selectDayToPayOnDropdown("15");
		makePayment.clickScheduleThisPaymentButton();
		
		//Delete and set default bank payment method
		payments.clickPayMethodsTab();
//		payments.clickMakeDefaultButton(defaultPaymentMethod);
		payments.clickMethodDeleteButton(deletePaymentMethod);
//		payments.clickMakeDefaultButton(defaultPaymentMethod);
	}
}

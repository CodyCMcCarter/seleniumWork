package automationFramework.Portal;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import automationMaps.Portal.PortalHomeMap;
import automationMaps.Portal.PortalPaymentsMap;
import automationMaps.Portal.PortalSidebarMap;
import automationMaps.Portal.Payments.PortalAddPaymentMethodMap;
import automationMaps.Portal.Payments.PortalMakePaymentMap;

public class PortalCleanUp {
	public static void portalCleanUp(WebDriver driver,String release) throws InterruptedException {

		//set page map
		PortalSidebarMap sidebar = new PortalSidebarMap(driver);
		PortalPaymentsMap payments = new PortalPaymentsMap(driver);		
		//Alter variables for testing
		String deletePayment = "0";
		
		//Delete scheduled payment and remaining payment method
		sidebar.clickPaymentsLink();
		payments.clickPayMethodsTab();
		payments.clickMethodDeleteButton(deletePayment);
		payments.clickScheduledPaymentsTab();
		payments.clickDeleteScheduledPaymentButton(deletePayment);
	}
}

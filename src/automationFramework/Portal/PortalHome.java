package automationFramework.Portal;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import automationMaps.Portal.PortalHomeMap;
import automationMaps.Portal.PortalMaintenanceMap;
import automationMaps.Portal.PortalMessagesMap;
import automationMaps.Portal.PortalSidebarMap;
import automationMaps.Portal.PortalUserDropdownMap;
import automationMaps.Portal.Payments.PortalMakePaymentMap;

public class PortalHome {
	public static void portalHomeTests(WebDriver driver,String release) throws InterruptedException {

		//set page map
		PortalSidebarMap sidebar = new PortalSidebarMap(driver);
		PortalHomeMap home = new PortalHomeMap(driver);
		PortalUserDropdownMap user = new PortalUserDropdownMap(driver);
		PortalMakePaymentMap payment = new PortalMakePaymentMap(driver);
		PortalMaintenanceMap maintenance = new PortalMaintenanceMap(driver);
		PortalMessagesMap messages = new PortalMessagesMap(driver);
		String assertPayHistoryUrl = "paymentHistory";
		String assertScheduledPayUrl = "scheduledPayments";
		String assertPayMethodsUrl = "paymentMethods";
		String assertMaintenanceUrl = "maintenances";
		String assertMessageHistoryUrl = "messages";
		String assertMySettingsUrl = "myInfo";
		String assertNotificationsUrl = "myNotifications";
		String assertMakePaymentUrl = "payment";
		String assertSubmitMaintenanceUrl = "maintenanceRequest";
		String assertContactUrl = "contact";
		
		home.clickPaymentHistoryButton();
		Assert.assertTrue(driver.getCurrentUrl().contains(assertPayHistoryUrl));
		sidebar.clickHomeLink();
		home.clickScheduledPaymentsButton();
		Assert.assertTrue(driver.getCurrentUrl().contains(assertScheduledPayUrl));
		sidebar.clickHomeLink();
		home.clickPaymentMethodsButton();
		Assert.assertTrue(driver.getCurrentUrl().contains(assertPayMethodsUrl));
		sidebar.clickHomeLink();
		home.clickMaintenanceHistoryButton();
		Assert.assertTrue(driver.getCurrentUrl().contains(assertMaintenanceUrl));
		sidebar.clickHomeLink();
		home.clickMessageHistoryButton();
		Assert.assertTrue(driver.getCurrentUrl().contains(assertMessageHistoryUrl));
		sidebar.clickHomeLink();
		home.clickMySettingsButton();
		Assert.assertTrue(driver.getCurrentUrl().contains(assertMySettingsUrl));
		sidebar.clickHomeLink();
		home.clickNotificationsButton();
		Assert.assertTrue(driver.getCurrentUrl().contains(assertNotificationsUrl));
		sidebar.clickHomeLink();
		home.clickMakeAPaymentButton();
		Assert.assertTrue(driver.getCurrentUrl().contains(assertMakePaymentUrl));
		payment.clickCancelButton();
		home.clickSubmitMaintenanceButton();
		Assert.assertTrue(driver.getCurrentUrl().contains(assertSubmitMaintenanceUrl));
		maintenance.clickCloseMaintenanceRequestButton();
		home.clickContactButton();
		Assert.assertTrue(driver.getCurrentUrl().contains(assertContactUrl));
		messages.clickCloseMessageButton();
		user.clickPersonName();
		user.clickUserDropdownSettings();
		Assert.assertTrue(driver.getCurrentUrl().contains(assertMySettingsUrl));
	}
}

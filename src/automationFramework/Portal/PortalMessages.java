package automationFramework.Portal;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import automationMaps.Portal.PortalMessagesMap;
import automationMaps.Portal.PortalSidebarMap;

public class PortalMessages {
	public static void portalMessagesTests(WebDriver driver,String release) throws InterruptedException {

		//set page map
		PortalSidebarMap sidebar = new PortalSidebarMap(driver);
		PortalMessagesMap messages = new PortalMessagesMap(driver);
		String msg = "Selenium Test Portal Message";
		//Existing message number. Starts at 0
		String msgNo = "0";
		
		sidebar.clickMessagesLink();
		
		//Check existing message
		messages.clickExistingMessageButton(msgNo);
		sidebar.clickHomeLink();
		sidebar.clickMessagesLink();
//		messages.clickCloseMessageButton();
		
		//Create new message
		messages.clickContactButton();
		messages.setMessageTextbox(msg);
		messages.clickSendMessageButton();
	}
}

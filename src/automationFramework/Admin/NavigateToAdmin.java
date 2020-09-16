package automationFramework.Admin;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import automationMaps.Internal.ClientsMap;

public class NavigateToAdmin {
	public static void navigateToAdmin(WebDriver driver, String release) throws InterruptedException {
		ClientsMap clients = new ClientsMap(driver);
		clients.setClientNameFilter("North American Properties" + Keys.ENTER);
		clients.clickAdminLink();
		
		Thread.sleep(1000);
		Assert.assertEquals("https://test.aptx.cm/release_"+release+"/#/admin/dashboard/client/1IS9KCZGFLDTDUHC/from/03-31-2018/to/04-30-2018/accountActive/true/", driver.getCurrentUrl());
		
		System.out.println("On NAP Admin Site");
	}
}

package automationFramework.Portal;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import automationMaps.Portal.PortalMaintenanceMap;
import automationMaps.Portal.PortalSidebarMap;

public class PortalMaintenance {
	public static void portalMaintenanceTests(WebDriver driver,String release) throws InterruptedException {

		//set page map
		PortalSidebarMap sidebar = new PortalSidebarMap(driver);
		PortalMaintenanceMap maintenance = new PortalMaintenanceMap(driver);
		String method = "Other";
		String location = "Other";
		String phone = "8439016997";
		String desc = "Selenium Test";
		
		sidebar.clickMaintenanceLink();
		
		//Create new maintenance request
		maintenance.clickAddMaintenanceRequestButton();
		maintenance.setMaintenanceTypeSelect(method);
		maintenance.setMaintenanceLocationSelect(location);
		maintenance.setMaintenancePhoneTextbox(phone);
		maintenance.setMaintenanceDescriptionTextbox(desc);
		maintenance.setMaintenanceEnterRadio(true);
		maintenance.setMaintenancePetsRadio(false);
		maintenance.clickMaintenanceSubmitButton();
	}
}

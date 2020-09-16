package automationFramework.Portal;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import automationMaps.Portal.PortalPackagesMap;
import automationMaps.Portal.PortalSidebarMap;

public class PortalPackages {
	public static void portalPackagesTests(WebDriver driver,String release) throws InterruptedException {

		//set page map
		PortalSidebarMap sidebar = new PortalSidebarMap(driver);
		PortalPackagesMap packages = new PortalPackagesMap(driver);
		String package0 = "0";
		String carrier0 = "FedEx";
		String created0 = "01/28/2019 10:23 am";
		String size0 = "Medium";
		String receiver0 = "John Bonds";
		
		String package2 = "2";
		String carrier2 = "USPS";
		String created2 = "01/28/2019 10:16 am";
		String status2 = "Picked Up";
		String size2 = "Small";
		String receiver2 = "John Bonds";
		
		String package3 = "3";
		String carrier3 = "testing";
		String created3 = "11/30/2018 3:49 pm";
		String status3 = "Unclaimed";
		String size3 = "Large";
		String receiver3 = "John Bonds";
		String note3 = "testing more";
		
		sidebar.clickPackagesLink();
		packages.getPackageCarrier(package0).contains(carrier0);
		packages.getPackageCreatedOn(package0).contains(created0);
		packages.getPackageSizeType(package0).contains(size0);
		packages.getPackageReceivedBy(package0).contains(receiver0);
		packages.getPackageCarrier(package2).contains(carrier2);
		packages.getPackageCreatedOn(package2).contains(created2);
		packages.getPackageStatus(package2).contains(status2);
		packages.getPackageSizeType(package2).contains(size2);
		packages.getPackageReceivedBy(package2).contains(receiver2);
		packages.getPackageCarrier(package3).contains(carrier3);
		packages.getPackageCreatedOn(package3).contains(created3);
		packages.getPackageStatus(package3).contains(status3);
		packages.getPackageSizeType(package3).contains(size3);
		packages.getPackageReceivedBy(package3).contains(receiver3);
		packages.getPackagesNotes(package3).contains(note3);
		packages.clickPackageViewImageLink(package3);
	}
}

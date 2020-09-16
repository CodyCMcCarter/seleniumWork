package automationFramework.Portal;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainPortal {
	public static void main(String[] args) throws InterruptedException {
		String d = "webdriver.chrome.driver";
		String exePath = "/Users/codymccarter/eclipse-workspace/Selenium/chromedriver";
		System.setProperty(d, exePath);
		
		//Update to release number
		String release = "20200415";
		//Update to your login information
		String email = "cody@aptexx.com";
		String pin = "1234";
		//set driver
		WebDriver driver = new ChromeDriver();
		//set default wait time
//		new Thread(new Runnable()
//        {
//            @Override
//            public void run()
//            {
//            	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        		
//        		PortalLogin.logIntoPortal(driver,release,email,pin);
//        		PortalPayments.portalPaymentsTests(driver, release);
//        		
//        		System.out.println("Success");
//            }
//        }).start();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		PortalLogin.logIntoPortal(driver,release,email,pin);
		PortalHome.portalHomeTests(driver, release);
		PortalPayments.portalPaymentsTests(driver, release);
		PortalMaintenance.portalMaintenanceTests(driver, release);
		PortalPackages.portalPackagesTests(driver, release);
		PortalMessages.portalMessagesTests(driver, release);
		PortalSettings.portalSettingsTests(driver, release);
		PortalCleanUp.portalCleanUp(driver, release);
		PortalLogout.logOutOfPortal(driver);
		
		System.out.println("Success");
	}
}

package automationFramework.Portal;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import automationMaps.Portal.PortalSettingsMap;
import automationMaps.Portal.PortalSidebarMap;

public class PortalSettings {
	public static void portalSettingsTests(WebDriver driver,String release) throws InterruptedException {

		//set page map
		PortalSidebarMap sidebar = new PortalSidebarMap(driver);
		PortalSettingsMap settings = new PortalSettingsMap(driver);
		//0 for English, 1 for Spanish
//		int lang = 0;
		String firstName = "Selenium";
		String lastName = "Test";
		String email = "selenium@tester.com";
		String phone = "8439019876";
		//options under Notifications tab
		String option0 = "email";
		String option1 = "text";
		//Day used for reminder frequency
		String day = "9";
		
		sidebar.clickSettingsLink();
		
		//Change language
//		settings.setLanguagePreferenceDropdown(lang+1);
//		settings.setLanguagePreferenceDropdown(lang);
		
		//Change info
		settings.setFirstNameTextbox(firstName);
		settings.setLastNameTextbox(lastName);
		settings.setEmailTextbox(email);
		settings.setPhoneTextbox(phone);
		settings.clickSaveMyInfoButton();
		
		//To Notifications
		settings.clickNotificationsTab();
		
		//Turn on email
		settings.clickPayReminder(option0);
		settings.clickSurvey(option0);
		settings.clickGroupMessages(option0);
		settings.clickSavePreferencesButton();
		
		//Turn off email
		settings.clickPayReminder(option0);
		settings.clickSurvey(option0);
		settings.clickGroupMessages(option0);
		
		//Turn on text
		settings.clickPayReminder(option1);
		//Set reminder day
		settings.setReminderDay(day);
		settings.clickSurvey(option1);
		settings.clickGroupMessages(option1);
		settings.clickSavePreferencesButton();
	}
}

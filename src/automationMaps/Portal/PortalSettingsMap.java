package automationMaps.Portal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PortalSettingsMap {
protected WebDriver driver;
	
	//set driver for instance
	public PortalSettingsMap(WebDriver driver) {
		this.driver = driver;
	}
	
	//Click the My Info tab
	public void clickMyInfoTab() {
		driver.findElement(By.id("portal_profile_navMyInfoTab")).click();
	}
	
	//Click the Notifications tab
	public void clickNotificationsTab() {
		driver.findElement(By.id("portal_profile_navNotificationsTab")).click();
	}
	
	//Set the language for the user's portal
	public Select getLanguagePreferenceDropdown() {
		Select dropdown = new Select(driver.findElement(By.name("langType")));
		return dropdown;
	}
	
	//0 is English, 1 is Spanish
	public void setLanguagePreferenceDropdown(int lang) {
		getLanguagePreferenceDropdown().selectByIndex(lang);
	}
	
	//Change the user's first name
	public WebElement getFirstNameTextbox() {
		return driver.findElement(By.name("firstName"));
	}
	
	public void setFirstNameTextbox(String firstName) {
		getFirstNameTextbox().sendKeys(firstName);
	}
	
	//Change the user's last name
	public WebElement getLastNameTextbox() {
		return driver.findElement(By.name("lastName"));
	}
	
	public void setLastNameTextbox(String lastName) {
		getLastNameTextbox().sendKeys(lastName);
	}
	
	//Change the user's email
	public WebElement getEmailTextbox() {
		return driver.findElement(By.name("email"));
	}
	
	public void setEmailTextbox(String email) {
		getEmailTextbox().sendKeys(email);
	}
	
	//Change the user's phone number
	public WebElement getPhoneTextbox() {
		return driver.findElement(By.name("phone"));
	}
	
	public void setPhoneTextbox(String phone) {
		getPhoneTextbox().sendKeys(phone);
	}
	
	//Click the Save My Info button
	public void clickSaveMyInfoButton() {
		driver.findElement(By.id("portal_profile_saveInfoBtn")).click();
	}
	
	//Click the Reset PIN button
	public void clickResetPINButton() {
		driver.findElement(By.id("portal_profile_resetPinBtn")).click();
	}
	
	//Click the Payment Reminder checkbox
	public void clickPayReminder(String option) {
		if(option.contains("email")){
			driver.findElement(By.name("emailPaymentReminder")).click();
		}
		else {
			driver.findElement(By.name("textPaymentReminder")).click();
		}
	}
	
	//Set the Payment Reminder Frequency
	public Select getReminderFrequencyType() {
		Select dropdown = new Select(driver.findElement(By.name("reminderFrequencyType")));
		return dropdown;
	}
	
	public void setReminderFrequencyType(String freq) {
		getReminderFrequencyType().selectByVisibleText(freq);
	}
	
	//Set the Payment Reminder Offset
	public Select getReminderOffset() {
		Select dropdown = new Select(driver.findElement(By.name("reminderOffset")));
		return dropdown;
	}
	
	public void setReminderOffset(String offset) {
		getReminderOffset().selectByVisibleText(offset);
	}
	
	//Set the Payment Reminder Day
	public Select getReminderDay() {
		Select dropdown = new Select(driver.findElement(By.name("reminderDay")));
		return dropdown;
	}
	
	public void setReminderDay(String day) {
		getReminderDay().selectByVisibleText(day);
	}
	
	//
	public void clickSurvey(String option) {
		if(option.contains("email")){
			driver.findElement(By.name("emailSurvey")).click();
		}
		else {
			driver.findElement(By.name("textSurvey")).click();
		}
	}
	
	public void clickGroupMessages(String option) {
		if(option.contains("email")){
			driver.findElement(By.name("emailMessage")).click();
		}
		else {
			driver.findElement(By.name("textMessage")).click();
		}
	}
	
	public void clickSavePreferencesButton() {
		driver.findElement(By.id("portal_profile_notificationsContainer_savePreferencesBtn")).click();
	}
}

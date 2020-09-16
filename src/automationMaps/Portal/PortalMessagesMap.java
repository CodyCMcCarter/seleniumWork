package automationMaps.Portal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PortalMessagesMap {
protected WebDriver driver;
	
	//set driver for instance
	public PortalMessagesMap(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickExistingMessageButton(String msgNo) {
		driver.findElement(By.id("portal_messages_messagesSection_message"+msgNo)).click();
	}
	
	public void clickContactButton() {
		driver.findElement(By.id("portal_messages_contactBtn")).click();
	}
	
	public WebElement getMessageTextbox() {
		return driver.findElement(By.name("message"));
	}
	
	public void setMessageTextbox(String msg) {
		getMessageTextbox().sendKeys(msg);
	}
	
	public void clickSendMessageButton() {
		driver.findElement(By.id("portal_messages_contactPane_sendMessageBtn")).click();
	}
	
	public void clickCloseMessageButton() {
		driver.findElement(By.id("js-close-message")).click();
	}
}

package automationMaps.Portal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PortalLoginMap {
	protected WebDriver driver;
	
	//set driver for instance
	public PortalLoginMap(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getEmailTextbox() {
		return driver.findElement(By.name("email"));
	}
	
	public void setEmailTextbox(String email) {
		getEmailTextbox().sendKeys(email);
	}
	
	public WebElement getPinTextbox1() {
		return driver.findElement(By.id("person_login_pinInput1"));
	}
	
	public void setPinTextbox1(String pin) {
		getPinTextbox1().sendKeys(pin);
	}
	
	public void clickLoginButton() {
		driver.findElement(By.id("js-login-button")).click();
	}
}

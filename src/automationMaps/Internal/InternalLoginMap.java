package automationMaps.Internal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InternalLoginMap {

	protected WebDriver driver;
	
	//set driver for instance
	public InternalLoginMap(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getUsername() {
		return driver.findElement(By.cssSelector(".input[data-field='usernameInput']"));
	}
	
	public void setUsername(String username) {
		getUsername().sendKeys(username);
	}
	
	public WebElement getPassword() {
		return driver.findElement(By.cssSelector(".input[data-field='passwordInput']"));
	}
	
	public void setPassword(String password) {
		getPassword().sendKeys(password);
	}
	
	public WebElement getLoginButton() {
		return driver.findElement(By.cssSelector(".btn[data-field='submitLoginButton']"));
	}
	
	public void clickLoginButton() {
		getLoginButton().click();
	}
	
	public WebElement getTokenInput() {
		return driver.findElement(By.cssSelector(".input[data-field='authyTokenInput']"));
	}
	
	public void setTokenInput(String token) {
		getTokenInput().sendKeys(token);
		
	}
}

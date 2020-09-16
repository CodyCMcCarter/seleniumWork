package automationMaps.Admin;

import org.openqa.selenium.*;

//Created on 3/21/2018 by Cody McCarter

public class AdminLoginMap {
	protected WebDriver driver;
	
	//set driver for instance
	public AdminLoginMap(WebDriver driver) {
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
}

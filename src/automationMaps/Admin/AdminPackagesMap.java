package automationMaps.Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminPackagesMap {
	
	protected WebDriver driver;
	
	//set driver for instance
	public AdminPackagesMap(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickUnclaimedQueue() {
		driver.findElement(By.cssSelector(".input[data-field='usernameInput']")).click();
	}
	
	public void clickAllPackages() {
		driver.findElement(By.cssSelector(".input[data-field='usernameInput']")).click();
	}
	
	public void clickSettings() {
		driver.findElement(By.cssSelector(".input[data-field='usernameInput']")).click();
	}
	
	public void clickCompare() {
		driver.findElement(By.cssSelector(".input[data-field='usernameInput']")).click();
	}
}

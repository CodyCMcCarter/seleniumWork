package automationMaps.Internal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClientsMap {

	protected WebDriver driver;

	//set driver for instance
	public ClientsMap(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getClientNameFilter() {
		return driver.findElement(By.name("clientName"));
	}
	
	public void setClientNameFilter(String client) {
		getClientNameFilter().sendKeys(client);
	}
	
	public void clickAdminLink() {
		driver.findElement(By.linkText("admin")).click();;
	}
}

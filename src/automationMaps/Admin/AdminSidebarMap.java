package automationMaps.Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminSidebarMap {
	
	protected WebDriver driver;
	
	//set driver for instance
	public AdminSidebarMap(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickDashboard() {
		driver.findElement(By.className("icon-navigation")).click();
	}
	
	public void clickPeople() {
		driver.findElement(By.className("icon-people")).click();
	}
	
	public void clickMessaging() {
		driver.findElement(By.className("icon-comments")).click();
	}
	
	public void clickPayments() {
		driver.findElement(By.className("icon-credit_card")).click();
	}
	
	public void clickMaintenance() {
		driver.findElement(By.className("icon-wrench")).click();
	}
	
	public void clickApplications() {
		driver.findElement(By.className("icon-content_paste")).click();
	}
	
	public void clickSurveys() {
		driver.findElement(By.className("icon-check_circle")).click();
	}	
	
	public void clickPackages() {
		driver.findElement(By.className("icon-receipt")).click();
	}	
	
	public void clickCompany() {
		driver.findElement(By.linkText("Company")).click();
	}
	
	public void clickUsers() {
		driver.findElement(By.linkText("Users")).click();
	}
	
	public void clickInternal() {
		driver.findElement(By.className("icon-lock")).click();
	}
}
package automationMaps.Admin.Payments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TransactionsCalendarMap {
	
	protected WebDriver driver;
	
	//set driver for instance
	public TransactionsCalendarMap(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getCalendarLabel() {
		return driver.findElement(By.cssSelector("#page > div > div:nth-child(2) > div.container > div > div > h2")).getText();
	}

	public Select getTransactionTypeFilterDropdown() {
		Select dropdown = new Select(driver.findElement(By.name("type")));
		return dropdown;
	}
	
	public void setTransactionsTypeFilterDropdown(String type) {
		getTransactionTypeFilterDropdown().selectByVisibleText(type);
	}

	public void clickPropertyStatusActiveFilter() {
		driver.findElement(By.id("admin_calendar_accountActiveFilter_statusFirst")).click();
	}
	
	public void clickPropertyStatusInactiveFilter() {
		driver.findElement(By.id("admin_calendar_accountActiveFilter_statusSecond")).click();
	}
	
	public void clickPropertyStatusAllFilter() {
		driver.findElement(By.id("admin_calendar_accountActiveFilter_statusThird")).click();
	}
	
	public void clickMethod() {
		driver.findElement(By.linkText("Method")).click();
	}
	
		public Select getMethodFilterDropdown() {
			Select dropdown = new Select(driver.findElement(By.name("channelType")));
			return dropdown;
		}
		
		public void setMethodFilterDropdown(String method) {
			getMethodFilterDropdown().selectByVisibleText(method);
		}
		
	public void clickDate(String day) {
		driver.findElement(By.id("admin_calendar_calendarSection_day" + day)).click();
	}
	
	public void clickUpdateButton() {
		driver.findElement(By.id("js-filter-submit")).click();
	}
	
	public void clickResetFilters() {
		driver.findElement(By.xpath("//*[@id=\"js-filters\"]/button[2]")).click();
	}
}
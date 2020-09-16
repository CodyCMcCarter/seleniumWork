package automationMaps.Admin.Payments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DepositsCalendarMap {
	
	protected WebDriver driver;
	
	//Set driver for instance
	public DepositsCalendarMap(WebDriver driver){
		this.driver = driver;
	}
	
	public void clickBankAccount() {
		driver.findElement(By.linkText("Bank Account")).click();
	}
	
		public void clickBankAccountDropdown() {
			driver.findElement(By.id("admin_settlementCalendar_clientBankFilter_selectSearchDropdown")).click();
		}

		public WebElement getBankAccountSearchTextbox() {
			return driver.findElement(By.id("admin_settlementCalendar_clientBankFilter_selectSearchTextInput"));
		}
		
		public void setBankAccountSearchTextbox(String bank) throws InterruptedException {
			getBankAccountSearchTextbox().sendKeys(bank);
			Thread.sleep(1000);
			driver.findElement(By.id("admin_settlementCalendar_clientBankFilter_itemsList_selectSearchItem0")).click();
		}
		
	public void clickDate(String day) {
		driver.findElement(By.id("admin_settlementCalendar_calendarSection_day" + day)).click();
	}
	
	public void clickUpdateButton() {
		driver.findElement(By.id("js-filter-submit")).click();
	}
	
	public void clickResetFilters() {
		driver.findElement(By.xpath("//*[@id=\"js-filters\"]/button[2]")).click();
	}
}

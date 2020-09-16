package automationMaps.Admin.Payments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SkipBankMap {

	protected WebDriver driver;
	
	public SkipBankMap(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickBankAccount() {
		driver.findElement(By.linkText("Bank Account")).click();
	}
	
		public WebElement getBankAccountFilterTextbox() {
			return driver.findElement(By.name("bankAccount"));
		}
		
		public void setBankAccountFilterTextbox(String account) {
			getBankAccountFilterTextbox().sendKeys(account);
		}
		
	public void clickBankRouting() {
		driver.findElement(By.linkText("Bank Routing")).click();
	}
	
		public WebElement getBankRoutingFilterTextbox() {
			return driver.findElement(By.name("bankRouting"));
		}
		
		public void setBankRoutingFilterTextbox(String routing) {
			getBankRoutingFilterTextbox().sendKeys(routing);
		}
		
	public void clickUpdateButton() {
		driver.findElement(By.xpath("//*[@id=\"page\"]/aside/div/button[1]")).click();
	}
	
	public void clickResetFilters() {
		driver.findElement(By.xpath("//*[@id=\"page\"]/aside/div/button[2]")).click();
	}
}

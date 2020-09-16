package automationMaps.Admin.Payments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ExportsMap {

	protected WebDriver driver;
	
	public ExportsMap(WebDriver driver) {
		this.driver = driver;
	}
	
	public Select getPaymentTypeDropdown() {
		Select dropdown = new Select(driver.findElement(By.name("type")));
		return dropdown;
	}
	
	public void setPaymentTypeDropdown(String type) {
		getPaymentTypeDropdown().selectByVisibleText(type);
	}
	
	public WebElement getRefIdTextbox() {
		return driver.findElement(By.name("refId"));
	}
	
	public void setRefIdTextbox(String refId) {
		getRefIdTextbox().sendKeys(refId);
	}
	
	public void clickExportStatusSuccess() {
		driver.findElement(By.xpath("//*[@id=\"js-filters\"]/div[3]/div/fieldset/div/label[1]/span"));
	}
	
	public void clickExportStatusFail() {
		driver.findElement(By.xpath("//*[@id=\"js-filters\"]/div[3]/div/fieldset/div/label[2]/span"));
	}
	
	public void clickExportStatusAll() {
		driver.findElement(By.xpath("//*[@id=\"js-filters\"]/div[3]/div/fieldset/div/label[3]/span"));
	}
	
	public void clickPropertyStatusActive() {
		driver.findElement(By.xpath("//*[@id=\"js-filters\"]/div[4]/div/fieldset/div/label[1]/span"));
	}
	
	public void clickPropertyStatusInactive() {
		driver.findElement(By.xpath("//*[@id=\"js-filters\"]/div[4]/div/fieldset/div/label[2]/span"));
	}
	
	public void clickPropertyStatusAll() {
		driver.findElement(By.xpath("//*[@id=\"js-filters\"]/div[4]/div/fieldset/div/label[3]/span"));
	}
	
	//Time filters
			public void clickCustomTimeFilter() {
				driver.findElement(By.xpath("//*[@id=\"js-filters\"]/div[5]/div/div/fieldset[1]/div/label[1]/span")).click();
			}
			
			public void clickMonthTimeFilter() {
				driver.findElement(By.xpath("//*[@id=\"js-filters\"]/div[5]/div/div/fieldset[1]/div/label[2]/span")).click();
			}
			
			public void clickQuarterTimeFilter() {
				driver.findElement(By.xpath("//*[@id=\"js-filters\"]/div[5]/div/div/fieldset[1]/div/label[3]/span")).click();
			}
			
			public void clickYearTimeFilter() {
				driver.findElement(By.xpath("//*[@id=\"js-filters\"]/div[5]/div/div/fieldset[1]/div/label[4]/span")).click();
			}
			
			//From and To textboxes
			public WebElement getFromTextbox() {
				return driver.findElement(By.name("from"));
			}
			
			public void setFromTextbox(String date) {
				getFromTextbox().sendKeys(date);
			}
			
			public WebElement getToTextbox() {
				return driver.findElement(By.name("to"));
			}
			
			public void setToTextbox(String date) {
				getToTextbox().sendKeys(date);
			}
			
			//Month time filter
			public Select getMonthYearFilterDropdown() {
				Select dropdown = new Select(driver.findElement(By.cssSelector(".select[data-field='monthYearSelect']")));
				return dropdown;
			}
			
			public Select getMonthFilterDropdown() {
				Select dropdown = new Select(driver.findElement(By.cssSelector(".select[data-field='monthSelect']")));
				return dropdown;
			}
			
			//Quarter time filter
			public Select getQuarterYearFilterDropdown() {
				Select dropdown = new Select(driver.findElement(By.cssSelector(".select[data-field='quarterYearSelect']")));
				return dropdown;
			}
			
			public Select getQuarterFilterDropdown() {
				Select dropdown = new Select(driver.findElement(By.cssSelector(".select[data-field='quarterSelect']")));
				return dropdown;
			}
			
			//Year time filter
			public Select getYearFilterDropdown() {
				Select dropdown = new Select(driver.findElement(By.cssSelector(".select[data-field='yearSelect']")));
				return dropdown;
			}
	
		public void clickAmount() {
			driver.findElement(By.linkText("Total Amount")).click();
		}
			
			public Select getAmountFilterDropdown() {
				Select dropdown = new Select(driver.findElement(By.name("operatorSelect")));
				return dropdown;
			}
			
				//Use minAmount for Greater Than and Equals entries
				public WebElement getMinAmountFilterTextbox() {
					return driver.findElement(By.name("minAmount"));
				}
				
				public void setMinValueFilterTextbox(String min) {
					getMinAmountFilterTextbox().sendKeys(min);
				}
				
				//Use maxAmount for Less Than entries
				public WebElement getMaxAmountFilterTextbox() {
					return driver.findElement(By.name("maxAmount"));
				}
				
				public void setMaxAmountFilterTextbox(String max) {
					getMaxAmountFilterTextbox().sendKeys(max);
				}
				
	public void clickUpdateButton() {
		driver.findElement(By.xpath("//*[@id=\"page\"]/aside/div/button[1]")).click();
	}
	
	public void clickResetFilters() {
		driver.findElement(By.xpath("//*[@id=\"page\"]/aside/div/button[2]")).click();
	}
}

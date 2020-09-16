package automationMaps.Admin.Payments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ComparePaymentsMap {

	protected WebDriver driver;
	
	public ComparePaymentsMap(WebDriver driver) {
		this.driver = driver;
	}
	
	public Select getMetricDropdown() {
		Select dropdown = new Select(driver.findElement(By.cssSelector(".select[data-field='reportSelect']")));
		return dropdown;
	}
	
	public void setMetricDropdown(String metric) {
		getMetricDropdown().selectByVisibleText(metric);
	}
	
	public void clickPropertyStatusActiveFilter() {
		driver.findElement(By.xpath("//*[@id=\"page\"]/aside/div/div[2]/div/fieldset/div/label[1]/span")).click();
	}
	
	public void clickPropertyStatusInactiveFilter() {
		driver.findElement(By.xpath("//*[@id=\"page\"]/aside/div/div[2]/div/fieldset/div/label[2]/span")).click();
	}
	
	public void clickPropertyStatusAllFilter() {
		driver.findElement(By.xpath("//*[@id=\"page\"]/aside/div/div[2]/div/fieldset/div/label[3]/span")).click();
	}
	
		//Time filters
		public void clickCustomTimeFilter() {
			driver.findElement(By.xpath("//*[@id=\"js-filters\"]/div[4]/div/div/fieldset[1]/div/label[1]/span")).click();
		}
		
		public void clickMonthTimeFilter() {
			driver.findElement(By.xpath("//*[@id=\"js-filters\"]/div[4]/div/div/fieldset[1]/div/label[2]/span")).click();
		}
		
		public void clickQuarterTimeFilter() {
			driver.findElement(By.xpath("//*[@id=\"js-filters\"]/div[4]/div/div/fieldset[1]/div/label[3]/span")).click();
		}
		
		public void clickYearTimeFilter() {
			driver.findElement(By.xpath("//*[@id=\"js-filters\"]/div[4]/div/div/fieldset[1]/div/label[4]/span")).click();
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
	
	public Select getSortTypeDropdown() {
		Select dropdown = new Select(driver.findElement(By.name("sortTypeVolume")));
		return dropdown;
	}
	
	public void setSortTypeDropdown(String sort) {
		getSortTypeDropdown().selectByVisibleText(sort);
	}
	
	public void clickUpdateButton() {
		driver.findElement(By.xpath("//*[@id=\"page\"]/aside/div/button[1]")).click();
	}
	
	public void clickResetFilters() {
		driver.findElement(By.xpath("//*[@id=\"page\"]/aside/div/button[2]")).click();
	}
}

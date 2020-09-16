package automationMaps.Admin.Payments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CheckBatchesMap {
	
	protected WebDriver driver;
	
	public CheckBatchesMap(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getRefIdTextbox() {
		return driver.findElement(By.name("scanBatchRefId"));
	}
	
	public String getRefId() {
		return driver.findElement(By.id("admin_scan_batches_reportSection_refNumber0")).getText();
	}
	
	public void setRefIdTextbox(String refId) {
		getRefIdTextbox().sendKeys(refId);
	}
	
	public WebElement getIclBatchTextbox() {
		return driver.findElement(By.name("iclBatchRefId"));
	}
	
	public void setIclBatchTextbox(String iclBatch) {
		getIclBatchTextbox().sendKeys(iclBatch);
	}
	
	//Time filters
		public void clickCustomTimeFilter() {
			driver.findElement(By.id("admin_scan_batches_dateFilter_calPickerCustom")).click();
		}
		
		public void clickMonthTimeFilter() {
			driver.findElement(By.id("admin_scan_batches_dateFilter_calPickerMonth")).click();
		}
		
		public void clickQuarterTimeFilter() {
			driver.findElement(By.id("admin_scan_batches_dateFilter_calPickerQuarter")).click();
		}
		
		public void clickYearTimeFilter() {
			driver.findElement(By.id("admin_scan_batches_dateFilter_calPickerYear")).click();
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
			Select dropdown = new Select(driver.findElement(By.id("admin_scan_batches_dateFilter_calPickerMonthYearSelect")));
			return dropdown;
		}
		
		public Select getMonthFilterDropdown() {
			Select dropdown = new Select(driver.findElement(By.id("admin_scan_batches_dateFilter_calPickerMonthSelect")));
			return dropdown;
		}
		
		//Quarter time filter
		public Select getQuarterYearFilterDropdown() {
			Select dropdown = new Select(driver.findElement(By.id("admin_scan_batches_dateFilter_calPickerQuarterYearSelect")));
			return dropdown;
		}
		
		public Select getQuarterFilterDropdown() {
			Select dropdown = new Select(driver.findElement(By.id("admin_scan_batches_dateFilter_calPickerQuarterSelect")));
			return dropdown;
		}
		
		//Year time filter
		public Select getYearFilterDropdown() {
			Select dropdown = new Select(driver.findElement(By.id("admin_scan_batches_dateFilter_calPickerYearSelect")));
			return dropdown;
		}
		
	public void clickAmount() {
		driver.findElement(By.linkText("Total Amount")).click();
	}
	
		public Select getAmountFilterDropdown() {
			Select dropdown = new Select(driver.findElement(By.name("operatorSelect")));
			return dropdown;
		}
		
		public void setAmountFilterDropdown(String value) {
			getAmountFilterDropdown().selectByVisibleText(value);
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
		driver.findElement(By.id("admin_scan_batches_updateFiltersButton")).click();
	}
	
	public void clickResetFilters() {
		driver.findElement(By.id("admin_scan_batches_resetFiltersButton")).click();
	}
	
	//Scan Batches page
	public String getCheckBatchNumber() {
		return driver.findElement(By.id("admin_scan_batch_checkBatchId")).getText();
	}
	
	public String getIclBatchNumber() {
		return driver.findElement(By.id("admin_scan_batch_iclBatchId")).getText();
	}
}

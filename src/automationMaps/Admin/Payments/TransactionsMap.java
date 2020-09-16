package automationMaps.Admin.Payments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TransactionsMap {
	
	protected WebDriver driver;
	
	//set driver for instance
	public TransactionsMap(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getLabelText() {
		return driver.findElement(By.id("admin_transactions_aggregateSection_aggregateLabel")).getText();
	}

	public Select getTypeFilterDropdown() {
		Select dropdown = new Select(driver.findElement(By.id("admin_transactions_typeFilter_selectElement")));
		return dropdown;
	}
	
	public void setTypeFilterDropdown(String type) {
		getTypeFilterDropdown().selectByVisibleText(type);
	}
	
	public String getReferenceNumber() {
		return driver.findElement(By.id("admin_transactions_reportSection_paymentRef0")).getText();
	}
	
	public WebElement getReferenceNumberFilter() {
		return driver.findElement(By.name("refId"));
	}
	
	public void setReferenceNumberFilter(String refNo) {
		getReferenceNumberFilter().sendKeys(refNo + Keys.ENTER);
	}
	
	public void clickPropertyStatusActiveFilter() {
		driver.findElement(By.id("admin_transactions_accountActiveFilter_statusFirst")).click();
	}
	
	public void clickPropertyStatusInactiveFilter() {
		driver.findElement(By.id("admin_transactions_accountActiveFilter_statusSecond")).click();
	}
	
	public void clickPropertyStatusAllFilter() {
		driver.findElement(By.id("admin_transactions_accountActiveFilter_statusThird")).click();
	}	
		//Time filters
		public void clickCustomTimeFilter() {
			driver.findElement(By.id("admin_transactions_dateFilter_calPickerCustom")).click();
		}
		
		public void clickMonthTimeFilter() {
			driver.findElement(By.id("admin_transactions_dateFilter_calPickerMonth")).click();
		}
		
		public void clickQuarterTimeFilter() {
			driver.findElement(By.id("admin_transactions_dateFilter_calPickerQuarter")).click();
		}
		
		public void clickYearTimeFilter() {
			driver.findElement(By.id("admin_transactions_dateFilter_calPickerYear")).click();
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
			Select dropdown = new Select(driver.findElement(By.id("admin_transactions_dateFilter_calPickerMonthYearSelect")));
			return dropdown;
		}
		
		public void setMonthYearFilterDropdown(String year) {
			getMonthYearFilterDropdown().selectByVisibleText(year);
		}
		
		public Select getMonthFilterDropdown() {
			Select dropdown = new Select(driver.findElement(By.id("admin_transactions_dateFilter_calPickerMonthSelect")));
			return dropdown;
		}
		
		public void setMonthFilterDropdown(String month) {
			getMonthFilterDropdown().selectByVisibleText(month);
		}
		
		//Quarter time filter
		public Select getQuarterYearFilterDropdown() {
			Select dropdown = new Select(driver.findElement(By.id("admin_transactions_dateFilter_calPickerQuarterYearSelect")));
			return dropdown;
		}
		
		public void setQuarterYearFilterDropdown(String year) {
			getQuarterYearFilterDropdown().selectByVisibleText(year);
		}
		
		public Select getQuarterFilterDropdown() {
			Select dropdown = new Select(driver.findElement(By.id("admin_transactions_dateFilter_calPickerQuarterSelect")));
			return dropdown;
		}
		
		public void setQuarterFilterDropdown(String quarter) {
			getQuarterFilterDropdown().selectByVisibleText(quarter);
		}
		
		//Year time filter
		public Select getYearFilterDropdown() {
			Select dropdown = new Select(driver.findElement(By.id("admin_transactions_dateFilter_calPickerYearSelect")));
			return dropdown;
		}
		
		public void setYearFilterDropdown(String year) {
			getYearFilterDropdown().selectByVisibleText(year);
		}
	
	public void clickMethod() {
		driver.findElement(By.linkText("Method")).click();
	}
	
		public WebElement getMethodFilterDropdown() {
			return driver.findElement(By.id("admin_transactions_channelTypeFilter_filterMultiselect"));
		}
		
		public void setMethodFilterDropdown(String method) {
			getMethodFilterDropdown().click();
		}
	
	public void clickLastFour() {
		driver.findElement(By.linkText("Last Four")).click();
	}
	
		public WebElement getLastFourFilterTextbox() {
			return driver.findElement(By.name("lastFour"));
		}
		
		public void setLastFourFilterTextbox(String lastFour) {
			getLastFourFilterTextbox().sendKeys(lastFour);
		}
	
	public void clickCheckNo() {
		driver.findElement(By.linkText("Check #")).click();
	}
	
		public WebElement getCheckNoFilterTextbox() {
			return driver.findElement(By.name("checkNumber"));
		}
		
		public void setCheckNoFilterTextbox(String checkNo) {
			getCheckNoFilterTextbox().sendKeys(checkNo);
		}
		
		public String getCheckNo() {
			return driver.findElement(By.id("admin_transactions_reportSection_paymentCheck0")).getText();
		}
	
	public void clickScanType() {
		driver.findElement(By.linkText("Scan Type")).click();
	}
	
		public Select getScanTypeFilterDropdown() {
			Select dropdown = new Select(driver.findElement(By.name("scanType")));
			return dropdown;
		}
		
		public void setScanTypeFilterDropdown(String scan) {
			getScanTypeFilterDropdown().selectByVisibleText(scan);
		}
	
	public void clickTarget() {
		driver.findElement(By.linkText("Target")).click();
	}
	
		public Select getTargetFilterDropdown() {
			Select dropdown = new Select(driver.findElement(By.name("target")));
			return dropdown;
		}
		
		public void setTargetFilterDropdown(String target) {
			getTargetFilterDropdown().selectByVisibleText(target);
		}
	
	public void clickIntegration() {
		driver.findElement(By.linkText("Integration")).click();
	}
	
		public Select getIntegrationFilterDropdown() {
			Select dropdown = new Select(driver.findElement(By.name("integration")));
			return dropdown;
		}
		
		public void setIntegrationFilterDropdown(String integration) {
			getIntegrationFilterDropdown().selectByVisibleText(integration);
		}
	
	public void clickAmount() {
		driver.findElement(By.linkText("Amount")).click();
	}
	
		public Select getAmountFilterDropdown() {
			Select dropdown = new Select(driver.findElement(By.cssSelector("#js-filters > div:nth-child(12) > div > label > select")));
			return dropdown;
		}
		
		public void setAmountFilterDropdown(String operator) {
			getAmountFilterDropdown().selectByVisibleText(operator);
		}
		
			//Use minAmount for Greater Than and Equals entries
			public WebElement getMinAmountFilterTextbox() {
				return driver.findElement(By.name("minAmount"));
			}
			
			public void setMinAmountFilterTextbox(String min) {
				getMinAmountFilterTextbox().sendKeys(min);
			}
			
			//Use maxAmount for Less Than entries
			public WebElement getMaxAmountFilterTextbox() {
				return driver.findElement(By.name("maxAmount"));
			}
			
			public void setMaxAmountFilterTextbox(String max) {
				getMaxAmountFilterTextbox().sendKeys(max);
			}
	
	public void clickPersonName() {
		driver.findElement(By.linkText("Person Name")).click();
	}
	
		public WebElement getPersonNameFilterTextbox() {
			return driver.findElement(By.name("personName"));
		}
		
		public void setPersonNameFilterTextbox(String name) {
			getPersonNameFilterTextbox().sendKeys(name);
		}
	
	public void clickUnit() {
		driver.findElement(By.linkText("Unit")).click();
	}
	
		public WebElement getUnitFilterTextbox() {
			return driver.findElement(By.name("accountNumber"));
		}
		
		public void setUnitFilterTextbox(String unit) {
			getUnitFilterTextbox().sendKeys(unit);
		}
		
	public void clickMemo() {
		driver.findElement(By.linkText("Memo")).click();
	}
	
		public WebElement getMemoFilterTextbox() {
			return driver.findElement(By.name("memo"));
		}
		
		public void setMemoFilterTextbox(String memo) {
			getMemoFilterTextbox().sendKeys(memo);
		}
	
	public void clickMicr() {
		driver.findElement(By.linkText("MICR")).click();
	}
	
		public WebElement getMicrFilterTextbox() {
			return driver.findElement(By.name("micr"));
		}
		
		public void setMicrFilterTextbox(String micr) {
			getMicrFilterTextbox().sendKeys(micr);
		}
	
	public void clickUpdateButton() {
		driver.findElement(By.id("admin_transactions_updateFiltersButton")).click();
	}
	
	public void clickResetFilters() {
		driver.findElement(By.id("admin_transactions_resetFiltersButton")).click();
	}
}
package automationMaps.Admin.Payments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DepositsMap {
	
	protected WebDriver driver;
	
	public DepositsMap(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getReferenceNumberFilter() {
		return driver.findElement(By.name("refId"));
	}
	
	public void setReferenceNumberFilter(String refNum) {
		getReferenceNumberFilter().sendKeys(refNum + Keys.ENTER);
	}
	
	public String getReferenceNumber() {
		return driver.findElement(By.id("admin_settlements_reportSection_settlementRef0")).getText();
	}
	
	public void clickAllFilter() {
		driver.findElement(By.id("admin_settlements_settlementTypeFilter_statusFirst")).click();
	}
	
	public void clickDepositFilter() {
		driver.findElement(By.id("admin_settlements_settlementTypeFilter_statusSecond")).click();
	}
	
	public void clickWithdrawalFilter() {
		driver.findElement(By.id("admin_settlements_settlementTypeFilter_statusThird")).click();
	}	
		//Time filters
		public void clickCustomTimeFilter() {
			driver.findElement(By.id("admin_settlements_dateFilter_calPickerCustom")).click();
		}
		
		public void clickMonthTimeFilter() {
			driver.findElement(By.id("admin_settlements_dateFilter_calPickerMonth")).click();
		}
		
		public void clickQuarterTimeFilter() {
			driver.findElement(By.id("admin_settlements_dateFilter_calPickerQuarter")).click();
		}
		
		public void clickYearTimeFilter() {
			driver.findElement(By.id("admin_settlements_dateFilter_calPickerYear")).click();
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
			Select dropdown = new Select(driver.findElement(By.id("admin_settlements_dateFilter_calPickerMonthYearSelect")));
			return dropdown;
		}
		
		public void setMonthYearFilterDropdown(String year) {
			getMonthYearFilterDropdown().selectByVisibleText(year);
		}
		
		public Select getMonthFilterDropdown() {
			Select dropdown = new Select(driver.findElement(By.id("admin_settlements_dateFilter_calPickerMonthSelect")));
			return dropdown;
		}
		
		public void setMonthFilterDropdown(String month) {
			getMonthFilterDropdown().selectByVisibleText(month);
		}
		
		//Quarter time filter
		public Select getQuarterYearFilterDropdown() {
			Select dropdown = new Select(driver.findElement(By.id("admin_settlements_dateFilter_calPickerQuarterYearSelect")));
			return dropdown;
		}
		
		public void setQuarterYearFilterDropdown(String year) {
			getQuarterYearFilterDropdown().selectByVisibleText(year);
		}
		
		public Select getQuarterFilterDropdown() {
			Select dropdown = new Select(driver.findElement(By.id("admin_settlements_dateFilter_calPickerQuarterSelect")));
			return dropdown;
		}
		
		public void setQuarterFilterDropdown(String quarter) {
			getQuarterFilterDropdown().selectByVisibleText(quarter);
		}
		
		//Year time filter
		public Select getYearFilterDropdown() {
			Select dropdown = new Select(driver.findElement(By.id("admin_settlements_dateFilter_calPickerYearSelect")));
			return dropdown;
		}
		
		public void setYearFilterDropdown(String year) {
			getYearFilterDropdown().selectByVisibleText(year);
		}
	
	public void clickBankAccount() {
		driver.findElement(By.linkText("Bank Account")).click();
	}
	
		public void clickBankAccountDropdown() {
			driver.findElement(By.id("admin_settlements_clientBankFilter_selectSearchDropdown")).click();
		}
		
		public String getBankAccountDropdown() {
			return driver.findElement(By.id("admin_settlements_clientBankFilter_selectSearchDropdown")).getAttribute("value");
		}

		public WebElement getBankAccountSearchTextbox() {
			return driver.findElement(By.id("admin_settlements_clientBankFilter_selectSearchTextInput"));
		}
		
		public void setBankAccountSearchTextbox(String bank) throws InterruptedException {
			getBankAccountSearchTextbox().sendKeys(bank);
			Thread.sleep(1000);
			driver.findElement(By.id("admin_settlements_clientBankFilter_itemsList_selectSearchItem0")).click();
		}
	
	public void clickAmount() {
		driver.findElement(By.linkText("Amount")).click();
	}
	
		public Select getAmountFilterDropdown() {
			Select dropdown = new Select(driver.findElement(By.id("admin_settlements_amountFilter_operatorSelect")));
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
	
	public void clickUpdateButton() {
		driver.findElement(By.id("admin_settlements_updateFiltersButton")).click();
	}
	
	public void clickResetFilters() {
		driver.findElement(By.id("admin_settlements_resetFiltersButton")).click();
	}
}

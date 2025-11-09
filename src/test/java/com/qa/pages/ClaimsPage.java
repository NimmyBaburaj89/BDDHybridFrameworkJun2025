package com.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.ElementActions;
import com.qa.util.WaitMethods;

import cucumber.api.Scenario;

public class ClaimsPage {
	
	WebDriver driver;
	Scenario scenario;
	
	

	//Page object repository-Element located by find by annotation
	
	@FindBy(xpath = "//span[text()='Claim']")
	WebElement claimsPageLink;

	@FindBy(xpath = "//span[text()='Configuration ']")
	WebElement configurationMenu;

	@FindBy(xpath = "//a[text()='Events']")
	WebElement evenetOption;

	@FindBy(xpath = "//button[text()=' Add ']")
	WebElement addbutton;

	@FindBy(xpath = "//label[text()='Event Name']/following::input[1]")
	WebElement evenetNameField;

	@FindBy(xpath = "//button[text()=' Save ']")
	WebElement saveButton;
	
	@FindBy(xpath = "//button[text()=' Search ']")
	WebElement searchButton;

	@FindBy(xpath = "//div[@class='oxd-table-card']/child::div/child::div[2]/child::div[1]")
	WebElement searchedEvenetNameintable;

	@FindBy(xpath = "//div[@class='oxd-table-cell-actions']/child::button/i[@class='oxd-icon bi-pencil-fill']")
	WebElement editeventButton;

	@FindBy(xpath = "//i[@class='oxd-icon bi-trash']")
	WebElement deleteeventButton;

	@FindBy(xpath = "//button[text()=' Yes, Delete ']")
	WebElement deleteConfirmButton;
	
	
	
	// Page objects for claims transactions
		@FindBy(xpath = "//a[text()='Submit Claim']")
		WebElement submiclaimsMenu ;

		@FindBy(xpath = "//label[text()='Event']/following::i[1]")
		WebElement eventDropdown;
		
		@FindBy(xpath = "//label[text()='Currency']/following::i[1]")
		WebElement currencyDropdown;
		
		
		@FindBy(xpath = "//button[text()=' Create ']")
		WebElement createButton;
		
		
		@FindBy(xpath = "//h6[text()='Expenses']/following::button[1]")
		WebElement addexpenceButton;
		
		
		@FindBy(xpath = "//label[text()='Expense Type']/following::i[1]")
		WebElement expenceTypeDropdown;
		
		
		@FindBy(xpath = "//label[text()='Expense Type']/following::input[1]")
		WebElement dateField;
		
		
		@FindBy(xpath = "//label[text()='Expense Type']/following::input[2]")
		WebElement amountfield;
		
		
		@FindBy(xpath = "//label[text()='Expense Type']/following::button[2]")
		WebElement saveExpenseButton;
		
		
		@FindBy(xpath = "//div[@class='orangehrm-bottom-container']/child::p[1]")
		WebElement totalExpenseAmount;
	
	

		//Page class constructer
	/**
	 * @param driver
	 * this initialize the driver
	 */
	public ClaimsPage(WebDriver driver, Scenario scenario){
			
			this.driver=driver;
			this.scenario=scenario;
			PageFactory.initElements(driver, this);
			
		}
		
	
	//Page operation methods for claims page
	
	public void navigateToClaimsPage() {
		ElementActions.clickElement(driver, claimsPageLink, scenario);
		WaitMethods.staticWait(5000);
	}

	public void navigateToAddevenetsPage() {
		ElementActions.clickElement(driver, configurationMenu, scenario);
		ElementActions.clickElement(driver, evenetOption, scenario);
	}

	public void addnewEvenet(String eventName) {

		ElementActions.clickElement(driver, addbutton, scenario);
		WaitMethods.staticWait(5000);
		ElementActions.sendKeys(driver, evenetNameField, scenario, eventName);
		ElementActions.clickElement(driver, saveButton, scenario);
		WaitMethods.staticWait(5000);
	}
	
	public String searchnewlyaddedEvent(String eventNameToSearch) {
		ElementActions.sendKeys(driver, evenetNameField, scenario, eventNameToSearch);
		WaitMethods.staticWait(5000);
		ElementActions.clickElement(driver, searchButton, scenario);
		WaitMethods.staticWait(5000);
		return ElementActions.getText(driver, searchedEvenetNameintable, scenario);

	}

	public void editEvent(String texttoAppend) {
		ElementActions.clickElement(driver, editeventButton, scenario);
		ElementActions.sendKeys(driver, evenetNameField, scenario, texttoAppend);
		ElementActions.clickElement(driver, saveButton, scenario);
	}

	public void deletenewlyAddedEvent() {
		ElementActions.clickElement(driver, deleteeventButton, scenario);
		ElementActions.clickElement(driver, deleteConfirmButton, scenario);
	
	}
	
	
	// operation methods for adding claim expenses

		public void sumbitClaims() {
			WaitMethods.staticWait(5000);
			ElementActions.clickElement(driver, submiclaimsMenu, scenario);
		}
	
		public void selecteventandcurrency() {

			ElementActions.clickElement(driver, eventDropdown, scenario);
			Actions objactions = new Actions(driver);
			WaitMethods.staticWait(2000);
			objactions.sendKeys(Keys.ARROW_DOWN).build().perform();
			WaitMethods.staticWait(5000);
			objactions.sendKeys(Keys.ENTER).build().perform();
			WaitMethods.staticWait(2000);
			ElementActions.clickElement(driver, currencyDropdown, scenario);
			objactions.sendKeys(Keys.ARROW_DOWN).build().perform();
			WaitMethods.staticWait(5000);
			objactions.sendKeys(Keys.ENTER).build().perform();
			WaitMethods.staticWait(2000);
			ElementActions.clickElement(driver, createButton, scenario);
			WaitMethods.staticWait(10000);
		}
		public void addExpense(String expenseDate, String expenseAmount) {
			Actions objactions = new Actions(driver);
			WaitMethods.staticWait(2000);
			ElementActions.clickElement(driver, addexpenceButton, scenario);
			WaitMethods.staticWait(5000);
			ElementActions.clickElement(driver, expenceTypeDropdown, scenario);
			objactions.sendKeys(Keys.ARROW_DOWN).build().perform();
			WaitMethods.staticWait(2000);
			objactions.sendKeys(Keys.ENTER).build().perform();
			WaitMethods.staticWait(5000);
			ElementActions.sendKeys(driver, dateField, scenario, expenseDate);
			WaitMethods.staticWait(2000);
			ElementActions.sendKeys(driver, amountfield, scenario, expenseAmount);
			WaitMethods.staticWait(2000);
			ElementActions.clickElement(driver, saveExpenseButton, scenario);
			WaitMethods.staticWait(2000);

		}
		
	
		public String getTotalAmount() {
			return ElementActions.getText(driver, totalExpenseAmount, scenario).split(":")[1];
		}
		
	
}

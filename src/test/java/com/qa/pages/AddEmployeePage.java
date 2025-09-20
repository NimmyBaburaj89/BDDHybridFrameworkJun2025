package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.ElementActions;
import com.qa.util.WaitMethods;

import cucumber.api.Scenario;

public class AddEmployeePage {
	
	WebDriver driver;
	Scenario scenario;
	
	//Page object repository-Add employee page
	
	@FindBy(xpath = "//span[text()='PIM']")
	WebElement pimPageLink;

	@FindBy(xpath = "//button[text()=' Add ']")
	WebElement addEmpButton;

	@FindBy(xpath = "//input[@name='firstName']")
	WebElement firstNameField;

	@FindBy(xpath = "//input[@name='middleName']")
	WebElement middleNameField;

	@FindBy(xpath = "//input[@name='lastName']")
	WebElement lastNameField;

	@FindBy(xpath = "//button[text()=' Save ']")
	WebElement saveButton;
	
	//Page object repository-For employee search page
	
	@FindBy(xpath = "//a[text()='Employee List']")
	WebElement empListPageLink;

	@FindBy(xpath = "//label[text()='Employee Name']/following::input[1]")
	WebElement searchByEmpNamefield;

	@FindBy(xpath = "//button[text()=' Search ']")
	WebElement empSearchButton;

	@FindBy(xpath = "//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']/child::div[3]/child::div[1]")
	WebElement searchedEmpFandMname;
	

	
	//Page class constructer
		
/**
 * @param driver
 * @param scenario
 */
public AddEmployeePage(WebDriver driver, Scenario scenario){
		
		this.driver=driver;
		this.scenario=scenario;
		PageFactory.initElements(driver, this);
		
	}
	
		
	
	//Page operation methods
	
/**
 * Navigate to the PIM page
 */
public void navigateToPimPage() {
	ElementActions.clickElement(driver, pimPageLink, scenario);
}


/**
 * Add employee
 * @param fName
 * @param mName
 * @param lName
 */
public void addnewEmployee(String fName, String mName,String lName){
	
	ElementActions.clickElement(driver, addEmpButton, scenario);
	WaitMethods.staticWait(5000);
	ElementActions.sendKeys(driver, firstNameField, scenario, fName);
	ElementActions.sendKeys(driver, middleNameField, scenario, mName);
	ElementActions.sendKeys(driver, lastNameField, scenario, lName);
	ElementActions.clickElement(driver, saveButton, scenario);
	WaitMethods.staticWait(5000);
}
	


/**
 * Search employee
 */
public void navigateToEmpListPage(){
	ElementActions.clickElement(driver, empListPageLink, scenario);
}

public  String searchEmp(String fName,String mName){
	
	ElementActions.sendKeys(driver, searchByEmpNamefield, scenario, fName+mName);
	ElementActions.clickElement(driver, empSearchButton, scenario);
	return ElementActions.getText(driver, searchedEmpFandMname, scenario);
}	

}

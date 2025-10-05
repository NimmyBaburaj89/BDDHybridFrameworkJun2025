package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.ElementActions;
import com.qa.util.WaitMethods;

import cucumber.api.Scenario;

public class BuzzPage {
	
	WebDriver driver;
	Scenario scenario;

	//Page object repo
	
	@FindBy(xpath = "//h6[text()='Buzz']")
	WebElement buzzPageTitle;
	
	@FindBy(xpath = "//span[text()='Buzz']")
	WebElement buzzPageLink;

	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-buzz-post-body-text']")
	WebElement postedCommentText;

	@FindBy(xpath = "//textarea[@class='oxd-buzz-post-input']")
	WebElement buzpostInputField;

	@FindBy(xpath = "//button[text()=' Post ']")
	WebElement postButton;

	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-buzz-post-emp-name']")
	WebElement postedEmployeeName;
	
	@FindBy(xpath = "//div[@class='orangehrm-buzz-post-actions']/child::div[1]")
	 WebElement likeButton;

	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-buzz-stats-active']")
	WebElement likeCount;

	@FindBy(xpath = "//button/following::i[@class='oxd-icon bi-three-dots']")
	WebElement threedotstoEditandDelete;

	@FindBy(xpath = "//p[text()='Edit Post']")
	WebElement editPostButton;
	
	@FindBy(xpath = "//p[text()='Edit Post']/following::textarea[@class='oxd-buzz-post-input']")
	WebElement editbuzpostInputField;
	
	@FindBy(xpath = "//p[text()='Edit Post']/following::button[text()=' Post ']")
	WebElement editandPostButton;
	

	@FindBy(xpath = "//p[text()='Delete Post']")
	WebElement deletePostButton;
	
	@FindBy(xpath = "//button[text()=' Yes, Delete ']")
	WebElement deleteconfirmationButton;
	

	
	
	//Page class constructer
	
	/**
	 * @param driver
	 * this initialize the driver
	 */
	public BuzzPage(WebDriver driver, Scenario scenario) {

		this.driver = driver;
		this.scenario = scenario;
		PageFactory.initElements(driver, this);

	}
	
	
	
	
	//Page operation methods
	
	
	public String navigateToBuzzPage() {

		ElementActions.clickElement(driver, buzzPageLink, scenario);

		return ElementActions.getText(driver, buzzPageTitle, scenario);

	}

	public void addPost(String commentToPost) {
		ElementActions.sendKeys(driver, buzpostInputField, scenario, commentToPost);
		ElementActions.clickElement(driver, postButton, scenario);
	}

	public String getPostedTexttoVerify() {
		WaitMethods.staticWait(5000);
		return ElementActions.getText(driver, postedCommentText, scenario);

	}

	public void clickLikeButton() {

		ElementActions.clickElement(driver, likeButton, scenario);

	}

	public String likeCount() {
		return ElementActions.getText(driver, likeCount, scenario).split(" ")[0];
	}

public void EditPost(String updatedCommentText) {
	ElementActions.clickElement(driver, threedotstoEditandDelete, scenario);
	ElementActions.clickElement(driver, editPostButton, scenario);
	WaitMethods.staticWait(5000);
	ElementActions.sendKeys(driver, editbuzpostInputField, scenario, updatedCommentText);
	WaitMethods.staticWait(5000);
	ElementActions.clickElement(driver, editandPostButton, scenario);
	WaitMethods.staticWait(5000);
	}
	
public void deletePost() {

	ElementActions.clickElement(driver, threedotstoEditandDelete, scenario);
	ElementActions.clickElement(driver, deletePostButton, scenario);
	ElementActions.clickElement(driver, deleteconfirmationButton, scenario);

}
}
	

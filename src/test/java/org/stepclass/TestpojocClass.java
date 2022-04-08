package org.stepclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestpojocClass extends TestBaseClass {
	public TestpojocClass() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@type='text']")
	WebElement value;

	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement pass;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement lgin;
	

	@FindBy(xpath = "//a[text()='Forgotten password?']")
	WebElement fgbtn;

	@FindBy(id = "identify_email")
	WebElement user;

	@FindBy(xpath = "//button[text()='Search']")
	WebElement srchbtn;
	

	public WebElement getValue() {
		return value;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getlgin() {
		return lgin;
	}

	public WebElement getFgbtn() {
		return fgbtn;
	}

	public WebElement getUser() {
		return user;
	}

	public WebElement getSrchbtn() {
		return srchbtn;
	}

}

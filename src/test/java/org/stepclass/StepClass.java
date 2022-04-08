package org.stepclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepClass extends TestBaseClass {

	static TestpojocClass tp;

	@Given("User have enter in facebook in Chorome Browserchrome browser")
	public void user_have_enter_in_facebook_in_Chorome_Browserchrome_browser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@When("User have to enter valid email and password")
	public void user_have_to_enter_valid_email_and_password() {

		TestpojocClass tp = new TestpojocClass();

		WebElement value = tp.getValue();
		fillthebox(value, "greens");

		WebElement password = tp.getPass();
		fillthebox(password, "987654");

		tp.getlgin().click();
	}

	@Then("have to show credentials page")
	public void have_to_show_credentials_page() {
		System.out.println("fb login");

	}

	@When("user haveto click in forget password text")
	public void user_haveto_click_in_forget_password_text() {

		TestpojocClass tp = new TestpojocClass();

		WebElement fgbtn = tp.getFgbtn();
		fgbtn.click();

		WebElement user = tp.getUser();
		fillthebox(user, "greens@123");

		tp.getSrchbtn().click();
	}

	@Then("user have to show credentials page")
	public void user_have_to_show_credentials_page() {
		System.err.println("fb password forget");

	}

}

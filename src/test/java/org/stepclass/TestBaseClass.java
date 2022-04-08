package org.stepclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBaseClass {

	static WebDriver driver;

	public static void launchBrowser(String browser) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	}

	public static void launchurl(String url) {

		driver.get(url);

	}

	public static void applyimplicitwait() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	public static void fillthebox(WebElement a, String value) {

		a.sendKeys(value);
	}

	public static void clickthebtn(WebElement b) {

		b.click();
	}

}

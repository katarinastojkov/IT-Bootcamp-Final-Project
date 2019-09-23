package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityHome {
	public static final String URL = "https://www.humanity.com";
	private static final String ABOUTUS_BTN_XPATH = "//a[@class='nav-link no-before'][contains(text(),'About us')]";
	private static final String LOGIN_BTN_XPATH = "//p[contains(text(),'LOGIN')]";
	private static final String STARTFREETRIAL_UP_XPATH = "//a[@class='button pale']";
	private static final String FULLNAME_XPATH = "//div[@class='input-wrapper']//input[@placeholder='Full Name']";
	private static final String EMAIL_XPATH = "//div[@class='input-wrapper']//input[@placeholder='Work Email']";
	private static final String STARTFREETRIAL_DOWN_XPATH = "//input[@id='free-trial-link-01']";

	private static final String EMAIL2_XPATH = "//input[@id='email']";
	private static final String PASS_XPATH = "//input[@id='password']";
	private static final String LOGIN2_XPATH = "//button[contains(text(),'Log in')]";

	// AboutUs btn
	public static WebElement getAboutUs(WebDriver driver) {
		return driver.findElement(By.xpath(ABOUTUS_BTN_XPATH));
	}

	public static void clickAboutUs(WebDriver driver) {
		getAboutUs(driver).click();
	}

	// LogIn btn
	public static WebElement getLogIn(WebDriver driver) {
		return driver.findElement(By.xpath(LOGIN_BTN_XPATH));
	}

	public static void clickLogIn(WebDriver driver) {
		getLogIn(driver).click();
	}

	// StartFreeTrial btn
	public static WebElement getStartFreeTrial(WebDriver driver) {
		return driver.findElement(By.xpath(STARTFREETRIAL_UP_XPATH));
	}

	public static void clickStartFreeTrial(WebDriver driver) {
		getStartFreeTrial(driver).click();
	}

	// FullName input
	public static WebElement getFullName(WebDriver driver) {
		return driver.findElement(By.xpath(FULLNAME_XPATH));
	}

	public static void fillFullName(WebDriver driver, String inputText) {
		getFullName(driver).sendKeys(inputText);
	}

	// Email input
	public static WebElement getEmail(WebDriver driver) {
		return driver.findElement(By.xpath(EMAIL_XPATH));
	}

	public static void fillEmail(WebDriver driver, String inputText) {
		getEmail(driver).sendKeys(inputText);
	}

	// StartFreeTrialDown btn
	public static WebElement getStartFreeTrialDown(WebDriver driver) {
		return driver.findElement(By.xpath(STARTFREETRIAL_DOWN_XPATH));
	}

	public static void clickStartFreeTrialDown(WebDriver driver) {
		getStartFreeTrialDown(driver).click();
	}

	// Email2 input
	public static WebElement getEmail2(WebDriver driver) {
		return driver.findElement(By.xpath(EMAIL2_XPATH));
	}

	public static void fillEmail2(WebDriver driver, String inputText) {
		getEmail2(driver).sendKeys(inputText);
	}

	// Pass input
	public static WebElement getPass(WebDriver driver) {
		return driver.findElement(By.xpath(PASS_XPATH));
	}

	public static void fillPass(WebDriver driver, String inputText) {
		getPass(driver).sendKeys(inputText);
	}
	
	// LogIn2 btn
		public static WebElement getLogIn2(WebDriver driver) {
			return driver.findElement(By.xpath(LOGIN2_XPATH));
		}

		public static void clickLogIn2(WebDriver driver) {
			getLogIn2(driver).click();
		}
}

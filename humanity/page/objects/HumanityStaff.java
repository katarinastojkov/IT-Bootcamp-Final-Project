package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityStaff {
	public static final String URL = "https://hittheroadjack.humanity.com/app/staff/list/load/true/";
	public static final String ADD_EMPLOYEES_XPATH = "//button[@id='act_primary']";
	public static final String FIRST_NAME_XPATH = "//input[@id='_asf";
	public static final String LAST_NAME_XPATH = "//input[@id='_asl";
	public static final String EMAIL_XPATH = "//input[@id='_ase";
	public static final String ENDING_XPATH = "']";
	public static final String SAVE_EMPLOYEES_XPATH = "//button[@id='_as_save_multiple']";

	public static final String CLICK_ON_EPLOYEE_XPATH = "//a[contains(text(),'Laza Lazic')]";
	public static final String EDIT_DETAILS_XPATH = "//a[contains(text(),'Edit Details')]";
	public static final String UPLOAD_PICTURE_XPATH = "//input[@id='fileupload']";

//	public static final String EMLOYEES_TABLE_XPATH = "";
//	public static final String AS = "";
//
//	public static final String ADD_EMPLOYEES_TABLE = "";

	// lista

	// List<WebElement> listOfEmployees;

	// public static List

	// AddEmloyees
	public static WebElement getAddEmloyees(WebDriver driver) {
		return driver.findElement(By.xpath(ADD_EMPLOYEES_XPATH));
	}

	public static void clickAddEmloyees(WebDriver driver) {
		getAddEmloyees(driver).click();
	}

	// FirstName Box
	public static WebElement getFirstNameInput(WebDriver driver, int poRedu) {
		return driver.findElement(By.xpath(FIRST_NAME_XPATH + poRedu + ENDING_XPATH));
	}

	public static void setFirstNameInput(WebDriver driver, String data, int poRedu) {
		getFirstNameInput(driver, poRedu).sendKeys(data);
	}

	// LastName Box
	public static WebElement getLastNameInput(WebDriver driver, int poRedu) {
		return driver.findElement(By.xpath(LAST_NAME_XPATH + poRedu + ENDING_XPATH));
	}

	public static void setLastNameInput(WebDriver driver, String data, int poRedu) {
		getLastNameInput(driver, poRedu).sendKeys(data);
	}

	// Email Box
	public static WebElement getEmailInput(WebDriver driver, int poRedu) {
		return driver.findElement(By.xpath(EMAIL_XPATH + poRedu + ENDING_XPATH));
	}

	public static void setEmailInput(WebDriver driver, String data, int poRedu) {
		getEmailInput(driver, poRedu).sendKeys(data);
	}

	// Click SaveEmployees
	public static WebElement getSaveEmployees(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE_EMPLOYEES_XPATH));
	}

	public static void clickSaveEmployees(WebDriver driver) {
		getSaveEmployees(driver).click();
	}

	// ClickOnEmployee
	public static WebElement getClickOnEmployee(WebDriver driver) {
		return driver.findElement(By.xpath(CLICK_ON_EPLOYEE_XPATH));
	}

	public static void clickOnEmployee(WebDriver driver) {
		getClickOnEmployee(driver).click();
	}

	// EditDetails Click
	public static WebElement getEditDetails(WebDriver driver) {
		return driver.findElement(By.xpath(EDIT_DETAILS_XPATH));
	}

	public static void clickEditDetails(WebDriver driver) {
		getEditDetails(driver).click();
	}

	// UploadPicture Click
	public static WebElement getUploadPicture(WebDriver driver) {
		return driver.findElement(By.xpath(UPLOAD_PICTURE_XPATH));
	}

	public static void clickUploadPicture(WebDriver driver) {
		getUploadPicture(driver).click();
	}

}

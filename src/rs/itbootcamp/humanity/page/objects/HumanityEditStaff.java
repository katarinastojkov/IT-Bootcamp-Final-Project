package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityEditStaff {
	public static final String CLICK_ON_EPLOYEE_XPATH = "//a[contains(text(),'Laza Lazic')]";
	public static final String EDIT_DETAILS_XPATH = "//a[contains(text(),'Edit Details')]";
	// public static final String UPLOAD_PICTURE_XPATH =
	// "//input[@id='fileupload']";
	public static final String NICKNAME_XPATH = "//input[@id='nick_name']";
	public static final String SAVE_CHANGES_XPATH = "//button[@id='act_primary']";

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
//	public static WebElement getUploadPicture(WebDriver driver) {
//		return driver.findElement(By.xpath(UPLOAD_PICTURE_XPATH));
//	}
//
//	public static void clickUploadPicture(WebDriver driver) {
//		getUploadPicture(driver).click();
//	}

	// Nickname input
	public static WebElement getNickname(WebDriver driver) {
		return driver.findElement(By.xpath(NICKNAME_XPATH));
	}

	public static void fillNickname(WebDriver driver, String inputText) {
		getNickname(driver).sendKeys(inputText);
	}

	// SaveChanges
	public static WebElement getSaveChanges(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE_CHANGES_XPATH));
	}

	public static void clickSaveChanges(WebDriver driver) {
		getSaveChanges(driver).click();
	}

}

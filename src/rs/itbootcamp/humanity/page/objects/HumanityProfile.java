package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityProfile {
	public static final String USER_MENU_XPATH = "//i[@class='icon icon-arrowFullDn j-arrowIconToAvatar navBottom__userArrow']";
	public static final String PROFILE_MENU_XPATH = "//a[contains(text(),'Profile')]";
	public static final String SETTINGS_MENU_XPATH = "//div[@class='userm userm-mainPage']//a[contains(text(),'Settings')]";
	public static final String AVAILABILITY_MENU_XPATH = "//div[@class='userm userm-mainPage']//a[contains(text(),'Availability')]";
	public static final String SIGNOUT_MENU_XPATH = "//a[contains(text(),'Sign Out')]";
	public static final String VERSION_XPATH = "//div[@id='humanityAppVersion']";

	// UserMenu
	public static WebElement getUserMenu(WebDriver driver) {
		return driver.findElement(By.xpath(USER_MENU_XPATH));
	}

	public static void clickUserMenu(WebDriver driver) {
		getUserMenu(driver).click();
	}

	// ProfileMeni
	public static WebElement getProfileMeni(WebDriver driver) {
		return driver.findElement(By.xpath(PROFILE_MENU_XPATH));
	}

	public static void clickProfileMeni(WebDriver driver) {
		getProfileMeni(driver).click();
	}

	// SettingsMeni
	public static WebElement getSettingsMeni(WebDriver driver) {
		return driver.findElement(By.xpath(SETTINGS_MENU_XPATH));
	}

	public static void clickSettingsMeni(WebDriver driver) {
		getSettingsMeni(driver).click();
	}

	// AvailabilityMenu
	public static WebElement getAvailability(WebDriver driver) {
		return driver.findElement(By.xpath(AVAILABILITY_MENU_XPATH));
	}

	public static void clickAvailability(WebDriver driver) {
		getAvailability(driver).click();
	}

	// SignOutMenu
	public static WebElement getSignOut(WebDriver driver) {
		return driver.findElement(By.xpath(SIGNOUT_MENU_XPATH));
	}

	public static void clickSignOut(WebDriver driver) {
		getSignOut(driver).click();
	}

	// Version
	public static WebElement getVersionElement(WebDriver driver) {
		return driver.findElement(By.xpath(VERSION_XPATH)).findElement(By.tagName("b"));
	}

	public static String getVersion(WebDriver driver) {
		return getVersionElement(driver).getAttribute("innerHTML");
	}

}

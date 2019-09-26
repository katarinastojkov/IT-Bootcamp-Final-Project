package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityMenu {
	public static final String URL = "https://hittheroadjack.humanity.com/app/dashboard/";
	private static final String DASHBOARD_BTN_XPATH = "//a[@id='sn_dashboard']//span[@class='primNavQtip__inner']";
	private static final String SHIFTPLANNING_BTN_XPATH = "//a[@id='sn_schedule']//span[@class='primNavQtip__inner']";
	private static final String TIMECLOCK_XPATH = "//a[@id='sn_timeclock']//span[@class='primNavQtip__inner']";
	private static final String LEAVE_XPATH = "//a[@id='sn_requests']//span[@class='primNavQtip__inner']";
	private static final String TRAINING_XPATH = "//a[@id='sn_training']//span[@class='primNavQtip__inner']";
	private static final String STAFF_XPATH = "//a[@id='sn_staff']//span[@class='primNavQtip__inner']";
	private static final String PAYROLL_XPATH = "//a[@id='sn_payroll']//span[@class='primNavQtip__inner']";
	private static final String REPORTS_XPATH = "//a[@id='sn_reports']//span[@class='primNavQtip__inner']";
	private static final String SETTINGS_XPATH = "//a[@id='sn_admin']";

	// Dashboard btn
	public static WebElement getDashboard(WebDriver driver) {
		return driver.findElement(By.xpath(DASHBOARD_BTN_XPATH));
	}

	public static void clickDashboard(WebDriver driver) {
		getDashboard(driver).click();
	}

	// ShiftPlanning btn
	public static WebElement getShiftPlanning(WebDriver driver) {
		return driver.findElement(By.xpath(SHIFTPLANNING_BTN_XPATH));
	}

	public static void clickShiftPlanning(WebDriver driver) {
		getShiftPlanning(driver).click();
	}

	// TimeClock btn
	public static WebElement getTimeClock(WebDriver driver) {
		return driver.findElement(By.xpath(TIMECLOCK_XPATH));
	}

	public static void clickTimeClock(WebDriver driver) {
		getTimeClock(driver).click();
	}

	// Leave btn
	public static WebElement getLeave(WebDriver driver) {
		return driver.findElement(By.xpath(LEAVE_XPATH));
	}

	public static void clickLeave(WebDriver driver) {
		getLeave(driver).click();
	}

	// Training btn
	public static WebElement getTraining(WebDriver driver) {
		return driver.findElement(By.xpath(TRAINING_XPATH));
	}

	public static void clickTraining(WebDriver driver) {
		getTraining(driver).click();
	}

	// Staff btn
	public static WebElement getStaff(WebDriver driver) {
		return driver.findElement(By.xpath(STAFF_XPATH));
	}

	public static void clickStaff(WebDriver driver) {
		getStaff(driver).click();
	}

	// Payroll btn
	public static WebElement getPayroll(WebDriver driver) {
		return driver.findElement(By.xpath(PAYROLL_XPATH));
	}

	public static void clickPayroll(WebDriver driver) {
		getPayroll(driver).click();
	}

	// Reports btn
	public static WebElement getReports(WebDriver driver) {
		return driver.findElement(By.xpath(REPORTS_XPATH));
	}

	public static void clickReports(WebDriver driver) {
		getReports(driver).click();
	}

	// Settings btn
	public static WebElement getSettings(WebDriver driver) {
		return driver.findElement(By.xpath(SETTINGS_XPATH));
	}

	public static void clickSettings(WebDriver driver) {
		getSettings(driver).click();
	}
}

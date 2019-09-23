package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityMenu {
	private static final String DASHBOARD_BTN_XPATH = "//a[@id='sn_dashboard']//span[@class='primNavQtip__inner']";
	private static final String SHIFTPLANNING_BTN_XPATH = "//a[@id='sn_schedule']//span[@class='primNavQtip__inner']";
	private static final String TIMECLOCK_XPATH = "//i[@class='primNavQtip__icon icon-timeclock']";
	private static final String LEAVE_XPATH = "//i[@class='primNavQtip__icon icon-leave2']";
	private static final String TRAINING_XPATH = "//i[@class='primNavQtip__icon icon-education']";
	private static final String STAFF_XPATH = "//a[@id='sn_staff']//span[@class='primNavQtip__inner']";
	private static final String PAYROLL_XPATH = "//i[@class='primNavQtip__icon icon-payroll']";
	private static final String REPORTS_XPATH = "//i[@class='primNavQtip__icon icon-chart']";

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
}

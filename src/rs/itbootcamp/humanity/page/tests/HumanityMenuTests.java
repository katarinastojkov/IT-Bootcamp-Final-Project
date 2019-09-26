package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;

public class HumanityMenuTests {
	public static boolean testMenu() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(HumanityHome.URL);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		HumanityHome.clickLogIn(driver);
	
		HumanityHome.fillEmail2(driver, "howafo@net1mail.com");
		HumanityHome.fillPass(driver, "test123");
		HumanityHome.clickLogIn2(driver);
		
		HumanityMenu.clickDashboard(driver);
		Thread.sleep(2000);
		HumanityMenu.clickShiftPlanning(driver);
		Thread.sleep(2000);
		HumanityMenu.clickTimeClock(driver);
		Thread.sleep(2000);
		HumanityMenu.clickLeave(driver);
		Thread.sleep(2000);
		HumanityMenu.clickTraining(driver);
		Thread.sleep(2000);
		HumanityMenu.clickStaff(driver);
		Thread.sleep(2000);
		HumanityMenu.clickPayroll(driver);
		Thread.sleep(5000);
		
		driver.quit();
		return true;
}
}
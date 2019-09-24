package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityEditStaff;
import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanityStaff;

public class HumanityEditStaffTest {
	public static boolean testEditStaff() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(HumanityHome.URL);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		HumanityHome.clickLogIn(driver);
		HumanityHome.fillEmail2(driver, "howafo@net1mail.com");
		HumanityHome.fillPass(driver, "test123");
		HumanityHome.clickLogIn2(driver);
		HumanityMenu.clickStaff(driver);
		HumanityStaff.clickAddEmloyees(driver);
		HumanityStaff.setFirstNameInput(driver, "Laza", 1);
		HumanityStaff.setLastNameInput(driver, "Lazic", 1);
		HumanityStaff.setEmailInput(driver, "lasko@gmail.com", 1);
		HumanityStaff.clickSaveEmployees(driver);
		HumanityMenu.clickStaff(driver);
		HumanityStaff.clickOnEmployee(driver);
		HumanityStaff.clickEditDetails(driver);
		//HumanityStaff.clickUploadPicture(driver);
		HumanityEditStaff.fillNickname(driver, "zika");
		HumanityEditStaff.clickSaveChanges(driver);
		
		

		Thread.sleep(6000);
		driver.quit();

		return true;

	}
}
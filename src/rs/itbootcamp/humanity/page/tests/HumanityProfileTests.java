package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityProfile;

public class HumanityProfileTests {
	public static boolean testProfile() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(HumanityHome.URL);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		HumanityHome.clickLogIn(driver);
		HumanityHome.fillEmail2(driver, "howafo@net1mail.com");
		HumanityHome.fillPass(driver, "test123");
		HumanityHome.clickLogIn2(driver);
		
		HumanityProfile.clickUserMenu(driver);
		System.out.println("Version: " + HumanityProfile.getVersion(driver));
		
		return true;
	}
}
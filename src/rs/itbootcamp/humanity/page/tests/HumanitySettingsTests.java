package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanitySettings;

public class HumanitySettingsTests {
	public static boolean testSettings() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(HumanityHome.URL);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		HumanityHome.clickLogIn(driver);
		HumanityHome.fillEmail2(driver, "howafo@net1mail.com");
		HumanityHome.fillPass(driver, "test123");
		HumanityHome.clickLogIn2(driver);

		HumanityMenu.clickSettings(driver);
		Thread.sleep(3000);
		HumanitySettings.inputCountry(driver, "Spain");
		Thread.sleep(3000);
		HumanitySettings.inputDefaultLanguage(driver, "Spanish");
		Thread.sleep(3000);
		HumanitySettings.inputTimeFormat(driver, "24 hour");
		Thread.sleep(3000);
		driver.quit();
		return true;
	}
}
package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityHome;

public class HumanityLogInTests {

	public static boolean testLogIn() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(HumanityHome.URL);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		HumanityHome.clickLogIn(driver);

		// Method for checking url
		if (driver.getCurrentUrl().contains(HumanityHome.tURL) == false) {
			return false;
		}

		String email, pass;
		email = "howafo@net1mail.com";
		pass = "test123";

		HumanityHome.fillEmail2(driver, email);
		HumanityHome.fillPass(driver, pass);
		HumanityHome.clickLogIn2(driver);

		Thread.sleep(6000);
		driver.quit();

		return true;

	}
}
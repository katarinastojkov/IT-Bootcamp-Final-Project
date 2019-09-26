package rs.itbootcamp.humanity.page.tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.utility.ExcelUtils;

public class HumanityLogInExcelTests {
	public static boolean testLogInExcel() throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();


		driver.get(HumanityHome.URL);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		HumanityHome.clickLogIn(driver);
		
		// Method for checking url
		if(driver.getCurrentUrl().contains(HumanityHome.tURL)==false) {
			return false;
		}
		
		// Log In - Excel with loop
		String srcFile = "Data.xls";
		ExcelUtils.setExcell(srcFile);
		ExcelUtils.setWorkSheet(0);
		int r = ExcelUtils.getRowNumber();

		for (int i = 1; i < r; i++) {
			String email2 = ExcelUtils.getDataAt(i, 0);
			String pass = ExcelUtils.getDataAt(i, 1);

			HumanityHome.fillEmail2(driver, email2);
			HumanityHome.fillPass(driver, pass);

		}
		ExcelUtils.closeExcell();

		HumanityHome.clickLogIn2(driver);
		Thread.sleep(10000);
		driver.quit();
		return true;
	}
}

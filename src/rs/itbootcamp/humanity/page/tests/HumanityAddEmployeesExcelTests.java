package rs.itbootcamp.humanity.page.tests;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanityStaff;
import rs.itbootcamp.humanity.utility.ExcelUtils;

public class HumanityAddEmployeesExcelTests {

	public static boolean testAddEmloyeesExcel() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(HumanityHome.URL);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		HumanityHome.clickLogIn(driver);

		// Log In - ExcelUtils 
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
		HumanityHome.clickLogIn2(driver);
		Thread.sleep(3000);
		HumanityMenu.clickStaff(driver);
		//HumanityStaff.clickAddEmloyees(driver);

		// AddEmployees - ExcelUtils
		try {
		ExcelUtils.setExcell(srcFile);
		ExcelUtils.setWorkSheet(1);
		int row = ExcelUtils.getRowNumber();
		
		System.out.println(row + " employees.");
					
		Random ran = new Random(1000);
		for (int i = 0; i < row; i++) {
			Thread.sleep(1000);
			HumanityStaff.clickAddEmloyees(driver);
			String name = ExcelUtils.getDataAt(i + 1, 0);
			String surname = ExcelUtils.getDataAt(i + 1, 1);
			String email = ExcelUtils.getDataAt(i + 1, 2);

			HumanityStaff.setFirstNameInput(driver, name, i);
			HumanityStaff.setLastNameInput(driver, surname, i);
			HumanityStaff.setEmailInput(driver, ran.nextInt(1000)+email, i);
			
			HumanityStaff.clickSaveEmployees(driver);
		}
		ExcelUtils.closeExcell();
		
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			Thread.sleep(5000);
			driver.quit();
		}
		
		return true;

	}

}

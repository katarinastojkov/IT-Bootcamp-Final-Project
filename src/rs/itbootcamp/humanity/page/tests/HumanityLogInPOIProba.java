package rs.itbootcamp.humanity.page.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.utility.ExcelUtils;

public class HumanityLogInPOIProba {
	public static void main(String[] args) throws InterruptedException, IOException {
	
	String srcFile = "Data.xls";
	ExcelUtils.setExcell(srcFile);
	ExcelUtils.setWorkSheet(0);
	int r = ExcelUtils.getRowNumber();
	
	for(int i=0; i<r; i++) {
		String ime = ExcelUtils.getDataAt(i, 0);
		String prezime = ExcelUtils.getDataAt(i, 1);
		String email = ExcelUtils.getDataAt(i, 2); 
		
		HumanityAddEmployees.setFirstNameInput(driver, ime, i+1);
		HumanityAddEmployees.setLastNameInput(driver, prezime, i+1);
		HumanityAddEmployees.setEmailInput(driver, email, i+1);
	}
	ExcelUtils.closeExcel();

	
	HumanityAddEmployees.clickSaveEmployeesBtn(driver);

	Thread.sleep(3000);
	driver.quit();
}
}

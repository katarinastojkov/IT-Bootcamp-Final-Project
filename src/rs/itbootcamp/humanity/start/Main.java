package rs.itbootcamp.humanity.start;

import java.io.IOException;
import java.util.Scanner;

import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.tests.HumanityAddEmployeesExcelTests;
import rs.itbootcamp.humanity.page.tests.HumanityAddNewEmployeeTests;
import rs.itbootcamp.humanity.page.tests.HumanityLogInTests;
import rs.itbootcamp.humanity.page.tests.HumanityMenuTests;
import rs.itbootcamp.humanity.page.tests.HumanityProfileTests;
import rs.itbootcamp.humanity.page.tests.HumanitySettingsTests;
import rs.itbootcamp.humanity.page.tests.HumanityEditStaffTest;
import rs.itbootcamp.humanity.page.tests.HumanityLogInExcelTests;

public class Main {

	public static void main(String[] args) throws InterruptedException, IOException {

		Scanner sc = new Scanner(System.in);

		int izbor;

		do {
			System.out.println("***Welcome to humanity.com***");
			System.out.println();
			System.out.println("Choose which testing you want to experience: ");
			System.out.println();
			System.out.println("1 - Test Log In");
			System.out.println("2 - Test Add Employees");
			System.out.println("3 - Test Edit Staff");
			System.out.println("4 - Test Profile");
			System.out.println("5 - Test Settings");
			System.out.println("6 - Test Menu");

			System.out.println("7 - Test Log In automatically");
			System.out.println("8 - Test Add Employees automatically");
			System.out.println();
			System.out.println("0 - Exit");
			System.out.println();
			System.out.print("Enter the number: ");

			izbor = sc.nextInt();

			switch (izbor) {
			case 1:
				System.out.println("Test Log In");
				if (HumanityLogInTests.testLogIn()) {
					System.out.println("Test passed");
				} else {
					System.out.println("Test not passed");
				}
				break;
			case 2:
				System.out.println("Test Add Employees");
				if (HumanityAddNewEmployeeTests.testAddEmployees()) {
					System.out.println("Test passed");
				} else {
					System.out.println("Test not passed");
				}
				break;
			case 3:
				System.out.println("Test Edit Staff");
				if (HumanityEditStaffTest.testEditStaff()) {
					System.out.println("Test passed");
				} else {
					System.out.println("Test not passed");
				}
				break;
			case 4:
				System.out.println("Test Profile");
				if (HumanityProfileTests.testProfile()) {
					System.out.println("Test passed");
				} else {
					System.out.println("Test not passed");
				}
				break;
			case 5:
				System.out.println("Test Settings");
				if (HumanitySettingsTests.testSettings()) {
					System.out.println("Test passed");
				} else {
					System.out.println("Test not passed");
				}
				
				break;
			case 6:
				System.out.println("Test Menu");
				if (HumanityMenuTests.testMenu()) {
					System.out.println("Test passed");
				} else {
					System.out.println("Test not passed");
				}
				
				break;
				
			case 7:
				System.out.println("Test Log In automatically");
				if (HumanityLogInExcelTests.testLogInExcel()) {
					System.out.println("Test je prosao");
				} else {
					System.out.println("Test not passed");
				}
				break;
			case 8:
				System.out.println("Test Add Employees automatically");
				if (HumanityAddEmployeesExcelTests.testAddEmloyeesExcel()) {
					System.out.println("Test je prosao");
				} else {
					System.out.println("Test not passed");
				}
				break;
			default:
				System.out.println("Wrong input");
				break;
			case 0:
				System.out.println("Exit");
				break;
			}

		} while (izbor != 0);

//		HumanityLogInTests.testLogIn();
//		HumanityAddNewEmployeeTests.testAddEmployees();
//		HumanityEditStaffTest.testEditStaff();
//		HumanityProfileTests.testProfile();
//		HumanitySettingsTests.testSettings();
//		HumanityLogInExcelTests.testLogInExcel();
//		HumanityAddEmployeesExcelTests.testAddEmloyeesExcel();

	}
}
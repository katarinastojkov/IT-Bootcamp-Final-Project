package rs.itbootcamp.humanity.start;

import java.util.Scanner;

import rs.itbootcamp.humanity.page.tests.HumanityAddEmployeesExcelTests;
import rs.itbootcamp.humanity.page.tests.HumanityAddNewEmployeeTests;
import rs.itbootcamp.humanity.page.tests.HumanityEditStaffTest;
import rs.itbootcamp.humanity.page.tests.HumanityLogInExcelTests;
import rs.itbootcamp.humanity.page.tests.HumanityLogInTests;
import rs.itbootcamp.humanity.page.tests.HumanityMenuTests;
import rs.itbootcamp.humanity.page.tests.HumanityProfileTests;
import rs.itbootcamp.humanity.page.tests.HumanitySettingsTests;

public class Main {

	public static final int SEGMENTS = 4;
	public static final int HEIGHT = 4;

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		int izbor;
		do {
			System.out.println();
			System.out.println("***Welcome to humanity.com***");
			System.out.println();
			System.out.println("Please choose the way of testing this website: ");
			System.out.println("1 - Manually");
			System.out.println("2 - Automatically");
			System.out.println("0 - Exit");
			System.out.print("Insert the number: ");

			izbor = sc.nextInt();
			sc.nextLine();
			switch (izbor) {
			case 0:
				System.out.println("Goodbye, have a nice day");
				break;
			case 1:
				String izbormanuelno;
				do {
					System.out.println();
					System.out.println("Welcome to manual testing of the humanity.com website");
					System.out.println();
					System.out.println("You can experience the following tests: ");
					System.out.println("1 - Test Log In");
					System.out.println("2 - Test Add Employees");
					System.out.println("3 - Test Edit Staff");
					System.out.println("4 - Test Profile");
					System.out.println("5 - Test Settings");
					System.out.println("6 - Test Menu");
					System.out.println("0 - Back to main menu");
					System.out.println();
					System.out.print("Choose the option of testing: ");
					izbormanuelno = sc.nextLine();
					switch (izbormanuelno) {
					case "1":
						if (HumanityLogInTests.testLogIn()) {
							System.out.println("Test passed");
						} else {
							System.out.println("Test not passed");
						}
						;
						break;
					case "2":
						if (HumanityAddNewEmployeeTests.testAddEmployees()) {
							System.out.println("Test passed");
						} else {
							System.out.println("Test not passed");
						}
						;
						break;
					case "3":
						if (HumanityEditStaffTest.testEditStaff()) {
							System.out.println("Test passed");
						} else {
							System.out.println("Test not passed");
						}
						;
						break;
					case "4":
						if (HumanityProfileTests.testProfile()) {
							System.out.println("Test passed");
						} else {
							System.out.println("Test not passed");
						}
						;
						break;
					case "5":
						if (HumanitySettingsTests.testSettings()) {
							System.out.println("Test passed");
						} else {
							System.out.println("Test not passed");
						}
						;
						break;
					case "6":
						System.out.println("Test Menu");
						if (HumanityMenuTests.testMenu()) {
							System.out.println("Test passed");
						} else {
							System.out.println("Test not passed");
						}
						break;
					case "0":
						System.out.println("Back to main menu");
						System.out.println();
						Thread.sleep(1000);
						break;
					default:
						System.out.println("Wrong input");
					}
				} while (!izbormanuelno.equals("0"));
				break;

			case 2:
				String izborautomatizovano;
				do {
					System.out.println();
					System.out.println("Welcome to automation testing of the humanity.com website");
					System.out.println();
					System.out.println("You can experience the following tests: ");
					System.out.println("1 - Test Log In automatically");
					System.out.println("2 - Test Add Employees automatically");
					System.out.println("0 - Back to main menu");
					System.out.println();
					System.out.print("Choose the option of testing: ");
					izborautomatizovano = sc.nextLine();
					switch (izborautomatizovano) {
					case "1":
						if (HumanityLogInExcelTests.testLogInExcel()) {
							System.out.println("Test passed");
						} else {
							System.out.println("Test not passed");
						}
						;
						break;
					case "2":
						if (HumanityAddEmployeesExcelTests.testAddEmloyeesExcel()) {
							System.out.println("Test passed");
						} else {
							System.out.println("Test not passed");
						}
						;
						break;
					case "0":
						System.out.println("Back to main menu");
						Thread.sleep(1000);
						System.out.println();
						break;
					default:
						System.out.println("Wrong input");

					}
				} while (!izborautomatizovano.equals("0"));
				break;
			default:
				System.out.println("Wrong input");
				Thread.sleep(1000);
				System.out.print("* * * * * * * *");
				System.out.println();
				break;
			}
		} while (izbor != 0);
	}
}

package rs.itbootcamp.humanity.start;

import rs.itbootcamp.humanity.page.tests.HumanityAddNewEmployeeTests;
import rs.itbootcamp.humanity.page.tests.HumanityLogInTests;
import rs.itbootcamp.humanity.page.tests.HumanitySettingsTests;
import rs.itbootcamp.humanity.page.tests.HumanityEditStaffTest;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		HumanityLogInTests.testLogIn();
		HumanityAddNewEmployeeTests.testAddEmployees();
		HumanityEditStaffTest.testEditStaff();
		// HumanityProfileTests.testProfile();
		HumanitySettingsTests.testSettings();

	}

}

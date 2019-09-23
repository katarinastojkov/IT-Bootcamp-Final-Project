package start;

import page.tests.HumanityAddNewEmployeeTests;
import page.tests.HumanityLogInTests;
import page.tests.HumanityUploadPhotoTests;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		HumanityLogInTests.testLogIn();
		HumanityAddNewEmployeeTests.testAddEmployees();
		HumanityUploadPhotoTests.testUploadPhoto();

	}

}

package page.tests;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import page.objects.RegistrationObjects;
import utility.*;

public class RegistrationTest {

	private static Scanner sc;

	public static void Manual(WebDriver driver) throws Exception {
		sc = new Scanner(System.in);

		// FirstName
		RegistrationObjects.clickFirstName(driver);
		System.out.println("Unesite ime: ");
		String ime = sc.next();
		RegistrationObjects.sendKeysFirstName(driver, ime);
		// LastName
		RegistrationObjects.clickLastName(driver);
		System.out.println("Unesite prezime: ");
		String prezime = sc.next();
		RegistrationObjects.sendKeysLastName(driver, prezime);
		// Username 
		RegistrationObjects.clickUserName(driver);
		System.out.println("Unesite username: ");
		String username = sc.next();
		RegistrationObjects.sendKeysUserName(driver, username);
		// Email
		RegistrationObjects.clickEmail(driver);
		System.out.println("Unesite e-mail adresu: ");
		String email = sc.next();
		RegistrationObjects.sendKeysEmail(driver, email);
		// Password
		RegistrationObjects.clickPassword(driver);
		System.out.println("Unesite sifru: ");
		String sifra = sc.next();
		RegistrationObjects.sendKeysPassword(driver, sifra);
		// ClickRegister
		RegistrationObjects.clickRegisterButton(driver);

	}

	public static void AutomaticFill(WebDriver driver, int i) throws Exception {
		String data;
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, Constant.SHEET_NAME);
		// FirstName
		RegistrationObjects.clickFirstName(driver);
		data = ExcelUtils.getCellData(i, 0);
		RegistrationObjects.sendKeysFirstName(driver, data);
		// LastName
		RegistrationObjects.clickLastName(driver);
		data = ExcelUtils.getCellData(i, 1);
		RegistrationObjects.sendKeysLastName(driver, data);
		// UserName
		RegistrationObjects.clickUserName(driver);
		data = ExcelUtils.getCellData(i, 2);
		RegistrationObjects.sendKeysUserName(driver, data);
		// Email
		RegistrationObjects.clickEmail(driver);
		data = ExcelUtils.getCellData(i, 3);
		RegistrationObjects.sendKeysEmail(driver, data);
		// Password
		RegistrationObjects.clickPassword(driver);
		data = ExcelUtils.getCellData(i, 4);
		RegistrationObjects.sendKeysPassword(driver, data);
		// RegisterButton
		RegistrationObjects.clickRegisterButton(driver);
	}

	public static void AutomaticTestAll(WebDriver driver) throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, Constant.SHEET_NAME);
		for (int i = 1; i < ExcelUtils.getWorkSheet().getLastRowNum(); i++) {
			AutomaticFill(driver, i);

		}
	}
}
package page.tests;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import page.objects.LoginObjects;
import utility.Constant;
import utility.ExcelUtils;

public class LoginTest {

	private static Scanner sc;

	public static void Manual(WebDriver driver) throws Exception {
		sc = new Scanner(System.in);

		// UserName
		LoginObjects.clickUserName(driver);
		System.out.println("Unesite username: ");
		String username = sc.next();

		LoginObjects.sendKeysUserName(driver, username);
		// Password
		LoginObjects.clickPassword(driver);
		System.out.println("Unesite sifru: ");
		String sifra = sc.next();
		LoginObjects.sendKeysPassword(driver, sifra);
		// ClickLogin
		LoginObjects.clickLogin(driver);

	}

	public static void AutomaticFill(WebDriver driver, int i) throws Exception {
		String data;
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, Constant.SHEET_NAME);
		// UserName
		LoginObjects.clickUserName(driver);
		data = ExcelUtils.getCellData(i, 2);
		LoginObjects.sendKeysUserName(driver, data);
		// Password
		LoginObjects.clickPassword(driver);
		data = ExcelUtils.getCellData(i, 4);
		LoginObjects.sendKeysPassword(driver, data);
		// LoginButton
		LoginObjects.clickLogin(driver);
	}

	public static void AutomaticTestAll(WebDriver driver) throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, Constant.SHEET_NAME);
		for (int i = 1; i < ExcelUtils.getWorkSheet().getLastRowNum(); i++) {
			AutomaticFill(driver, i);
			LoginObjects.clickLogout(driver);
		}
	}
}

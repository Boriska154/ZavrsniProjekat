package page.tests;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import page.objects.*;
import utility.Constant;
import utility.ExcelUtils;

public class PostTest {
	private static Scanner sc;

	public static void Manual(WebDriver driver) throws Exception {
		sc = new Scanner(System.in);
		// Make a post
		PostObjects.clickMakePost(driver);
		// Name
		PostObjects.clickName(driver);
		System.out.println("Unesite ime: ");
		String ime = sc.next();
		PostObjects.sendKeysName(driver, ime);
		// Location
		PostObjects.clickLocation(driver);
		System.out.println("Unesite lokaciju: ");
		String lokacija = sc.next();
		PostObjects.sendKeysLocation(driver, lokacija);
		// Browse
		PostObjects.sendKeysBrowseButton(driver);
		// Drop down
		PostObjects.clickDropDown(driver);
		System.out.println("Izaberite Walk, Car, Motorbike, Bus ili Bicycle: ");
		String padajuciMeni = sc.next();
		PostObjects.selectDropDown(driver, padajuciMeni);
		// Description
		PostObjects.clickDescription(driver);
		System.out.println("Unesi opis: ");
		String opis = sc.next();
		PostObjects.sendDescription(driver, opis);
		// ClickPost
		PostObjects.clickPost(driver);

	}

	public static void AutomaticFill(WebDriver driver, int i) throws Exception {
		// Make a Post
		PostObjects.clickMakePost(driver);
		// Pull Excel data
		String data;
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, Constant.SHEET_NAME1);
		// Name
		PostObjects.clickName(driver);
		data = ExcelUtils.getCellData(i, 1);
		PostObjects.sendKeysName(driver, data);
		// Location
		PostObjects.clickLocation(driver);
		data = ExcelUtils.getCellData(i, 2);
		PostObjects.sendKeysLocation(driver, data);
		// Description
		PostObjects.clickDescription(driver);
		data = ExcelUtils.getCellData(i, 2);
		PostObjects.sendDescription(driver, data);
		// PostButton
		PostObjects.clickPost(driver);
	}

	public static void AutomaticPostAll(WebDriver driver) throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, Constant.SHEET_NAME1);
		for (int i = 1; i < ExcelUtils.getWorkSheet().getLastRowNum(); i++) {
			AutomaticFill(driver, i);

		}
	}
}

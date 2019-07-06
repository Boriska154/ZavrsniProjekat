package page.tests;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import page.objects.EditObjects;

public class EditTest {
	private static Scanner sc;

	public static void Manual(WebDriver driver) throws Exception {
		sc = new Scanner(System.in);
		// Expand
		EditObjects.clickExpand(driver);
		// Edit
		EditObjects.clickEdit(driver);
		// Name
		EditObjects.clickName(driver);
		System.out.println("Unesite novo ime: ");
		String novoIme = sc.next();
		EditObjects.sendKeysName(driver, novoIme);
		// Location
		EditObjects.clickLocation(driver);
		System.out.println("Unesite novu lokaciju: ");
		String novaLokacija = sc.next();
		EditObjects.sendKeysLocation(driver, novaLokacija);
		// Change
		EditObjects.sendKeysChangeButton(driver);
		// Drop down
		EditObjects.clickDropDown(driver);
		System.out.println("Izaberite Walk, Car, Motorbike, Bus ili Bicycle: ");
		String padajuciMeni = sc.next();
		EditObjects.selectDropDown(driver, padajuciMeni);
		// Description
		EditObjects.clickDescription(driver);
		System.out.println("Unesite nov opis: ");
		String novOpis = sc.next();
		EditObjects.sendDescription(driver, novOpis);
		// ClickPost
		EditObjects.clickPost(driver);

	}

}

package glavna;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.RegistrationObjects;
import page.tests.DeleteTest;
import page.tests.EditTest;
import page.tests.LoginTest;
import page.tests.PostTest;
import page.tests.RegistrationTest;

public class MainClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Boris\\Desktop\\chromedriverpravaverzija\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get(RegistrationObjects.URL);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Scanner sc = new Scanner(System.in);
		// Automatski registrujemo sve podatke iz Excela
		try {
			RegistrationTest.AutomaticTestAll(driver);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		// Manualno registrovanje korisnika
		try {
			RegistrationTest.Manual(driver);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		// Automatski proveravamo da li smo uspesno registrovali sve podatke,koristimo login/logout metodu
		try {
			LoginTest.AutomaticTestAll(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Manualno logovanje preko konzole
		try {
			LoginTest.Manual(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Automatsko objavljivnanje svih postova iz Excel fajla
		try {
			PostTest.AutomaticPostAll(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Manualno kreiranje objava
		try {
			PostTest.Manual(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Brisanje poslednja dva posta
		try {
			DeleteTest.AutomaticDelete(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Manualno editovanje posta
		try {
			EditTest.Manual(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}

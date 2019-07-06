package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationObjects {
	public static final String URL = "http://localhost/izlet/index.php";
	private static final String firstName = "//input[@name='firstname']";
	private static final String lastName = "//input[@name='lastname']";
	private static final String userName = "//div[@class='register_form']//input[@name='username']";
	private static final String email = "//input[@name='email']";
	private static final String password = "//div[@class='register_form']//input[@name='password']";
	private static final String registerButton = "//input[@id='blue_btn']";

	// FirstName
	public static WebElement getFirstName(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(firstName));
		return wb;
	}
	public static void clickFirstName(WebDriver driver) {
		getFirstName(driver).click();
	}

	public static void sendKeysFirstName(WebDriver driver, String str) {
		getFirstName(driver).sendKeys(str);
	}

	// LastName
	public static WebElement getLastName(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(lastName));
		return wb;
	}
	public static void clickLastName(WebDriver driver) {
		getLastName(driver).click();
	}

	public static void sendKeysLastName(WebDriver driver, String str) {
		getLastName(driver).sendKeys(str);
	}

	// UserName
	public static WebElement getUserName(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(userName));
		return wb;
	}
	public static void clickUserName(WebDriver driver) {
		getUserName(driver).click();
	}

	public static void sendKeysUserName(WebDriver driver, String str) {
		getUserName(driver).sendKeys(str);
	}

	// Email
	public static WebElement getEmail(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(email));
		return wb;
	}
	public static void clickEmail(WebDriver driver) {
		getEmail(driver).click();
	}

	public static void sendKeysEmail(WebDriver driver, String str) {
		getEmail(driver).sendKeys(str);
	}

	// Password
	public static WebElement getPassword(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(password));
		return wb;
	}
	public static void clickPassword(WebDriver driver) {
		getPassword(driver).click();
	}

	public static void sendKeysPassword(WebDriver driver, String str) {
		getPassword(driver).sendKeys(str);
	}

	// RegisterButton
	public static WebElement getRegisterButton(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(registerButton));
		return wb;
	}
	public static void clickRegisterButton(WebDriver driver) {
		getRegisterButton(driver).click();
	}
}

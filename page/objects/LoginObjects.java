package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginObjects {
	private static final String userName = "//input[@placeholder='username']";
	private static final String password = "//input[@placeholder='password']";
	private static final String login = "//input[@name='login']";
	private static final String logout = "//a[@id='logoutBtn']";

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

	// Login
	public static WebElement getLogin(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(login));
		return wb;
	}

	public static void clickLogin(WebDriver driver) {
		getLogin(driver).click();
	}
	// Logout
	public static WebElement getLogout(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(logout));
		return wb;
	}
	public static void clickLogout(WebDriver driver) {
		getLogout(driver).click();
	}
}

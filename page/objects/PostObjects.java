package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PostObjects {
	private static final String makePost = "//a[contains(text(),'Make a post')]";
	private static final String name = "//input[@placeholder='Naziv']";
	private static final String location = "//input[@placeholder='Lokacija']";
	private static final String dropDown = "//div[@class='popupPost']//select[@name='transport']";
	private static final String description = "//textarea[@placeholder='Opis']";
	private static final String post = "//div[@class='popupPost']//input[@name='postSubmit']";
	private static final String	browse = "//*[@id=\"image\"]";
	
	// Make a post
	public static WebElement getMakePost(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(makePost));
		return wb;
	}

	public static void clickMakePost(WebDriver driver) {
		getMakePost(driver).click();
	}

	// Name
	public static WebElement getName(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(name));
		return wb;
	}

	public static void clickName(WebDriver driver) {
		getName(driver).click();
	}

	public static void sendKeysName(WebDriver driver, String str) {
		getName(driver).sendKeys(str);
	}

	// Location
	public static WebElement getLocation(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(location));
		return wb;
	}

	public static void clickLocation(WebDriver driver) {
		getLocation(driver).click();
	}

	public static void sendKeysLocation(WebDriver driver, String str) {
		getLocation(driver).sendKeys(str);
	}

	// Change
	public static WebElement getBrowse(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(browse));
		return wb;
	}

	public static void sendKeysBrowseButton(WebDriver driver) {
		WebElement wb = getBrowse(driver);
		wb.sendKeys("C:\\Users\\Boris\\eclipse-workspace\\ZavrsniRad\\IMG_20140928_145555.jpg");
	}

	// DropDown
	public static WebElement getDropDown(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(dropDown));
		return wb;
	}

	public static void clickDropDown(WebDriver driver) {
		getDropDown(driver).click();
	}

	public static void selectDropDown(WebDriver driver, String str) {
		Select drop = new Select(getDropDown(driver));
		drop.selectByVisibleText(str);
	}

	// Description
	public static WebElement getDescription(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(description));
		return wb;
	}

	public static void clickDescription(WebDriver driver) {
		getDescription(driver).click();
	}

	public static void sendDescription(WebDriver driver, String str) {
		getDescription(driver).sendKeys(str);
	}

	// PostButton
	public static WebElement getPost(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(post));
		return wb;
	}

	public static void clickPost(WebDriver driver) {
		getPost(driver).click();
	}
}

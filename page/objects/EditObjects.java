package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EditObjects {
	private static final String expand = "fa-ellipsis-v";
	private static final String edit = "fa-edit";
	private static final String name = "//input[@id='title']";
	private static final String location = "//input[@id='location']";
	private static final String change = "//*[@id=\"editImage\"]";
	private static final String dropdown = "//select[@id='transport']";
	private static final String description = "//textarea[@id='description']";
	private static final String postButton = "//div[@class='popupEdit']//input[@name='postSubmit']";

	// Click Expand
	public static WebElement getExpand(WebDriver driver) {
		WebElement wb = driver.findElement(By.className(expand));
		return wb;
	}

	public static void clickExpand(WebDriver driver) {
		getExpand(driver).click();
	}

	// Click Edit
	public static WebElement getEdit(WebDriver driver) {
		WebElement wb = driver.findElement(By.className(edit));
		return wb;
	}

	public static void clickEdit(WebDriver driver) {
		getEdit(driver).click();
	}

	// Name
	public static WebElement getName(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(name));
		return wb;
	}

	public static void clickName(WebDriver driver) {
		getName(driver).click();
		getName(driver).clear();
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
		getLocation(driver).clear();
	}

	public static void sendKeysLocation(WebDriver driver, String str) {
		getLocation(driver).sendKeys(str);
	}

	// Change
	public static WebElement getChange(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(change));
		return wb;
	}

	public static void sendKeysChangeButton(WebDriver driver) {
		WebElement wb = getChange(driver);
		wb.sendKeys("C:\\Users\\Boris\\eclipse-workspace\\ZavrsniRad\\IMG_20140928_142952.jpg");
	}

	// DropDown
	public static WebElement getDropDown(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(dropdown));
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
		getDescription(driver).clear();
	}

	public static void sendDescription(WebDriver driver, String str) {
		getDescription(driver).sendKeys(str);
	}

	// PostButton
	public static WebElement getPost(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(postButton));
		return wb;
	}

	public static void clickPost(WebDriver driver) {
		getPost(driver).click();
	}

}

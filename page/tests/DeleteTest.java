package page.tests;

import org.openqa.selenium.WebDriver;

import page.objects.DeleteObjects;


public class DeleteTest {
	
	public static void AutomaticDelete(WebDriver driver) throws Exception {
		
		for(int i=0;i<2;i++) {
			DeleteObjects.clickExpand(driver);
			DeleteObjects.clickDelete(driver);
		}
		
}
}

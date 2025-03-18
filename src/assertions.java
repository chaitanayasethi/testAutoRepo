import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


public class assertions {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Actions ac = new Actions(driver);
	    SoftAssert softAssert = new SoftAssert();


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();

		/*
		 * Assertions
		 * Hard Asserts vs Soft Asserts (Verify)
		 */
		
		//assertEquals	
//		driver.navigate().to("https://www.browserstack.com/");
//		String actualTitle = driver.getTitle();
//		String expectedTitle = "most Reliable App & Cross Browser Testing Platform | BrowserStack";
//		Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match the expected value");
//		driver.quit();
		
		//assertNotEquals
//		driver.navigate().to("https://www.browserstack.com/");
//		String actualTitle = driver.getTitle();
//		String expectedTitle = "Incorrect Title";
//		Assert.assertNotEquals(actualTitle, expectedTitle, "Titles should not match, but they do");
//		driver.quit();
		
		//assertTrue, assertFalse, assertNull, assertNotNull
		
		//softAssert
		driver.navigate().to("https://www.browserstack.com/");
		String actualTitle = driver.getTitle();
		softAssert.assertEquals(actualTitle, "Most Reliable App & Cross Browser Testing Platform | BrowserStack", "Title does not match");
		softAssert.assertNotEquals(actualTitle, "Incorrect Title", "Title matches an incorrect value");
		softAssert.assertNotNull(actualTitle, "Page title should not be null");
		boolean titleMatch = actualTitle.equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack");
		softAssert.assertTrue(titleMatch, "Title does not match in case-insensitive comparison");
		softAssert.assertAll(); // Reports all assertion results
		driver.quit();

	}
}












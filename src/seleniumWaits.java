import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


public class seleniumWaits {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//implicit wait
		//sets a default timeout for the entire test runtime (globally)
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//				
		driver.manage().window().maximize();
//		
		driver.get("https://login.salesforce.com");
//
		WebElement usernameElement = driver.findElement(By.xpath("//input[@id='username']"));
//
//		
//		//explicitWait
//		//sets timeouts for specific conditions
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(8));
//		//multiple conditions
		wait.until(ExpectedConditions.visibilityOf(usernameElement));
//		
		driver.get("https://demoqa.com/alerts");
//
		WebElement m = driver.findElement(By.xpath("//span[text()='Click Button to see alert ']/..//following-sibling::div//button"));
        m.click();
//		
		//jse.executeScript("arguments[0].click();", m);
//
		wait.until(ExpectedConditions.alertIsPresent());
//		
		driver.switchTo().alert().accept();
		System.out.println("explicit wait validated successfully");

		Thread.sleep(4000);
		driver.quit();
		
			

	}
}















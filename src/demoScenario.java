import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


public class demoScenario {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com");
		Thread.sleep(3000);


		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hpotter5@test.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Testing@2024");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		driver.get("https://hogwards-dev-ed.develop.lightning.force.com/lightning/r/Opportunity/006Ig000003ZWrvIAG/view");
		
		driver.findElement(By.xpath("(//a[text()='Details'])[last()]")).click();
		
		WebElement dropDownButtonJS = driver.findElement(By.xpath("//span[text()='Show more actions']"));
		
		//driver.findElement(By.xpath("//span[text()='Show more actions']")).click();
		js.executeScript("arguments[0].click();", dropDownButtonJS);

		driver.findElement(By.xpath("//a//span[text()='Edit']")).click();
		driver.findElement(By.xpath("//label[text()='Opportunity Name']//following-sibling::div//input")).clear();
		driver.findElement(By.xpath("//label[text()='Opportunity Name']//following-sibling::div//input")).sendKeys("edited oppty");
		driver.findElement(By.xpath("(//lightning-button//button[text()='Save'])[last()]")).click();
		Thread.sleep(2000);
		String opptyName = driver.findElement(By.xpath("(//slot//records-entity-label[text()='Opportunity'])[last()]/../..//following-sibling::slot//lightning-formatted-text")).getText();
		System.out.println(opptyName);
		Assert.assertEquals(opptyName, "edited oppty");
			
		driver.quit();	

		

	}
}















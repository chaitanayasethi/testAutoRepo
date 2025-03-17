import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


public class actions_demo {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Actions ac = new Actions(driver);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();

		//Example 1
//		driver.get("https://mail.google.com/");
//		
//		WebElement username = driver.findElement(By.xpath("//input[@type='email']"));
//		
//	
//		ac.moveToElement(username).click().
//		keyDown(username, Keys.SHIFT).
//		sendKeys(username, "techandmore").
//		doubleClick(username).
//		contextClick()
//		.build().perform();
//				
//		driver.quit();
		
		
		//Example 2 moveToElement along with Assert
		 driver.get("https://www.lambdatest.com/");  
		 // Locate the element to perform the hover action on
		 WebElement element_to_hover = driver.findElement(By.xpath("//button[text()='Resources ']"));
    
		 //Perform the hover action
		 ac.moveToElement(element_to_hover).build().perform();  
		 
		 Thread.sleep(4000);
         driver.findElement(By.xpath("//div//p[text()='Blog']")).click();
         
         Assert.assertEquals(driver.getCurrentUrl(), "https://www.lambdatest.com/blog/");
 
         //verify the page title after navigating to the Blog section
         Assert.assertEquals(driver.getTitle(), "LAMBDATTEST BLOGS");
         driver.close();
//         
//       //Example 3 dragAndDrop
//         driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
//         //ac.keyDown(Keys.COMMAND).sendKeys(Keys.DOWN).perform();
//
//         WebElement source = driver.findElement(By.xpath("//img[@id='drag1' and @alt='W3Schools']"));
//         WebElement destination = driver.findElement(By.xpath("//*[@id='div2']"));
//         ac.clickAndHold(source).moveToElement(destination).release().build().perform();      
//         //driver.quit();
   		

	}
}












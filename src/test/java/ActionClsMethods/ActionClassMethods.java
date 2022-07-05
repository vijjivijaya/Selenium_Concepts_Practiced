package ActionClsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClassMethods {
	@Test
	
	public void methodsOfActions() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
		  driver.manage().window().maximize();
		  Actions action = new Actions(driver);
		  WebElement element = driver.findElement(By.id("email"));
		  WebElement element1 = driver.findElement(By.name("pass"));
		  Thread.sleep(2000);
		  action.moveToElement(element1).click().perform();
		  Thread.sleep(5000);
		  action.doubleClick(element).perform();
		  Thread.sleep(2000);				  
		  
	}
}

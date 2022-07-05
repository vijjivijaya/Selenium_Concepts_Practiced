package JavaScriptexecutor;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ScrollUpAndDown {
	@Test
	
	public void main() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		 // driver.get("https://www.ajio.com/?utm_source=Admitad&utm_medium=Affiliate&utm_campaign=bf95e92ffe69e93e71552f920bc93448");
		  driver.get("https://www.flipkart.com/");
		  Thread.sleep(2000);
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  System.out.println(driver.getTitle());
		  Thread.sleep(2000);
		  Actions action = new Actions(driver);
		  //WebElement element = driver.findElement(By.xpath("//input[@placeholder=\"Search AJIO\"]"));
		  WebElement element = driver.findElement(By.linkText("Login"));
		  action.moveToElement(element).click().perform();
		  Thread.sleep(4000);
		//typecasting driver object to JavascriptExecutor interface type
		  JavascriptExecutor jse= (JavascriptExecutor) driver;
		  jse.executeScript("window.scrollBy(0, 1000)");
		  Thread.sleep(9000);
		  jse.executeScript("window.scrollBy(0, -1000)");
		  Thread.sleep(4000);
	}
}

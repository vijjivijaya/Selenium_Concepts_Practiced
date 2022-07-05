package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Prompt {
	 @Test
	 
	public void main() throws InterruptedException{
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver1_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.navigate().to("https://demoqa.com/alerts");
		  driver.manage().window().maximize();
		  JavascriptExecutor jse = (JavascriptExecutor) driver;
		  jse.executeScript("window.scrollBy(0, 500)");
		  Thread.sleep(3000);
		  driver.findElement(By.id("promtButton")).click();
		  Thread.sleep(3000);
		  Alert promptAlert = driver.switchTo().alert();
		  Thread.sleep(3000);
		  promptAlert.sendKeys("vijju");
		  Thread.sleep(3000);
		  promptAlert.accept();
		  Thread.sleep(3000);
		  driver.close();
	}

}

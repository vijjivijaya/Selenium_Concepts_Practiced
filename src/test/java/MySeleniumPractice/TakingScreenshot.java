package MySeleniumPractice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class TakingScreenshot {
	
	@Test
	 public void test() throws InterruptedException, IOException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.facebook.com");
		  driver.manage().window().maximize();
		  driver.findElement(By.id("email")).sendKeys("vijaya");
		  
		  TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
	      File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
	      File destinationFile = new File(".\\ScreenShot\\"+"Facebook.png");
	   // File destFile = new File("C:\\Users\\Admin\\eclipse-workspace\\CFP_165_Selenium\\src\\test\\java\\com\\bridgelabz\\selenium./Screenshot/"+"Facebook"+".png");
	      FileHandler.copy(sourceFile, destinationFile);
	      driver.close();
	   
	}
}

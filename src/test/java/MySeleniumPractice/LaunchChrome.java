package MySeleniumPractice;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;


public class LaunchChrome {
     @Test
     
	public void main() throws InterruptedException, AWTException, IOException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
//	  driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
	  System.out.println(driver.getTitle());
	  System.out.println(driver.getPageSource());
	  System.out.println(driver.getCurrentUrl());
//	  driver.findElement(By.id("identifierId")).sendKeys("vijayakadiyala.k@gmail.com");
//	  driver.findElement(By.className("VfPpkd-vQzf8d")).click();
//	  driver.findElement(By.id("yDmH0d")).click();  
  //     driver.findElement(By.id("email")).sendKeys("vijju");
//      driver.findElement(By.name("email")).sendKeys("vijaya");
//    driver.findElement(By.name("pass")).sendKeys("vijju123");
//    driver.findElement(By.name("login")).click();
 //     driver.findElement(By.cssSelector("._9ay7").getText();
//    Thread.sleep(2000);
//      TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
 //     File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
 //     File destinationFile = new File("C:\\Users\\Admin\\eclipse-workspace\\MySeleniumPractice\\src\\test\\java\\MySeleniumPractice./Screenshot/"+"Facebook"+".png");
   //   FileHandler.copy(sourceFile, destinationFile);
     
//	  Robot robot = new Robot();
//	  driver.findElement(By.id("email"));
//	  Thread.sleep(2000);
//	  robot.mouseMove(1000, 200);
//	  Thread.sleep(3000);
      
      
//	  robot.mouseWheel(2);
//	  Thread.sleep(3000);
//	  
//	  robot.keyPress(KeyEvent.VK_CAPS_LOCK);
//	  robot.keyPress(KeyEvent.VK_N);
//	  robot.keyRelease(KeyEvent.VK_N);
//	  robot.keyPress(KeyEvent.VK_V);
//	  robot.keyRelease(KeyEvent.VK_V);
//	  Thread.sleep(3000);
	          
	}

}

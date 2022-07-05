package MySeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Handling_Frames {
	
@Test

public void handling_Frames_Using_Index_Of_The_Frame() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("file:///C:/Users/Admin/Desktop/Page2.html");
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    System.out.println(driver.getTitle());
    //using index of the frame - [ int value] [ index of frames starts with zero]
    driver.switchTo().frame(0);
    driver.findElement(By.id("t1")).sendKeys("vijju");
    Thread.sleep(2000);
    driver.switchTo().defaultContent();
    driver.findElement(By.id("t2")).sendKeys("vijji");
    Thread.sleep(2000);
   driver.close();
  }
  

}

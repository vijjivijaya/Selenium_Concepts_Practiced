package MySeleniumPractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MouseAndKeyboardOperations {

	@Test
	
	public void mouse_Keyboard() throws InterruptedException, AWTException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
		  driver.manage().window().maximize();
		  
		  driver.findElement(By.id("email")).sendKeys("vijaya");
		  Thread.sleep(3000);
		  Robot robot = new Robot();
		  driver.findElement(By.id("email"));
		  Thread.sleep(5000);
		  robot.mouseMove(600, 500);
		  Thread.sleep(5000);
	    //  robot.mouseWheel(2);
		//  Thread.sleep(3000);
	
		  robot.keyPress(KeyEvent.VK_CAPS_LOCK);
		  robot.keyPress(KeyEvent.VK_N);
		  Thread.sleep(2000);
		  robot.keyRelease(KeyEvent.VK_N);
		  Thread.sleep(2000);
		  robot.keyPress(KeyEvent.VK_V);
		  Thread.sleep(2000);
		  robot.keyRelease(KeyEvent.VK_V);
		  Thread.sleep(3000);	  
		  
	}
}

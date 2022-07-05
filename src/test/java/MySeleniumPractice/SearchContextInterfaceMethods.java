package MySeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchContextInterfaceMethods {
	    @Test
	    
	public void main() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.facebook.com");
		  driver.manage().window().maximize();
		  //findElement
//		  WebElement we = driver.findElement(By.partialLinkText("Create"));
//		  we.click();
	//       Thread.sleep(2000);
//  	   driver.findElement(By.name("firstname")).sendKeys("vijju");
//	       Thread.sleep(2000);
//	       //findElements
//	       driver.findElements(By.name("sex")).get(0).click();
//	       Thread.sleep(2000);   
//	       driver.close();
		  driver.get("https://mail.google.com/mail/u/0/#inbox");
		  driver.manage().window().maximize();
		  WebElement we = driver.findElement(By.tagName("input"));
		  we.sendKeys("vijaya.kadiyala@gmail.com");
		  Thread.sleep(2000);
		  we.clear();
		  
  }
}

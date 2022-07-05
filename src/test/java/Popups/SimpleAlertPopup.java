package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SimpleAlertPopup {
	     @Test
	     
	      public void main() throws InterruptedException{
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver1_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.navigate().to("https://demoqa.com/alerts");
		  driver.manage().window().maximize();
		  driver.findElement(By.id("alertButton")).click();
		  Thread.sleep(4000);
		  Alert alert = driver.switchTo().alert();
		  alert.accept();
	    
	      }
	      
	      
		  
		  
		  

   
}
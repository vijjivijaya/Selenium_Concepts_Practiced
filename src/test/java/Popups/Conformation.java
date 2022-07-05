package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Conformation {
	@Test
	
	public void main() throws InterruptedException{
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver1_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.navigate().to("https://nxtgenaiacademy.com/alertandpopup/");
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//button[@name='confirmalertbox']")).click();
		  Thread.sleep(2000);
		  Alert conformationAlert = driver.switchTo().alert();
		  String alertText = conformationAlert.getText();
		  Thread.sleep(2000);
		  System.out.println("Alert text is " + alertText);
		  conformationAlert.accept();
		  Thread.sleep(2000);
		  driver.close();	  
		}
	
}

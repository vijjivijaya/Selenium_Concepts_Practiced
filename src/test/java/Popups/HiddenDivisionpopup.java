package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionpopup {
	
	public void main() throws InterruptedException{
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver1_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.navigate().to("https://www.cleartrip.com/");
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//div[contains(text(),'Thu, Mar 24')]")).click();
		  Thread.sleep(2000);
		  //Thread.sleep(2000);

  }
}
package Popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadPopup {
	@Test
	
	public void main() throws InterruptedException{
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver1_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.navigate().to("http://www.tinyupload.com/");
		  driver.manage().window().maximize();
		  Thread.sleep(2000);      	  

  }
}
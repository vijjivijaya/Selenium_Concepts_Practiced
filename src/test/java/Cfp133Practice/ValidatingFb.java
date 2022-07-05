package Cfp133Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ValidatingFb {
	@Test
	
	 public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
		  driver.manage().window().maximize();
	      driver.findElement(By.id("email")).sendKeys("vijayakadiyala.k@gmail.com");
	      Thread.sleep(2000);
	      driver.findElement(By.name("pass")).sendKeys("Vijju");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//button[@type='submit']")).submit();
	       Thread.sleep(2000);
	       //driver.findElement(By.partialLinkText("Forgotten")).click();
	       WebElement errorMsg = driver.findElement(By.partialLinkText("Forgotten"));
	       String error = errorMsg.getText();
	       System.out.println("error is:" +error);
	       Thread.sleep(2000);
	       //driver.quit();

	}
	

}

package Cfp133Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FaceBookRegistration {
	
	   @Test
	   public void test() throws InterruptedException {
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://www.facebook.com/");
	       Thread.sleep(2000);
	       driver.findElement(By.linkText("Create New Account")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.name("firstname")).sendKeys("Vijaya");
	       Thread.sleep(2000);
	       driver.findElement(By.name("lastname")).sendKeys("Kadiyala");
	       Thread.sleep(2000);
	       driver.findElement(By.name("reg_email__")).sendKeys("vijayakadiyala.k@gmail.com");
	       Thread.sleep(2000);
	       driver.findElement(By.name("reg_email_confirmation__")).sendKeys("vijayakadiyala.k@gmail.com");
	       Thread.sleep(2000);
	       driver.findElement(By.id("password_step_input")).sendKeys("Vijju@1998");
	       Thread.sleep(2000);
	       WebElement dayDrop = driver.findElement(By.id("day"));
	       Select day = new Select(dayDrop);
	       day.selectByIndex(28);
	       Thread.sleep(2000);
	       WebElement monthDrop = driver.findElement(By.id("month"));
	       Select month = new Select(monthDrop);
	       month.selectByIndex(3);
	       Thread.sleep(2000);
	       WebElement yearDrop = driver.findElement(By.xpath("//select[@title='Year']"));
	       Select year = new Select(yearDrop);
	       year.selectByVisibleText("1998");
	       Thread.sleep(2000);
	       //driver.findElement(By.xpath("//label[text()='Female']")).click();
	       driver.findElements(By.name("sex")).get(0).click();
	       Thread.sleep(2000);
	      // driver.findElement(By.xpath("//button[@type='submit']")).submit();
	       
	       
	   }
}


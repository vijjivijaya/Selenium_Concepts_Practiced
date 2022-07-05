package Cfp133Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FaceBookLogin {
	 @Test
	   public void test() throws InterruptedException {
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver1_win32\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://www.facebook.com/");
	       Thread.sleep(2000);
	       driver.findElement(By.id("email")).sendKeys("vijayakadiyala.k@gmail.com");
	       Thread.sleep(2000);
	       driver.findElement(By.name("pass")).sendKeys("Vijju@1998");
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//button[@type='submit']")).submit();
	       Thread.sleep(2000);
//	       driver.findElement(By.className("a8c37x1j ms05siws hwsy1cff b7h9ocf4 rs22bh7c fzdkajry jnigpg78 odw8uiq3")).click();
	 }
}

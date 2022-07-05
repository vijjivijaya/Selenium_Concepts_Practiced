package MySeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TypesOfWaits {
	
	@Test
	public void implicit() {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver_win32 (1)\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://www.facebook.com/");
	       driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	       driver.manage().window().maximize();
	       System.out.println(driver.getTitle());
	       driver.findElement(By.linkText("Create New Account")).click();
	       driver.findElement(By.name("firstname")).sendKeys("Vijaya");
	       driver.findElement(By.name("lastname")).sendKeys("Kadiyala");
	}

}

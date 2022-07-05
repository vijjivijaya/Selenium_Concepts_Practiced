package MySeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebdriverInterfaceMethods {
	@Test
	
	public void main() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  //get
		  driver.get("https://www.facebook.com");
		  //manage
		  Thread.sleep(4000);
		   driver.manage().window().maximize();
		  //getTitle
		  System.out.println(driver.getTitle());
		  //getCurrentUrl
		  System.out.println(driver.getCurrentUrl());
		  //getPageSource
		  System.out.println(driver.getPageSource());
		  Thread.sleep(2000);
		  //navigate.to
		  driver.navigate().to("https://www.amazon.in/");
		  Thread.sleep(3000);
		  //navigate.refresh
		  driver.navigate().refresh();
		  Thread.sleep(2000);
		  //navigate.back
		  driver.navigate().back();
		  Thread.sleep(2000);
		  //navigate.forward
		  driver.navigate().forward();
		  Thread.sleep(3000);
		  //switchTo
		  driver.switchTo();
		  Thread.sleep(2000);
		  //quit
		  driver.quit();
		  
}
}
package ActionClsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseOperations {
@Test
	
	public void dragAndDrop() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.navigate().to("https://jqueryui.com/droppable");
		  driver.manage().window().maximize();
		  driver.switchTo().frame(0);
		  WebElement pick = driver.findElement(By.id("draggable"));
		  WebElement  drop = driver.findElement(By.id("droppable"));
		  Thread.sleep(3000);
		  Actions action = new Actions(driver);
		//  action.dragAndDrop(src, des).perform();
		 // action.clickAndHold(pick.moveToElement(drop).release().perform());
		  action.clickAndHold(pick).perform();
		  action.moveToElement(drop).release().perform();
          driver.close();
}

}

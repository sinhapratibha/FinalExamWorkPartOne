package FinalProject;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

		WebDriver driver;
		
		@Before
		public void init() {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pratibha\\PS-Selenium-eclipse-workspace\\session4\\driver\\chromedriver5.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.get("https://techfios.com/test/101/");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			//driver.findElement(By.name("todo[0]")).click();
			//driver.findElement(By.name("todo[1]")).click();
			//driver.findElement(By.name("todo[2]")).click();
			
			driver.findElement(By.cssSelector("[name=allbox]")).click();
		}
		
		@Test
		public void toggleCheckTest() throws InterruptedException
		{
			//Junit test to check 'toggle all' button
			
			driver.findElement(By.xpath("/html/body/div[3]/input[3]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[3]/input[3]")).click();
			
			//Junit test to check clickable removable of a single checkbox
			
			driver.findElement(By.name("todo[1]")).click();
			driver.findElement(By.xpath("/html/body/div[3]/input[1]")).click();
			
			//Junit test to check clickable removal of all the checked boxes
			
			driver.findElement(By.xpath("/html/body/div[3]/input[3]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[3]/input[1]")).click();
		}
}

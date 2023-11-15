package lao.testleafground;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T00_TestCase {
	
	WebDriver driver=null;
	
	@Before
	public void beforeTest() throws InterruptedException {
		//
		driver = new ChromeDriver();
		driver.get("https://www.leafground.com/");
		Thread.sleep(Duration.ofSeconds(3));
		driver.manage().window().maximize();
	}
	
	@After
	public void afterTest() throws InterruptedException {
		//
		Thread.sleep(Duration.ofSeconds(3));
		driver.quit();
	}
	
	@Test
	public void selectFromMenu() throws InterruptedException {
		//
		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("//span[text()='Text Box']")).click();
		Thread.sleep(Duration.ofSeconds(2));
		//

	}
	
}

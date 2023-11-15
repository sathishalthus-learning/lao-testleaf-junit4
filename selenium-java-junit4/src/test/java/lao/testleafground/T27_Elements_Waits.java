package lao.testleafground;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class T27_Elements_Waits {

	WebDriver driver = null;

	@Before
	public void beforeTest() throws InterruptedException {
		//
		driver = new ChromeDriver();
		driver.get("https://www.leafground.com/");
		driver.manage().window().maximize();
		Thread.sleep(Duration.ofSeconds(3));
	}

	@After
	public void afterTest() throws InterruptedException {
		//
		Thread.sleep(Duration.ofSeconds(3));
		driver.quit();
	}

//	@Test
//	public void waitForVisibility() throws InterruptedException {
//		//
//		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("//span[text()='Waits']")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		driver.findElement(By.id("j_idt87:j_idt89")).click();
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='I am here']")));
//		System.out.println(driver.findElement(By.xpath("//span[text()='I am here']")).isDisplayed());
//	}

//	@Test
//	public void waitForInvisibility() throws InterruptedException {
//		//
//		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("//span[text()='Waits']")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//	}
	
	@Test
	public void waitForClickability() throws InterruptedException {
		//
		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("//span[text()='Waits']")).click();
		Thread.sleep(Duration.ofSeconds(2));
		//
	}
	
	@Test
	public void waitForChange() throws InterruptedException {
		//
		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("//span[text()='Waits']")).click();
		Thread.sleep(Duration.ofSeconds(2));
		//
	}
}

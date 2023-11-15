package lao.testleafground;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class T22_Elements_Button {
	
	WebDriver driver=null;
	
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
//	public void clickAndConfirmTitle() throws InterruptedException {
//		//
//		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("//span[text()='Button']")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		driver.findElement(By.id("j_idt88:j_idt90")).click();
//		System.out.println(driver.getTitle());
//	}
	
//	@Test
//	public void disabledButton() throws InterruptedException {
//		//
//		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("//span[text()='Button']")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		System.out.println(driver.findElement(By.id("j_idt88:j_idt92")).isEnabled());
//	}
	
//	@Test
//	public void getPositionOfButton() throws InterruptedException {
//		//
//		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("//span[text()='Button']")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		Point points = driver.findElement(By.id("j_idt88:j_idt94")).getLocation();
//		System.out.println("X Position " + points.getX());
//		System.out.println("Y Position " + points.getY());
//	}
	
//	@Test
//	public void findTheColorOfTheButton() throws InterruptedException {
//		//
//		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("//span[text()='Button']")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		System.out.println("Color " + driver.findElement(By.id("j_idt88:j_idt96")).getCssValue("color"));
//	}
	
//	@Test
//	public void findTheHeightAndWidthOfButton() throws InterruptedException {
//		//
//		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("//span[text()='Button']")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		System.out.println("Height " + driver.findElement(By.id("j_idt88:j_idt98")).getCssValue("height"));
//		System.out.println("Width " + driver.findElement(By.id("j_idt88:j_idt98")).getCssValue("Width"));
//	}
	
	@Test
	public void moveMouseOverAndCheckColorChangingButton() throws InterruptedException {
		//
		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("//span[text()='Button']")).click();
		Thread.sleep(Duration.ofSeconds(2));
		//
		System.out.println("Previous Color " + driver.findElement(By.id("j_idt88:j_idt100")).getCssValue("color"));
		Actions mouseMove = new Actions(driver);
		mouseMove.moveToElement(driver.findElement(By.id("j_idt88:j_idt100"))).build().perform();
		System.out.println("Current Color " + driver.findElement(By.id("j_idt88:j_idt100")).getCssValue("color"));
	}
	
	@Test
	public void clickImageButtonAndClickAnyHiddentButton() throws InterruptedException {
		//
		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("//span[text()='Button']")).click();
		Thread.sleep(Duration.ofSeconds(2));
		//
		driver.findElement(By.id("j_idt88:j_idt102:imageBtn")).click();
		
	}
	
	@Test
	public void countRoundedButtons() throws InterruptedException {
		//
		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("//span[text()='Button']")).click();
		Thread.sleep(Duration.ofSeconds(2));
		//
		driver.findElement(By.id("j_idt88:j_idt102:imageBtn")).click();
		
	}
}

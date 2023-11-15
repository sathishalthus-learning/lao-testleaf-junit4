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
import org.openqa.selenium.support.ui.Select;

public class T25_Elements_RadioButton {
	
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
	
	@Test
	public void chooseFavoriteBrowser() throws InterruptedException {
		// 
		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("//span[text()='Radio Button']")).click();
		Thread.sleep(Duration.ofSeconds(2));
		//
		
	}
	
//	@Test
//	public void unSelectableButtons() throws InterruptedException {
//		// 
//		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("//span[text()='Radio Button']")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		
//	}
//	
//	@Test
//	public void defaultRadioSelection() throws InterruptedException {
//		// 
//		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("//span[text()='Radio Button']")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		
//	}
//	
//	@Test
//	public void selectNotSelectedRadio() throws InterruptedException {
//		// 
//		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("//span[text()='Radio Button']")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		
//	}
}

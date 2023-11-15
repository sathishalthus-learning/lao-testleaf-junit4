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

public class T24_Elements_Checkbox {
	
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
//	public void basicCheckbox() throws InterruptedException {
//		// 
//		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("//span[text()='Check Box']")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		System.out.println(driver.findElement(By.xpath("//span[text()='Basic']")).isSelected());
//		driver.findElement(By.xpath("//span[text()='Basic']")).click();
//		Thread.sleep(Duration.ofSeconds(1));
//		System.out.println(driver.findElement(By.xpath("//span[text()='Basic']")).isSelected());
//	}
	
//	@Test
//	public void ajaxCheckbox() throws InterruptedException {
//		// 
//		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("//span[text()='Check Box']")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		System.out.println(driver.findElement(By.xpath("//span[text()='Ajax']")).isSelected());
//		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
//		System.out.println(driver.findElement(By.xpath("//span[text()='Ajax']")).isSelected());
//	}
//	
//	@Test
//	public void chooseFavoriteLanguages() throws InterruptedException {
//		// 
//		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("//span[text()='Check Box']")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		System.out.println(driver.findElement(By.xpath("//span[text()='Ajax']")).isSelected());
//		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
//		System.out.println(driver.findElement(By.xpath("//span[text()='Ajax']")).isSelected());
//	}
//	
//	@Test
//	public void triStateCheckbox() throws InterruptedException {
//		// 
//		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("//span[text()='Check Box']")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		System.out.println(driver.findElement(By.xpath("//span[text()='Ajax']")).isSelected());
//		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
//		System.out.println(driver.findElement(By.xpath("//span[text()='Ajax']")).isSelected());
//	}
//	
//	@Test
//	public void toggleSwitch() throws InterruptedException {
//		// 
//		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("//span[text()='Check Box']")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		System.out.println(driver.findElement(By.xpath("//span[text()='Ajax']")).isSelected());
//		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
//		System.out.println(driver.findElement(By.xpath("//span[text()='Ajax']")).isSelected());
//	}
//	
//	@Test
//	public void disabledCheckbox() throws InterruptedException {
//		// 
//		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("//span[text()='Check Box']")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		System.out.println(driver.findElement(By.xpath("//span[text()='Ajax']")).isSelected());
//		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
//		System.out.println(driver.findElement(By.xpath("//span[text()='Ajax']")).isSelected());
//	}
//	
//	@Test
//	public void selectMultiple() throws InterruptedException {
//		// 
//		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("//span[text()='Check Box']")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		System.out.println(driver.findElement(By.xpath("//span[text()='Ajax']")).isSelected());
//		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
//		System.out.println(driver.findElement(By.xpath("//span[text()='Ajax']")).isSelected());
//	}
}

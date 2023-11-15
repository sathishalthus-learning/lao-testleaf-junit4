package lao.testleafground;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T31_Tables_Table {
	
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
	
//	@Test
//	public void sortTable() throws InterruptedException {
//		//
//		driver.findElement(By.xpath("//i[@class='pi pi-table layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("(//span[text()='Table'])[2]")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		driver.findElement(By.id("form:j_idt89:j_idt92")).click();
//	}
	
//	@Test
//	public void moveNext() throws InterruptedException {
//		//
//		driver.findElement(By.xpath("//i[@class='pi pi-table layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("(//span[text()='Table'])[2]")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		driver.findElement(By.cssSelector(".ui-paginator-next")).click();
//	}
	
//	@Test
//	public void moveLast() throws InterruptedException {
//		//
//		driver.findElement(By.xpath("//i[@class='pi pi-table layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("(//span[text()='Table'])[2]")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		driver.findElement(By.cssSelector(".ui-paginator-last")).click();
//	}
	
//	@Test
//	public void moveToPage() throws InterruptedException {
//		//
//		driver.findElement(By.xpath("//i[@class='pi pi-table layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("(//span[text()='Table'])[2]")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		driver.findElement(By.xpath("//a[text()='3']")).click();
//	}
	
//	@Test
//	public void moveToPage() throws InterruptedException {
//		//
//		driver.findElement(By.xpath("//i[@class='pi pi-table layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("(//span[text()='Table'])[2]")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		driver.findElement(By.xpath("//a[text()='3']")).click();
//	}
	
//	@Test
//	public void searchTable() throws InterruptedException {
//		//
//		driver.findElement(By.xpath("//i[@class='pi pi-table layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("(//span[text()='Table'])[2]")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		driver.findElement(By.id("form:j_idt89:globalFilter")).sendKeys("Adam");
//	}
	
	@Test
	public void readValuesFromTable() throws InterruptedException {
		//
		driver.findElement(By.xpath("//i[@class='pi pi-table layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("(//span[text()='Table'])[2]")).click();
		Thread.sleep(Duration.ofSeconds(2));
		//
		driver.findElement(By.id("form:j_idt89:globalFilter")).sendKeys("Adam");
		System.out.println(driver.findElement(By.xpath("//tr/td[2]")).getText());
		
	}
}

package lao.testleafground;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T11_Browser_Alerts {
	
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
//	public void simpleAlert() throws InterruptedException {
//		//
//		driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("//span[text()='Alert']")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		driver.findElement(By.id("j_idt88:j_idt91")).click();
//		Alert simpleAlert = driver.switchTo().alert();
//		Thread.sleep(Duration.ofSeconds(1));
//		simpleAlert.accept();
//	}
	
//	@Test
//	public void confirmAlert() throws InterruptedException {
//		//
//		driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("//span[text()='Alert']")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		driver.findElement(By.id("j_idt88:j_idt93")).click();
//		Alert confirmAlert = driver.switchTo().alert();
//		Thread.sleep(Duration.ofSeconds(1));
//		confirmAlert.dismiss();
//	}
	
//	@Test
//	public void promptAlert() throws InterruptedException {
//		//
//		driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("//span[text()='Alert']")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		driver.findElement(By.id("j_idt88:j_idt104")).click();
//		Alert promptAlert = driver.switchTo().alert();
//		promptAlert.sendKeys("Selenium");
//		Thread.sleep(Duration.ofSeconds(2));
//		promptAlert.accept();
//	}
	
//	@Test
//	public void simpleSweetAlert() throws InterruptedException {
//		//
//		driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("//span[text()='Alert']")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		driver.findElement(By.id("j_idt88:j_idt95")).click();
//		Thread.sleep(Duration.ofSeconds(1));
//		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
//	}

//	@Test
//	public void modalSweetAlert() throws InterruptedException {
//		//
//		driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("//span[text()='Alert']")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		driver.findElement(By.id("j_idt88:j_idt100")).click();
//		Thread.sleep(Duration.ofSeconds(1));
//		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
//	}
	
//	@Test
//	public void confirmationSweetAlert() throws InterruptedException {
//		//
//		driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("//span[text()='Alert']")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		driver.findElement(By.id("j_idt88:j_idt106")).click();
//		Thread.sleep(Duration.ofSeconds(1));
//		driver.findElement(By.xpath("//span[text()='Yes']")).click();
//	}
	
	@Test
	public void maximizeMinimizeAlert() throws InterruptedException {
		//
		driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("//span[text()='Alert']")).click();
		Thread.sleep(Duration.ofSeconds(2));
		//
		driver.findElement(By.id("j_idt88:j_idt111")).click();
		Thread.sleep(Duration.ofSeconds(1));
		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt112\"]/div[1]/a[1]/span")).click();
	}
}

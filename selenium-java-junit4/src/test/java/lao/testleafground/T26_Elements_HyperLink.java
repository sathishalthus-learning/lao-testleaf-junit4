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

public class T26_Elements_HyperLink {

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
//	public void takeMeToDashboard() throws InterruptedException {
//		// 
//		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("//span[text()='Hyper Link']")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/a")).click();
//		System.out.println(driver.findElement(By.className("route-bar-breadcrumb")).getText());
//	}

//	@Test
//	public void duplicateLink() throws InterruptedException {
//		// 
//		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("//span[text()='Hyper Link']")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[2]/div[1]/div/div/a")).click();
//		System.out.println(driver.findElement(By.className("route-bar-breadcrumb")).getText());
//	}

//	@Test
//	public void findMyDestinationWithoutClicking() throws InterruptedException {
//		//
//		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("//span[text()='Hyper Link']")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		WebElement link = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[2]/div/div/a"));
//		System.out.println(link.getAttribute("href"));
//	}
	
//	@Test
//	public void amIaBrokenLink() throws InterruptedException {
//		//
//		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("//span[text()='Hyper Link']")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		WebElement link = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[3]/div/div/a"));
//	}
	
//	@Test
//	public void countLinks() throws InterruptedException {
//		//
//		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("//span[text()='Hyper Link']")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		driver.findElement(By.linkText("How many links in this page?")).click();
//		System.out.println(driver.findElements(By.tagName("a")).size());
//	}
	
	@Test
	public void countLayoutLinks() throws InterruptedException {
		//
		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("//span[text()='Hyper Link']")).click();
		Thread.sleep(Duration.ofSeconds(2));
		//
		driver.findElement(By.linkText("How many links in this layout?")).click();
		System.out.println(driver.findElements(By.tagName("a")).size());
	}

}

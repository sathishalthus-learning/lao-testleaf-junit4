package lao.testleafground;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T12_Browser_Frames {
	
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
//	public void insideFrame() throws InterruptedException {
//		//
//		driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("//span[text()='Frame']")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		driver.switchTo().frame(0);
//		driver.findElement(By.id("Click")).click();
//		
//	}
	
//	@Test
//	public void nestedFrame() throws InterruptedException {
//		//
//		driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("//span[text()='Frame']")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		driver.switchTo().frame(2);
//		driver.switchTo().frame("frame2");
//		driver.findElement(By.id("Click")).click();	
//	}
	
	@Test
	public void countFrames() throws InterruptedException {
		//
		driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("//span[text()='Frame']")).click();
		Thread.sleep(Duration.ofSeconds(2));
		//
		System.out.println("Frame Count :"+driver.findElements(By.tagName("iframe")).size());
	}


}

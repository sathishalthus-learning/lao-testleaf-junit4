package lao.testleafground;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T13_Browser_Windows {
	
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
//	public void confirmWindowOpens() throws InterruptedException {
//		//
//		driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("//span[text()='Window']")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		driver.findElement(By.id("j_idt88:new")).click();
//		System.out.println("Opened windows : "+ driver.getWindowHandles().size());
//	}
	
//	@Test
//	public void countWindowTabs() throws InterruptedException {
//		//
//		driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("//span[text()='Window']")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		driver.findElement(By.id("j_idt88:j_idt91")).click();
//		System.out.println("Opened Window Tabs : "+ driver.getWindowHandles().size());
//	}

	@Test
	public void closeWindowTabsExceptParent() throws InterruptedException {
		//
		driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("//span[text()='Window']")).click();
		Thread.sleep(Duration.ofSeconds(2));
		//
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.id("j_idt88:j_idt93")).click();
		
		for (String windowHandle : driver.getWindowHandles()) {
			if(!windowHandle.contentEquals(parentWindow)) {
				driver.switchTo().window(windowHandle);
				driver.close();
			}
		}
		//driver.switchTo().defaultContent();
		//driver.switchTo().window(parentWindow);
	}
	
	@Test
	public void waitForWindowsToOpen() throws InterruptedException {
		//
		driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("//span[text()='Window']")).click();
		Thread.sleep(Duration.ofSeconds(2));
		//
		// wait for windows
		

		}
}

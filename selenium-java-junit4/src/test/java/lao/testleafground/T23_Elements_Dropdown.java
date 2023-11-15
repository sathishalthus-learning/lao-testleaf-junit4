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

public class T23_Elements_Dropdown {
	
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
//	public void selectAutomationTool() throws InterruptedException {
//		// select by visible text
//		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("//span[text()='Dropdown']")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		Select automationTools = new Select (driver.findElement(By.xpath("//select[@class='ui-selectonemenu']")));
//		automationTools.selectByVisibleText("Selenium");
//		Thread.sleep(Duration.ofSeconds(2));
//	}
	
//	@Test
//	public void selectPreferredCountry() throws InterruptedException {
//		// select by value
//		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("//span[text()='Dropdown']")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		driver.findElement(By.xpath("//*[@id=\"j_idt87:country_input\"]")).click();
//		Select favoriteCountry = new Select (driver.findElement(By.xpath("//*[@id=\"j_idt87:country_input\"]")));
//		favoriteCountry.selectByValue("Brazil");
//		Thread.sleep(Duration.ofSeconds(2));
//	}
	
//	@Test
//	public void selectPreferredCity() throws InterruptedException {
//		// select by index
//		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
//		driver.findElement(By.xpath("//span[text()='Dropdown']")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		//
//		driver.findElement(By.id("j_idt87:country_input")).click();
//		Select preferredCity = new Select (driver.findElement(By.id("j_idt87:country_input")));
//		preferredCity.selectByValue("Brazil");
//		Thread.sleep(Duration.ofSeconds(2));
//	}
	
	@Test
	public void chooseTheCourses() throws InterruptedException {
		// select by index
		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("//span[text()='Dropdown']")).click();
		Thread.sleep(Duration.ofSeconds(2));
		//
		driver.findElement(By.id("j_idt87:auto-complete_hinput")).click();
		Select preferredCity = new Select (driver.findElement(By.id("j_idt87:country_input")));
		preferredCity.selectByValue("Brazil");
		Thread.sleep(Duration.ofSeconds(2));
	}
	
	@Test
	public void chooseRandonLanguage() throws InterruptedException {
		// select by index
		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("//span[text()='Dropdown']")).click();
		Thread.sleep(Duration.ofSeconds(2));
		//
		driver.findElement(By.id("j_idt87:auto-complete_hinput")).click();
		Select preferredCity = new Select (driver.findElement(By.id("j_idt87:country_input")));
		preferredCity.selectByValue("Brazil");
		Thread.sleep(Duration.ofSeconds(2));
	}
	
	@Test
	public void chooseOptionTwoIrrespectively() throws InterruptedException {
		// select by index
		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("//span[text()='Dropdown']")).click();
		Thread.sleep(Duration.ofSeconds(2));
		//
		driver.findElement(By.id("j_idt87:auto-complete_hinput")).click();
		Select preferredCity = new Select (driver.findElement(By.id("j_idt87:country_input")));
		preferredCity.selectByValue("Brazil");
		Thread.sleep(Duration.ofSeconds(2));
	}
}
